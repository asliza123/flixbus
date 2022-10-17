package stringPrograms;

import java.util.LinkedHashSet;

public class CountVowelsInString {

	public static void main(String[] args) {
		String s="testyantra";
		int count=0;
		int count1=0;
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					count++;
			
		}
		System.out.println("number of vowel is: "+count);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				count1++;
		}
		System.out.println("number of vowel is: "+count1);
	}

}
