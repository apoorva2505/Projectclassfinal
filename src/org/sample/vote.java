package org.sample;

import java.util.Scanner;

public class vote {
	public static void main(String[] args) {
		Scanner I=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=I.nextInt();
		if(age<=18) {
			System.out.println("Your are eligible");
		}
		else {
			System.out.println("Your are not eligible");
		}
		
	    
	

}
}

