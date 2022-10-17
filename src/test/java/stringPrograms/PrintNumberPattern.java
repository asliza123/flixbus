package stringPrograms;

public class PrintNumberPattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print(1+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1,k=1;i<=n;i++,k++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1,k=5;i<=n;i++,k--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1,k=1;i<=n;i++,k+=2)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1,k=0;i<=n;i++,k+=2)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
					System.out.print("1 ");
				else
					System.out.print("2 ");
				
			}
			System.out.println();
		}
		System.out.println();
		int n1=(n+1)/2;
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n1-1-i;j++)
			{
				System.out.print(" ");
			}
			int k=1;
			for(int j=0;j<=2*i+1;j++)
			{
				System.out.print(""+k);
				if(j<(2*(n1-i)-1)/2)
					k++;
				else 
					k--;				
			}
			System.out.println();
		}
		n1=n1-1;
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			int k=1;
			for(int j=0;j<2*(n1-i)-1;j++)
			{
				System.out.print(""+k);
				if(j<(2*(n1-i)-1)/2)
					k++;
				else
					k--;
			}
			System.out.println();
		}
	}

}
