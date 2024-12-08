package org.mql.java.reflection;
import javax.swing.*;

import org.mql.java.actions.EditAction;
import org.mql.java.actions.FileAction;
import org.mql.java.reflection.models.Product;
import org.mql.java.reflection.models.Technology;
import org.mql.java.reflection.ui.Form;
import org.mql.java.reflection.ui.Menu;
//class pour tester forme generator
public class AnnotationsExamples extends JFrame {

	public AnnotationsExamples() {
		exp03();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//on utilise pack les autres frame qui s'adapte avec formgenerator
		//pack();
		setSize(500,300);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	void exp01() {
		Form f= new Form("Nouveau Produit",120);
		f.add("Identificateur",10);
		f.add("Designation",30);
		f.add("Prix Unitaire",15);
		setContentPane(f);
	
	}
	
	void exp02() {
	 Form f=FormGenerator.generate(new Product());
	 setContentPane(f);
	}
	//lors d'affiche les methodes de FileAction ne s'affiche pas dans le meme ordre
	 void exp03() {
		Menu menu=new Menu();
		menu.add(new FileAction());
		menu.add(new EditAction());
		setJMenuBar(menu);
		
	}	
	public static void main(String[] args) {
	 new AnnotationsExamples();
	}
}
