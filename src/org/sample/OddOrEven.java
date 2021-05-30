package org.sample;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("enter the number");
		
		int num= S.nextInt();
		//condition for checking odd or even
		if(num%2==0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");
		}
			
		
		
}
}
