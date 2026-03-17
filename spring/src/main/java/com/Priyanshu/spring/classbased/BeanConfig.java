package com.Priyanshu.spring.classbased;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.Priyanshu.spring")
public class BeanConfig {
	
	@Bean
	public List<Integer> listProvider(){
		return List.of(1,2,3,4,5,6,7,8,9);
	}
	
	@Bean(name = "hero")
	public Bike bikeProvider() {
		Bike bike = new Bike();
		bike.setBikeId(129);
		bike.setBikeName("Hero Honda");
		bike.setColour("Grey");
		
		return bike;
		
	}

	
	
	
	
	
	
}
