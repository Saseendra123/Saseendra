package edu.jspiders.ComponentScan.Util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.ComponentScan.beans.Pen;

public class ComponentScan 
{
	public static void main(String[] args) 
	{
		
	
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
		Pen pen=context.getBean(Pen.class);
		System.out.println(pen);
		context.close();

	
	
	
	}
	

}
