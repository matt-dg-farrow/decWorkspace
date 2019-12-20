package com.qa.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(DemoApplication.class, args);
		System.out.println(ac.getBean("currentTime"));
		System.out.println(ac.getBean("currentTime"));
		System.out.println(ac.getBean("currentTime"));
		System.out.println(ac.getBean("currentTime"));
		System.out.println(ac.getBean("currentTime"));
		System.out.println(ac.getBean("currentTime"));
		System.out.println(ac.getBean("currentTime"));
		System.out.println(ac.getBean("currentTime"));
		System.out.println(ac.getBean("currentTime"));
		System.out.println(ac.getBean("currentTime"));
		System.out.println(ac.getBean("currentTime"));
		System.out.println(ac.getBean("currentTime"));
		System.out.println(ac.getBean("currentTime"));
		System.out.println(ac.getBean("currentTime"));


		System.out.println();
		
		System.out.println(ac.getBean("currentTime2"));
		System.out.println(ac.getBean("currentTime2"));
		System.out.println(ac.getBean("currentTime2"));
		System.out.println(ac.getBean("currentTime2"));
		System.out.println(ac.getBean("currentTime2"));


	}

}
