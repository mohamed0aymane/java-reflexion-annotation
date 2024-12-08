package org.mql.java.ennumeration;
//on cree un type BasicColor

import java.awt.Color;

public enum BasicColor {
	//on a cree des constants de type BasicColor
	BLACK,
	WHITE(Color.white),
	BLUE(Color.blue),
	GREEN(Color.green),
	CYAN(Color.cyan),
	RED(Color.red),
	YELLOW(Color.yellow);
	
	//on ajoute une propriete value de type color
	private Color value=Color.black;
	
	//on a un constructeur prive car on peut pas instantie a l'interieur et on peut pas le mettre en public
	//si on fait public on sert a  d'instancier un type enumerique a l'exterieure et on peut pas
	//mais c'est un probleme resolue syntaxiquement
	private BasicColor() {
		
	}
	
	private BasicColor(Color value) {
		this.setValue(value);
	}

	public Color getValue() {
		return value;
	}

	public void setValue(Color value) {
		this.value = value;
	}
}
