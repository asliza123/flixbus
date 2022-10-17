package stringPrograms;

import java.util.Scanner;

public class PrintUniqueCharacterInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s= sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			for(int j=0; j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j)&&i!=j)
					count++;
			}
			if(count==1)
				System.out.println(s.charAt(i));
		}
	}

}
