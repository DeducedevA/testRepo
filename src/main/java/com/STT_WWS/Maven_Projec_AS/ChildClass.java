package com.STT_WWS.Maven_Projec_AS;

public class ChildClass extends ParentClass{

	public void testdata() {
		System.out.println("TestData");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass a = new ChildClass();
		a.getData();
		
		ChildClass b = new ChildClass();
		b.testdata();
		
		
		
	}

}
