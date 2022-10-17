package com.dummy.demo;

import java.util.Scanner;

public class CheckANumberPalindromOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int cnum=num;
		int rvs=0;
		while(num>0)//12321>0 //1232>0
		{
			int ld=num%10;//1 //2
			rvs=rvs*10+ld;//1//12
			num=num/10;//1232//
		}
		if(cnum==rvs)
			System.out.println(cnum+" is a palindrom");
		else
			System.out.println(cnum+" is not a palindrom");
	}

}
