package com.Priyanshu.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {
public static void main(String[] args) {
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("annotation-config.xml");
    			
    	User bean = (User)context.getBean("user");
    	
    	System.out.println(bean);
    }

}
