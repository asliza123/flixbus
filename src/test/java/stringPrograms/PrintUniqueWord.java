package stringPrograms;

import java.util.Scanner;

public class PrintUniqueWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s= sc.nextLine();
		String []str=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			int count=1;
			for(int j=0;j<str.length;j++)
			{
				if(str[i].equals(str[j])&&i!=j)
				{
					count++;
				}
			}
			if(count==1)
				System.out.println(str[i]);
			
		}
	}

}
