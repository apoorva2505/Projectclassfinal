package org.sample;

public class PatternLoop {
	public static void main(String[] args) {
		int i,j,rows=5;
		for(i=0; i<rows; i++) {
			for(j=0; j<=i;j++) {
				System.out.println("*");
			}
			System.out.println();
			
		}
	}

}
