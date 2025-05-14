package com.SpringAnnotation.Component;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ct=new ClassPathXmlApplicationContext("com/SpringAnnotation/Component/autoconfig.xml");
		Student s1=ct.getBean("s1",Student.class);
		System.out.println(s1);
		System.out.println(s1.getAddress());
		
	}

}	
