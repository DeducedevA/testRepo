package com.STT_WWS.Maven_Projec_AS;

import java.util.Scanner;

public class Loop_Practice {

	public static void main(String[] args) {
//		int n = 0;
//		int result = 0;
		// TODO Auto-generated method stub
		
//		Even numbers in for loop
//		for (int i = 1; i<=100; i++) {
//			if (i%2 == 0) {
//				System.out.println(i);
//			}
//		}
		
		
//		Factorial number in while loop
//		  // Create a Scanner object for user input
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt the user to enter a positive integer
//        System.out.print("Enter a positive integer: ");
//        int number = scanner.nextInt();
//
//        // Check if the input is valid
//        if (number < 0) {
//            System.out.println("Please enter a positive integer.");
//        } else {
//            int factorial = 1; // Initialize the factorial result to 1
//            int i = number;    // Initialize the loop counter
//
//            // Calculate the factorial using a while loop
//            while (i > 0) {
//                factorial *= i; // Multiply the current value of i to the result
//                i--;            // Decrease i by 1
//            }
//
//            // Output the result
//            System.out.println("Factorial of " + number + " is: " + factorial);
//        }
//
//        // Close the scanner
//        scanner.close();
		
//		 Fibonacci  sequence
//	
//		 Scanner scanner = new Scanner(System.in);
//
//	        // Prompt the user for input
//	        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
//	        int number = scanner.nextInt();
//
//	        // Check if the user input is valid
//	        if (number <= 0) {
//	            System.out.println("Please enter a positive integer.");
//	        } else {
//	            // Initialize the first two terms of the Fibonacci sequence
//	            int firstTerm = 0, secondTerm = 1;
//
//	            System.out.println("Fibonacci Sequence:");
//
//	            for (int i = 1; i <= number; i++) {
//	                System.out.print(firstTerm + " ");
//
//	                // Calculate the next term
//	                int nextTerm = firstTerm + secondTerm;
//	                firstTerm = secondTerm;
//	                secondTerm = nextTerm;
//	            }
//	        }
//
//	        // Close the Scanner
//	        scanner.close();
		
//	//print number from 1 to 10 
//		for (int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
		
//	Write a program to find the sum of the first n natural numbers using a for loop, where n is provided by the user.
	
//		int sum = 0;
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter a natural number: ");
//		int n = scanner.nextInt();
//		
//		for (int i=1; i<=n; i++) {
//			sum = sum + i;
//			System.out.println(sum);
//		}
//		System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
//		scanner.close();
	  
////	Write a program that prints the multiplication table of a number provided by the user. For example, if the user inputs 5, it should print:
//	    int j= 0;
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter a number to print multiplication table: ");
//		int n = scanner.nextInt();
//		
//		for (int i=1; i<=10; i++) {
//			j = i * n;
//			System.out.println(n + "x" + i + " = " + j );
//		}
		
////		Write a program that prints a countdown from 10 to 1 using a while loop.
//		int i =10;
//		while ( i >=1) {
//			System.out.println(i);
//			i--;
//		}
		
//		Write a program that checks whether a number entered by the user is prime or not. 
//		A prime number is a number that is only divisible by 1 and itself.
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter a number to check it is Prime or not: ");
//		int n = scanner.nextInt();	
//		
//		if (isPrime(n)){
//			System.out.println(n + " is a prime number ");
//		}
//		else {
//			System.out.println(n + " is not a prime number ");
//		}
//		
			
////		Write a program that uses a for loop to print all even numbers between 1 and 50.
//		for (int i = 1; i<=50; i++) {
//			if (i%2 == 0) {
//				System.out.println(i);
//			}
//		}
		
//Write a program that takes an integer from the user and prints the reverse of the number. 
//		For example, if the user inputs 1234, the program should print 4321.
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter a integer to reverse: ");
		int n = scanner.nextInt();	
		
		for(int i =0; i>=n; i++) {
			System.out.println(i);
		}
		
		
		
		
	}
		
		}
	
	
	
			
		

