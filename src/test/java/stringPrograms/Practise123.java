package stringPrograms;

import java.util.LinkedHashSet;

public class Practise123 {

	public static void main(String[] args) {
		String s="Today is friday";


		if(s.endsWith("friday"))
		{
			s=s.replace("friday", "Today");
		}
		s=s.replaceFirst("Today", "friday");
		System.out.println(s);

		String []s1= {"java","c#",".net","java",".net"};
		LinkedHashSet<String> set=new LinkedHashSet<String>();

		for(String s2:s1)
		{
			if(set.add(s2)==false)
				System.out.println(s2);
		}

		String []str={"java", "c#",".net","java",".net"};
		LinkedHashSet<String> set1=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			set1.add(str[i]);
		}
		for(String nm:set1)
		{
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(str[i].equals(nm))
				{
					count++;
				}
			}
			if(count>1)
				System.out.println(nm);
		}
	}
}

