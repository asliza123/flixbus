package stringPrograms;

import java.util.LinkedHashSet;

public class OrderOfOccuranceOfEachCharacter {

	public static void main(String[] args) {
		String s="tester";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character c:set)
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				if(c==s.charAt(i))
				{
					System.out.println(c+"="+(i+1));
					break;
				}
			}
		}
		
		for(Character c:set)
		{
			for(int i=0;i<=s.length()-1;i++)
			{
				if(c==s.charAt(i))
				{
					System.out.println(c+"="+(i+1));
					break;
				}
			}
		}
	}

}
