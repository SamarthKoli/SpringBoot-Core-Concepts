package com.SpringAnnotation.Stereotypes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//This class works as configuration class just like config.xml
@Configuration
public class JavaConfig {


	//Using Bean annotation to pass object to IOC Container 
	@Bean
  public Demo getDemo() {
		//Here we just need to return the object of class which we want to make Bean
	  return new Demo();
  }
}
