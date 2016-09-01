package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		JavaCollections jc = (JavaCollections) context.getBean("javaCollections");
		
		jc.getCountryList();
		jc.getCountrySet();
		jc.getCountryMap();
		jc.getCountryProperties();		
	}
}
