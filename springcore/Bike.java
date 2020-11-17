package com.spring.springcore;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	public void drive()
	{
		System.out.println("i am ridding a bike");
	}

	

}
