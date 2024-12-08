package org.mql.java.ennumeration;

public class Examples {

	public Examples() {
		exp01();
	}
	void exp01() {
		BasicColor c1=BasicColor.BLACK;
		System.out.println("c1 =" +c1);
		System.out.println(BasicColor.YELLOW.name());
		System.out.println(BasicColor.YELLOW.ordinal());
		System.out.println(BasicColor.BLACK.ordinal());//ordinal c'est l 'index
		System.out.println(BasicColor.RED);
		
		//d'apres le nom on veut obtener la chaine
		String color="GREEN";
		BasicColor c2=BasicColor.valueOf(color);
		System.out.println("c2 = " +c2);
		System.out.println(c2.getValue());
		
	}

	public static void main(String[] args) {
		new Examples();

	}

}
