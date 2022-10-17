package com.dummy.demo;

public class MaximumNumWithoutBubble {

	public static void main(String[] args) {

		int arr[]= {20,30,10,50,40};
		int max=arr[0];
		for(int i=1; i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("maximum number is: "+max);
	}

}
