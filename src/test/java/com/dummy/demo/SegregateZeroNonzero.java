package com.dummy.demo;

public class SegregateZeroNonzero {

	public static void main(String[] args) {
		int a[]={3,0,0,5,1,0,2};
		int b[]=new int[a.length];
		int k=0;
		int count=0;
		//i.
		System.out.print("1st Approach: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				count++;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				b[k++]=a[i];
				//k++;
			}
			else
			{
				b[count++]=a[i];
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
		//ii.
		System.out.print("2nd Approach: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
				System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
				System.out.print(a[i]+" ");
		}
		System.out.println();
		//iii.
		System.out.print("3rd Approach: ");
		int j=0;
		for(int i=0; i<a.length;i++)
		{
			if(a[i]==0)
			{
				b[j++]=a[i];
				
			}
		}
		for(int i=0; i<a.length;i++)
		{
			if(a[i]!=0)
			{
				b[j++]=a[i];
				
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
