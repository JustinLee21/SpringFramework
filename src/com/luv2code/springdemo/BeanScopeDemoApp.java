package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml"); 
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class); 
		Coach alphaCoach = context.getBean("myCoach", Coach.class); 
		
		//Validate if objects references are equal or not. 
		boolean result = (theCoach == alphaCoach); 
		System.out.println("\nAre the object references equal? " + result);
		
		//Are the objects stored in the same memory location?
		System.out.println("\nMemory location for theCoach: "+ theCoach);
		System.out.println("\nMemory location for alphaCoach" + alphaCoach);
		
		context.close(); 
	}

}
