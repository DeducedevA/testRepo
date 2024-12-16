package com.STT_WWS.Maven_Projec_AS;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		
	    int a = 0;
		System.out.print("Enter a number to view the tables: ");
		int n= Scanner.nextInt();
		
		for (int i = 1; i <=10; i++) {
			a = i * n;
			System.out.println(n + " x " + i + " = " + a);
		}
		
		
		
		

	}

}
