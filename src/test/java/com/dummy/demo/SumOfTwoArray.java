package com.dummy.demo;

public class SumOfTwoArray {

	public static void main(String[] args) {
		int a[]= {2,4,6,12};
		int b[]= {3,7,9,13};
		int count=a.length;
		int al=a.length;
		int bl=b.length;
		if(al<bl)
			count=b.length;
		int c[]= new int[count];
		/*int k=0;
		for(int i=0;i<c.length;i++)
		{
			while(a.length<=c.length&&b.length<=c.length)
			{
				c[k]=a[i]+b[i];
				k++;
			}
			if(a.length-1<=k)
			{
				c[k]=a[i];
				k++;
			}
			else if(b.length-1<=k)
			{
				c[k]=b[i];
				k++;
		}
		
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}*/
		for(int i=0;i<count;i++)
		{
				try {
					System.out.print(a[i]+b[i]+" ");
				}
			catch(Exception e)
			{
				if(a.length<b.length)
				{
					System.out.print(b[i]+" ");
				}
				else
				{
					System.out.print(a[i]+" ");
				}
			}
			
			
		}
	}

}
