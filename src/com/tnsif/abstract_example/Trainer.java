package com.tnsif.abstract_example;

public abstract class Trainer {
	
	//Abstract method
	abstract void session();
	abstract void checks();
	
	//Normal method
	public void display()
	{
		System.out.println("TNS Capgemini Trainers..");
	}
	
}