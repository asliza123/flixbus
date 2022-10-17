package stringPrograms;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class NumberOfOccuranceOfEachChracterInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s= sc.nextLine();
		char ch[]=s.toCharArray();
		boolean []bary=new boolean[s.length()];
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			char c=s.charAt(i);
			for(int j=i+1;j<ch.length;j++)
			{
				if(c==s.charAt(j)&&bary[j]==false)
				{
					count++;
					bary[j]=true;
				}
				
			}
			if(bary[i]==false)
			{
				System.out.println(ch[i]+" present "+count+" times in the string");
			}
		}
		System.out.println("2nd Approach");
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for(Character c:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==c)
				{
					count++;
				}
			}
			System.out.println(c+" "+count);
		}
	}

}
