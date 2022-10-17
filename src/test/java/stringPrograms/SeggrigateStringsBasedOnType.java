package stringPrograms;

public class SeggrigateStringsBasedOnType {

	public static void main(String[] args) {
		String s="abc1234def56#@";
		String alph="";
		String num="";
		String splchar="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&&s.charAt(i)>='Z'||s.charAt(i)>='a'&&s.charAt(i)>='z')
			{
				alph=alph+s.charAt(i);
			}
			else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				num=num+s.charAt(i);
			}
			else
			{
				splchar=splchar+s.charAt(i);
			}
		}
		System.out.print(alph+" "+num+" "+splchar);
	}

}
