package com.dummy.demo;

public class CheckAccordingToLength {

	public static void main(String[] args) {
		String []s= {"hi","ab","hello","one","four","killer","abcdef"};
		int max=s[0].length();
		int min=s[0].length();
		for(int i=1;i<s.length;i++)
		{
			if(max<s[i].length())
			{
				max=s[i].length();
			}
			if(min>s[i].length())
			{
				min=s[i].length();
			}
			
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()==max)
			{
				System.out.println(s[i]);
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()==min)
				System.out.println(s[i]);
		}
	}

}
