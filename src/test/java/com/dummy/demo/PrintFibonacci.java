package com.dummy.demo;

public class PrintFibonacci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int sum;
		System.out.print(a+" "+b+" ");
		for(int i=0;i<10;i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			
		System.out.print(sum+" ");
			
		}
	}

}
