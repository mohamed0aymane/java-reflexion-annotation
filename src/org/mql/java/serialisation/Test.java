package org.mql.java.serialisation;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.mql.java.reflection.models.Product;

public class Test {

	public Test() {
		 exp01();
	}

	void exp01() {
		//tous les composants swing sont serialisable
		
		try{
			ObjectOutputStream out=new ObjectOutputStream(
		
				new FileOutputStream("resources/products.data")
				);
			Product p1=new Product(101,"Clavier",380);
			out.writeObject(p1);//serialisation de l'objet p1;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	void exp02() {
		ObjectInputStream in;
		//deserialisation
	}

	public static void main(String[] args) {

		new Test();
	}

}
