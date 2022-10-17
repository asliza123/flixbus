package stringPrograms;

import java.util.Scanner;

public class ShiftTheWordFromString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		String []sar=s.split(" ");
		System.out.println("enter the key");
		int k=sc.nextInt();
		for(int i=0;i<k;i++)
		{
			String s1=sar[0];
			for(int j=1; j<sar.length;j++)
			{
				
				sar[j-1]=sar[j];
				if(j==sar.length-1)
				{
					sar[sar.length-1]=s1;
				}
			}
		}
		
		for(int i=0;i<sar.length;i++)
		{
			System.out.print(sar[i]+" ");
		}
		System.out.println();
		System.out.println("===Approach 2===");
		for(int i=sar.length-1;i>=0;i--)
		{
			System.out.print(sar[i]+" ");
		}
	}

}


