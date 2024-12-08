package org.mql.java.reflection;

import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

import org.mql.java.reflection.dao.DataSource;
import org.mql.java.reflection.models.Product;
import org.mql.java.reflection.models.Technology;

public class Examples {
	//on trois source de reflexion
	public Examples() {
		exp03();
		
	}
	
	 //1 ere source c'est l'objet
   void exp01() {
	   Technology t1=new Technology(101,"Fortran",1957,"John Backus");
	   
	   scan(t1);
	   System.out.println(t1);
   }
   void scan(Object obj) {
		
	   Class<?> cls=obj.getClass();
	   System.out.println("Name :"+cls.getName());
	   System.out.println("Simple Name :"+cls.getSimpleName());
	   Field fields[]= cls.getDeclaredFields();
	   for(Field field:fields) {
		   try {
			   //rendre les attributs accessible et utilise uniquemenet pour get(obj)
			  field.setAccessible(true);
			   System.out.println("- "+field.getName()+" : " +field.get(obj));
			   if(field.getName().equals("description")) {
				   field.set(obj,"Ceci est une description");
			   }
			   field.setAccessible(false);
		   }catch(Exception e) {
			   System.out.println("Erreur : "+ e.getMessage());
		   }
	   }
	}
   
   
   //2 eme source c'est une classe
   void exp02() {
	  Class<?> cls= Product.class; 
	  Method methods[]=cls.getDeclaredMethods();
	  for(Method method:methods) {
		  System.out.println("- " + method.getName() +"()");
	  }
   }
   
   //3 eme source nom de classe
   void exp03() {
	   Properties props=new Properties();
	   //java.io contient les classes qui gerent les entres-sorties reader writer inputstream outputstream
	   //pour serialiser ou stocker on utilise la classe object.outputstream
	  
	   try{
		   props.load(new FileReader("resources/application.properties"));//pour charger
	   }catch(Exception e) {
		   System.out.println("Erreur :" + e.getMessage());
	   }
	   System.out.println(props);
	   String ds=props.getProperty("data-source");
	   System.out.println("ds :"+ ds);
	   Class<?> cls=null;
	   DataSource dataSource=null;
	   try {
		   cls=Class.forName(ds);
		  dataSource=(DataSource)cls.getDeclaredConstructor().newInstance(null);

	  
	   }catch(Exception e) {
		   System.out.println("Erreur :" + e.getMessage());
	   }
	  if(dataSource !=null) {
		  dataSource.getConnection();
	  }
   }
	public static void main(String[] args) {
		new Examples();

	}

}
