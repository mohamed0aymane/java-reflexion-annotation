package org.mql.java.reflection.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.border.*;




public class Form  extends JPanel{
	
	
	private static final long serialVersionUID = 1L;
	private String title;
	private int labelSize;
	
	private JPanel container;
	
	public Form(String title,int labelSize) {
		this.title=title;
		this.labelSize=labelSize;
		
		setLayout(new FlowLayout(FlowLayout.LEFT));//POUR LE fromulaire soit center
		container=new JPanel();
		container.setLayout(new BoxLayout(container,BoxLayout.Y_AXIS));
		container.setBorder(
				new TitledBorder(
						new LineBorder(Color.blue),
						" " + title + " "));
		add(container);
	}
	public void add(String label,int size) {
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel l1=new JLabel(label + " : ");
		JTextField t1=new JTextField(size);
		l1.setPreferredSize(new Dimension(labelSize,l1.getPreferredSize().height));
		p.add(l1);
		p.add(t1);
		container.add(p);
		
	}

}
