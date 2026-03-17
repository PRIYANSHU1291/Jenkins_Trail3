package com.Priyanshu.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("bean-config.xml");
    			
    	Student student = (Student)context.getBean("student");
    	Employee employee = (Employee)context.getBean("employee");
    	
    	System.out.println(student);
    	System.out.println(employee);
    }
}
