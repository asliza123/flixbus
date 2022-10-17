package stringPrograms;

public class Swap1stAndLastWord {

	public static void main(String[] args) {
		String s="this is test yantra";
		String []str=s.split(" ");
		
			String w=str[0];
			str[0]=str[str.length-1];
			str[str.length-1]=w;
		
		for(int i=0; i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}
		
				
	}

}
