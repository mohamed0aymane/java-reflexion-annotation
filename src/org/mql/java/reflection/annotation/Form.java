package org.mql.java.reflection.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//Target est une notation predefini qui permet de determiner le type
//(value = { ElementType.TYPE,ElementType.FIELD})  //c'est de type element type (un tableau d'element 
//ElementType c'est une enumeration

/*on 2 raccourcie
 * 1) un tableau a un attribut d'un seul element pas besion d'utilise les accolades
/2)si notre annotation est compose d'un seul attribut et que cetee attribut nomme value pas besion de presiser value*/
//on trois niveau:niveau source comme un commentaire niveAU .class et niveau execution

@Target	(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)//POUR PAS presicer comme un commentaire
public @interface Form {
				//les attributs d'une annotation est defini comme une methode
				//les types autorises avec les attributs d'annotation sont type primitives ou type string ou type enummere ou annotation ou tableau de ceci
	String title() default "" ;//pour qu il soit optional on ajoute default "" exemple  String title() default ""; 
	int labelSize() default 100;
}
