package com.tnsif.Entity_example;

public class StudentEntity {
	private int sid;
	private String sname;
	
	//default constructor
	public StudentEntity()
	{
		this(11, "dhayalan");//calling parameterized constructors
		System.out.println("constructor called..'");
	}
	//Parameterized constructors
	public StudentEntity(int sid, String sname)
	{
		//this(); //calling default constructor
		this.sid=sid;
		this.sname=sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}

}
