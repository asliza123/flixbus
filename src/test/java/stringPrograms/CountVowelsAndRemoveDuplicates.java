package stringPrograms;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

public class CountVowelsAndRemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		String s=str.toLowerCase();
		int count=0;
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for(Character c:set)
		{
			
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				{
					count++;
				}
			
		}
		System.out.println("Number of vowel is "+count);
		System.out.println("2nd Approach");
		String s1="testyantra";
		String vowels="aeiou";
		
		char ch[]=s1.toCharArray();
		char[] v = vowels.toCharArray();
		//char []v= {'a','e','i','o','u'};
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		for(int i=0; i<ch.length;i++)
		{
			if(map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i])+1);
			}
			else {
				map.put(ch[i], 1);
			}
		}
		for(Map.Entry<Character, Integer> m: map.entrySet())
		{
			for(int i=0; i<v.length;i++)
			{
				if(m.getKey()==v[i])
				{
					System.out.println(m.getKey()+" occurance "+m.getValue());
				}
			}
		}
	}

}
