package com.integ.programs;

public class ReverseNumber {
	
	public static void getReverseNumber(int n){
		
		int no=n;
		int rev=0;
		int rem=0;
		
		while(no != 0) {
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
			
		}
		System.out.println(rev);
		
	}
	
	
	public static void main(String[] args) {
		
		getReverseNumber(12345);
	
	
	
	}

}
