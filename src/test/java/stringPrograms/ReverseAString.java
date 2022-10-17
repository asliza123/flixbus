package stringPrograms;

public class ReverseAString {

	public static void main(String[] args) {
		String s="tester";
		String rvs="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rvs=rvs+s.charAt(i);
		}
		System.out.println(rvs);
		//approach 2
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}

}
