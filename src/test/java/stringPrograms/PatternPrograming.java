package stringPrograms;

public class PatternPrograming {

		
	public static void main(String[] args) {
		int n=5;
		char ch='A';
		for(int i=n;i>1;i--)
		{
//			for(int j=1;j<n-i;j++)
//			{
//				System.out.print(" ");
//			}
			for(int j=1;j<i;j++)
			{
				System.out.print(ch++ +" ");
			}
			System.out.println();
			ch='A';
			
		}
	}

}
