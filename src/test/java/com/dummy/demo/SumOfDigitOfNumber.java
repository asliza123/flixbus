package com.dummy.demo;

import java.util.Scanner;

public class SumOfDigitOfNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int s=sc.nextInt();
		int rs=s;
		int sum=0;
		while(s>0)
		{
			int ld=s%10;
			sum=sum+ld;
			s=s/10;
		}
		System.out.println("sum of all digits in "+rs+"="+sum);
	}

}
