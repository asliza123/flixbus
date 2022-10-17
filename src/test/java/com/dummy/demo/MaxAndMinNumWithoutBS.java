package com.dummy.demo;

public class MaxAndMinNumWithoutBS {

	public static void main(String[] args) {

		int arr[]= {100,20,30,900,10,50,40};
		int fmax=0;
		int smax=0;
		for(int i=0;i<arr.length;i++)
		{
			if(fmax<arr[i])
			{
				smax=fmax;
				fmax=arr[i];
			}
			else if(smax<arr[i])
			{
				smax=arr[i];
			}
			
		}
		System.out.println("1st max is "+fmax);
		System.out.println("2nd max is "+smax);
	}

}
