package org.mql.java.reflection.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.swing.*;

import org.mql.java.reflection.annotation.Controller;
//JMenuBar pour cree un menu bar et on Jmenu il s'accroche des Jmenu et chaque Jmenu contient un JmenuItem
public class Menu extends JMenuBar {
	
	private static final long serialVersionUID = 1L;
	private String path="resources/icons/";
	private String type=".gif";

	
	public Menu() {
	}
	public Menu(String m [][]) {
		for(int i=0;i<m.length;i++) {
			add(m[i]);
		}
	}
	public void add(String t[]) {
		JMenu m =new JMenu(t[0]);
		add(m);
		for(int i=1;i<t.length;i++) {
			ImageIcon icon=new ImageIcon(path + t[i] + type);
			JMenuItem item=new JMenuItem(t[i],icon);
			m.add(item);
		}
		
	}
	
	public void add(Object obj) {
		Class<?> cls=obj.getClass();
		Controller ctrl=cls.getDeclaredAnnotation(Controller.class);
		JMenu m =new JMenu(ctrl.value());
		add(m);
		Method methods[]=cls.getDeclaredMethods();
		for(Method method:methods) {
			ImageIcon icon=new ImageIcon(path + method.getName() + type);
			JMenuItem item=new JMenuItem(method.getName(),icon);
			m.add(item);
			item.addActionListener(new Action(obj,method));
		}
		
		
	}
	//avec l'introspection on peut tous recuperer
	private class Action implements ActionListener{
		private Object obj;
		private Method method;

		public Action(Object obj, Method method) {
			super();
			this.obj = obj;
			this.method = method;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				Object result=method.invoke(obj);
				System.out.println("result = "+ result);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
	}

}
