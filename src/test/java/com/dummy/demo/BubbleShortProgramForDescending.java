package com.dummy.demo;

public class BubbleShortProgramForDescending {

	public static void main(String[] args) {
		int []arr= {20,30,10,50,40};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("1st max number is "+arr[0]);
		System.out.println("2nd max number is "+arr[1]);
	}

}
