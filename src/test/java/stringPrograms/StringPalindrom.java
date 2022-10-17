package stringPrograms;

import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		char []ch=s.toCharArray();
		for(int i=0;i<ch.length/2;i++)
		{
			char c=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=c;
		}
		String rvs=new String(ch);
		if(s.equalsIgnoreCase(rvs))
			System.out.println(s+" is a palindrom");
		else 
			System.out.println(s+" is not a palindrom");
	}

}
