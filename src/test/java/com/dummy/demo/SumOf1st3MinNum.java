package com.dummy.demo;

public class SumOf1st3MinNum {

	public static void main(String[] args) {
		int arr[]= {20,30,10,50,40};
		int sum=0;
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
			
		}
		for(int i=0;i<3;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of three maximum number is: "+sum);
	}
	}


