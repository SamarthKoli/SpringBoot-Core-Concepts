package com.SpringAnnotation.Stereotypes;

import javax.management.loading.PrivateClassLoader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
	//Here We used AnnotationConfigApplicationContext instead of ClassPathXml to use Anntation based configuration
	 ApplicationContext ct=new AnnotationConfigApplicationContext(JavaConfig.class);
	 Demo demo=ct.getBean("getDemo",Demo.class);
	 
	 System.out.println(demo);
	 
	 
	 
	}

}
