package org.mql.java.reflection.models;

import java.io.Serializable;

import org.mql.java.reflection.annotation.Form;
import org.mql.java.reflection.annotation.TextField;

@Form
public class Product implements Serializable {
	/**
	 il va pas marche car l'objet n'est pas serializable
	et une classe dite serialisable si la classe implements Serializable
	2 facons pour utiliser la serializable
	stocker dans une disque
	lorsque on veut envoyer un objet d'un client  a un sevreur il faut que la classe soit serializable
	tous class doit sense a etre serializable il doit avoir un numero de serie  pour gerer si on veut supprimer un objet ou modifier un objet 
	a chaque modification du classe on doit modifier le numero du serie
	l'operation inverse s'appelle diserializable
	 */
	private static final long serialVersionUID = 1L;
	
	@TextField(label="Identificateur",size=15)
	private int id;
	@TextField(label="Designation")
	private String name;
	@TextField(label="Prix")
	private double price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
