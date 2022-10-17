package stringPrograms;

public class TrainglePatternPrgrm {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=n;i>0;i--)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print("s ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=n;i>0;i--)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print("  ");
			}
			for(int j=i;j>0;j--)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		System.out.println();
		for(int i=n;i>0;i--)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print("  ");
			}
			for(int j=i;j>0;j--)
			{
				System.out.print("* ");
			}
			for(int j=i;j>0;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=n;i>0;i--)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print("  ");
			}
			for(int j=i;j>0;j--)
			{
				System.out.print("* ");
			}
			for(int j=i;j>0;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
