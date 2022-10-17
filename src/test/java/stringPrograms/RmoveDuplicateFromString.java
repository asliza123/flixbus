package stringPrograms;

import java.util.LinkedHashSet;

public class RmoveDuplicateFromString {

	public static void main(String[] args) {
		String str="Tester";
		String s=str.toLowerCase();
		char ch[]=s.toCharArray();
		boolean []bary=new boolean[str.length()];
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
			
		}
		System.out.println(set);
		System.out.println("Approach 2");
		for(int i=0;i<ch.length;i++)
		{
			char c=ch[i];
			for(int j=i+1;j<ch.length;j++)
			{
				if(c==ch[j])
				{
					bary[j]=true;
				}
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			if(bary[i]==false)
			{
				System.out.print(ch[i]+" ");
			}
		}
	}

}
