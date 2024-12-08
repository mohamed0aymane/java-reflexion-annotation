package org.mql.java.actions;

import org.mql.java.reflection.annotation.Controller;

@Controller("File")
public class FileAction {

	public FileAction() {
		// TODO Auto-generated constructor stub
	}
	public String newFile() {
		System.out.println("Create a new File");
		return "new-file.jsp";
	}
	public String open() {
		System.out.println("Open a new File");
		return "open.jsp";
	}
	public String save() {
		System.out.println("Save a new File");
		return "save.jsp";
	}
	public String saveAs() {
		System.out.println("Save as a new File");
		return "save-as.jsp";
	}
	public String exit() {
		System.out.println("Exit the application");
		return "exit.jsp";
	}

}
