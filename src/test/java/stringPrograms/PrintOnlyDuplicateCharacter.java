package stringPrograms;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class PrintOnlyDuplicateCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s= sc.nextLine();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0; i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character c:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(c==s.charAt(i))
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
