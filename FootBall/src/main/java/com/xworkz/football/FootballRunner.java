package com.xworkz.football;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FootballRunner {

	public static void main(String[] args) {
		
		ApplicationContext container =  new ClassPathXmlApplicationContext("config.xml");
		 System.out.println(container);
		 Basketball basketball = container.getBean(Basketball.class);
		 System.out.println(basketball);
		 
	}

}
