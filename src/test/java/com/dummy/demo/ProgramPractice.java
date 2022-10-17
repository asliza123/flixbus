package com.dummy.demo;

import java.util.Scanner;

public class ProgramPractice {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string or number");
		String text=sc.nextLine();
		//Armstrong nymber
		/*int num=sc.nextInt();
		int conum=num;
		int count=countOfDigits(num);
		int sum=0;
		while(num>0)
		{
			int ld=num%10;
			int power=powerOfDigit(ld,count);
			sum=sum+power;
			num=num/10;
		}
		if(conum==sum)
			System.out.println(conum+" is an armstrong number");
		else 
			System.out.println(conum+" is not an armstrong number");
		*/
		//String rvs="";
		//Palindrom and reverse of a string
		/*char []ar=text.toCharArray();
		for(int i=0;i<=(ar.length-1)/2;i++)
		{
			char t=ar[i];
			ar[i]=ar[ar.length-1-i];
			ar[ar.length-1-i]= t;
		}
		rvs=new String(ar);
		System.out.println(rvs);
		if(rvs.equalsIgnoreCase(text))
		{
			System.out.println(text+" is a palindrom");
		}
		else
		{
			System.out.println(text+" is not a palindrom");
		}*/
		//Reverse of a string
		/*for(int i=text.length()-1;i>=0;i--)
		{
			int j=i;
			while(i>0 && text.charAt(i)!=' ')
			{
				i--;
			}
			int k=i+1;
			while(j>=k)
			{
				rvs=rvs+text.charAt(j);
				j--;
			}
			rvs=rvs+text.charAt(i);
		}
		*/
		//Reverse the word of a string
		/*for(int i=0; i<=text.length()-1;i++)
		{
			int j=i;
			while(i<text.length()-1 && text.charAt(i)!=' ')
			{
				i++;
			}
			int k=i-1;
			if(i==text.length()-1)
				rvs=rvs+text.charAt(i);
			while(k>=j)
			{
				rvs=rvs+text.charAt(k);
				k--;
			}
			if(i!=text.length()-1)
			rvs=rvs+text.charAt(i);
		}
		System.out.println("Reverse of '"+text+"' = "+rvs);
		*/
	}

	private static int powerOfDigit(int ld, int count) {
		int power=1;
		for(int i=0;i<count;i++)
		{
			power=power*ld;
		}
		return power;
	}

	private static int countOfDigits(int num) {
		int count=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		return count;
	}

}
