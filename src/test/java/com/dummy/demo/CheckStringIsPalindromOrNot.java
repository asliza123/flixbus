package com.dummy.demo;

import java.util.Scanner;

public class CheckStringIsPalindromOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		String rvs="";
		for(int i=0; i<ch.length/2; i++)
		{
			char temp=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=temp;
		}
		rvs=new String(ch);
		if(s.equals(rvs))
		{
			System.out.println(s +" is a palindrom");
		}
		else
			System.out.println(s+" is not a palindrom");
	}

}
