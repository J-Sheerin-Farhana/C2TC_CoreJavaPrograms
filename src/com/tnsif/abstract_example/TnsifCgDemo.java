package com.tnsif.abstract_example;

public class TnsifCgDemo {

	public static void main(String[] args) 
	{
		Trainer t1=new SoftSkillTrainer();
		
		t1.display();
		t1.session();
		t1.checks();
		
	   System.out.println();
       Trainer t2=new TechTrainer();
		
        t2.display();
		t2.session();
		t2.checks();

	}

}