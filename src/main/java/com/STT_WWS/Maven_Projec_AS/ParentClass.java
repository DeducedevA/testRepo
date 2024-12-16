package com.STT_WWS.Maven_Projec_AS;

public class ParentClass {

	
		String name = "Alphy";

		public void parentDemo()
		{
		System.out.println("Parent class construtor");
		}
		public void getData()
		{
		System.out.println("I am parent class");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass a = new ChildClass();
		a.parentDemo();
		
	}

	
	
}
