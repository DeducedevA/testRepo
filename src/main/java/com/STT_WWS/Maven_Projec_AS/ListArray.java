package com.STT_WWS.Maven_Projec_AS;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		array List
		List a = new ArrayList();
		a.add("CR7");
		a.add("alphy");
		a.add("Ronaldo");
		
//		System.out.println(a.get(1));
//		
		for (int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
//		to find using contains
       System.out.println(a.contains("CR7"));
       
       System.out.println("**********");
       
//       convert normal array to list array
       String[] name = {"ALphy", "Surya", "CR7"};
       
       List<String > nameArrayList = Arrays.asList(name);
       System.out.println(nameArrayList.contains("ALphy"));
       
       
      
       
	}
}


