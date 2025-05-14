package com.SpringAnnotation.Stereotypes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Demo {
	
	
	@Value("101")
	private int id;
	@Value("Samarth")
	private String name;

   public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
public Demo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

   @Override
public String toString() {
	return "Demo [id=" + id + ", name=" + name + "]";
}
public int getId() {
	return id;
}
public void setId(final int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(final String name) {
	this.name = name;
}

   
   
}
