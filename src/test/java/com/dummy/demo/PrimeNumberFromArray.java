package com.dummy.demo;

public class PrimeNumberFromArray {

	public static void main(String[] args) {
		int []a= {3,4,5,6,7,8,9,10,11};
		
		
		//my approach
		for (int i = 0; i < a.length; i++)
		{
			int count=0;
			for(int k=2;k<a[i]/2;k++)
			{
				if(a[i]%k==0)
				{
					count++;
					break;
				}
				
			}
			if(count==0)
				System.out.print(a[i]+" ");
			
		}
		
		System.out.println();
		
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			int j=2;
			while(true)
			{
				if(n%j==0)
				{
					break;
				}
				else
				{
					j++;
				}
			}
			if(j==n)
				System.out.print(a[i]+" ");
		}
	}

}
