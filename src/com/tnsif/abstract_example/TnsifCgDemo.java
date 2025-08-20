package com.tnsif.abstract_example;

public class TnsifCgDemo {
public static void main(String[] args) {
		
		Trainer t=new softSkillTrainer();
		t.session();
		t.check();
		
		Trainer tt=new TechTrainer();
		tt.session();
		tt.check();

	}

}
