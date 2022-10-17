package stringPrograms;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class OccuranceOfEachWordInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s= sc.nextLine();
		String []sa=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for (int i = 0; i < sa.length; i++) {
			set.add(sa[i]);
		}
		for(String c:set)
		{
			int count=0;
			for(int i=0;i<sa.length;i++)
			{
				if(c.equals(sa[i]))
				{
					count++;
				}
			}
			System.out.println(c+" "+count);
		}
	}

}
