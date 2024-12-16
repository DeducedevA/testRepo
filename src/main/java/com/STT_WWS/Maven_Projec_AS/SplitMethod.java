package com.STT_WWS.Maven_Projec_AS;

public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Cristrino ronaldo is the greatest of all the time";
		String[] splitString = s.split("the");
		System.out.println(splitString[0]);
		System.out.println(splitString[1]);
		System.out.println(splitString[2]);
		
		System.out.println(splitString[1].trim());
		System.out.println(splitString[2].trim());
		
		System.out.println("****************");
		
		for (int i = s.length()-1; i>=0; i--) {
			System.out.println(s.charAt(i));
		}
		

	}

}
