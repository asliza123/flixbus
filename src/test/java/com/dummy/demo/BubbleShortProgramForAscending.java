package com.dummy.demo;

import java.util.Arrays;

public class BubbleShortProgramForAscending{

	public static void main(String[] args) {
		int arr[]= {20,30,10,50,40};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int x=arr[i];
					arr[i]=arr[j];
					arr[j]=x;
				}
				
			}
			System.out.print(arr[i]+" ");
			
		}
		
		System.out.println();
		System.out.println("1st min number is "+arr[0]);
		System.out.println("2nd min number is "+arr[1]);
	}

}
