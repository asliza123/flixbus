package stringPrograms;

import java.util.LinkedHashSet;

public class RemoveTheDuplicateWordInAGivenString {
 public static void main(String[] args) {
	String s="this is is test yantra";
	String str[]=s.split(" ");
	LinkedHashSet<String> set=new LinkedHashSet<String>();
	//1.
	for(int i=0;i<str.length;i++)
	{
		set.add(str[i]);
	}
	
	for(String word:set)
	{
		System.out.print(word+" ");
	}
	//2.
	System.out.println();
	for(String word:set)
	{
		int count=0;
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals(word))
			{
				count++;
			}
		}
		if(count==1)
			System.out.print(word+" ");
	}
	//3.
	System.out.println();
	for(String word:set)
	{
		int count=0;
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals(word))
			{
				count++;
			}
		}
		if(count>1)
			System.out.print(word+" ");
			
	}
}
}
