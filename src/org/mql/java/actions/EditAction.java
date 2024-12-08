package org.mql.java.actions;

import org.mql.java.reflection.annotation.Controller;

@Controller("Edit")
public class EditAction {

	public EditAction() {
		// TODO Auto-generated constructor stub
	}

	public String copy() {
		System.out.println("Copy");
		return	"copy.jsp";
	}
	public String cut() {
		System.out.println("Cut");
		return	"cut.jsp";
	}
	public String paste() {
		System.out.println("Paste");
		return	"paste.jsp";
	}
}
