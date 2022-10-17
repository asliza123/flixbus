package com.dummy.demo;

public class PracticeProgrameAtClass {

	public static void main(String[] args) {
		String s="india";
		//1st approach
		char []ch=s.toCharArray();
		for(int i=0; i<s.length()/2;i++)
		{
			char j=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=j;
		}
		String rev=new String(ch);
		System.out.println("reverse of "+s+" = "+rev);
		//2nd approach
		String reverse="";
		for(int i=s.length()-1;i>=0;i--)
		{
			int j=i;
			while(i>0 && s.charAt(i)!=' ')
			{
				i--;
			}
			int k=i+1;
			while(j>=k)
			{
				reverse=reverse+s.charAt(j);
				j--;
			}
			reverse=reverse+s.charAt(j);
			System.out.println("reverse of "+s+" = "+reverse);
		}
		String rv="";
		for(int i=0; i<s.length();i++)
		{
			rv=s.charAt(i)+rv;
		}
		System.out.println(rv);
	}

}
