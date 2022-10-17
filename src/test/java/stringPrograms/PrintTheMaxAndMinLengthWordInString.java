package stringPrograms;

public class PrintTheMaxAndMinLengthWordInString {

	public static void main(String[] args) {
		String []s= {"hi", "hello", "welcome", "bye", "I"};
		int maxLnt=s[0].length();
		int minLnt=s[0].length();
		for(int i=0;i<s.length;i++)
		{
			if(maxLnt<s[i].length())
			{
				maxLnt=s[i].length();
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(maxLnt==s[i].length())
			{
				System.out.println(s[i]+" has maximum length that is "+maxLnt);
			}
		}
		
		for(int i=0;i<s.length;i++)
		{
			if(minLnt>s[i].length())
			{
				minLnt=s[i].length();
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(minLnt==s[i].length())
			{
				System.out.println(s[i]+" has minimum length that is "+minLnt);
			}
		}
		
	}

}
