package stringPrograms;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class PrintDuplicateWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s= sc.nextLine();
		System.out.println();
		String []str=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		for(String c:set)
		{
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(c.equals(str[i]))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(c);
			}
		}
	}

}
