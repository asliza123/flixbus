package com.dummy.demo;

import java.util.Scanner;

public class ShiftIndexBasedOnKey {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a key");
		int key=sc.nextInt();
		for(int i=0;i<key;i++)
		{
			int temp=arr[0];
			for(int j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
				
			}
			arr[arr.length-1]=temp;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		for(int i=0;i<key;i++)
		{
			int temp=arr[arr.length-1];
			for(int j=arr.length-1;j>=0;j--)
			{
				arr[arr.length-1-j]=arr[arr.length-2-j];
				
			}
			arr[0]=temp;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
