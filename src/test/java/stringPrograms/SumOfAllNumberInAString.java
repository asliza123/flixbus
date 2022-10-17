package stringPrograms;

public class SumOfAllNumberInAString {

	public static void main(String[] args) {
		String s="a1b3d4";//0/p:8
		String str="a11bc3dr50";//o/p:64
		int sum=0;
		int tsum=0;
		int nsum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				sum=sum+(s.charAt(i)-48);
			}
		}
		System.out.println("sum of number in a string :"+sum);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0'&&str.charAt(i)<='9')
			{
				int n=str.charAt(i)-48;
				tsum=tsum*10+n;
			}
			else
			{
				nsum=nsum+tsum;
				tsum=0;
			}
		}
		nsum=nsum+tsum;
		System.out.println(nsum);
	}

}
