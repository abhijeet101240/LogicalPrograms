package com.integ.programs;

public class Factors {

	public static void main(String[] args) {
	
		int no=10;
		System.out.println("The Factor of " + no + " are >> ");
		for(int i=1; i<=no ; i++) {
			
			if(no % i==0) {
				
				System.out.print( " " +i);
			}
		}
	}

}
