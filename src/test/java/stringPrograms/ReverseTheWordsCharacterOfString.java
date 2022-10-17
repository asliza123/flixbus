package stringPrograms;

import java.util.Scanner;

public class ReverseTheWordsCharacterOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		char []arr=s.toCharArray();
		String []sar=s.split(" ");
		String rvs="";
		for(int i=0;i<sar.length;i++)
		{
			String word=sar[i];
			for(int j=word.length()-1;j>=0;j--)
			{
				System.out.print(sar[i].charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("2nd Approach");
		for(int i=0;i<arr.length;i++)
		{
			int j=i;
			while(i<arr.length&&arr[i]!=' ')
			{
				i++;
			}
			
			int k=i-1;
			while(k>=j)
			{
				rvs=rvs+arr[k];
				k--;
			}
			if(i<arr.length)
				rvs=rvs+arr[i];
			
		}
		System.out.println(rvs);
	}

}
