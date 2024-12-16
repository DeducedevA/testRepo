package com.STT_WWS.Maven_Projec_AS;

public class ForLoop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum =0;
//		for (int i=0; i<=10; i++) {
//		   sum+= i;
//		   
//		}
//		System.out.println("sum of 10 natural numbers: "+sum);
		int[] arr = {1, 2, 3, 4, 5};
		
		int max = arr[0];
		for (int i=1; i<arr.length; i++) {
			if (arr[i]>max){
			max =arr[i];
			}
		}
		System.out.println("Max number is "+max);
		
		int even = 0;
		int odd = 0;
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i]%2 == 0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("Even "+even);
		System.out.println("odd "+odd);
		
	}

}
