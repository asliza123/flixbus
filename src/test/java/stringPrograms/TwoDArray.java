package stringPrograms;

public class TwoDArray {
	public static void main(String []args)
	{
	int n=3;
	int [][]arr= new int[n][n];
	int a=1;
	for(int i=0;i<n;i++)
	{
	for(int j=0;j<n;j++)
	{
	arr[i][j]= a++;
	}
	}
	int sum1=0;
	int sum2=0;
	for(int i=0;i<n;i++)
	{
	 for(int j=0;j<n;j++)
	{
	 if(i==j)
	{
	sum1=sum1+arr[i][j];
	}
	 if(i+j==n-1)
	{
	sum2=sum2+arr[i][j];
	}
	}
	}
	
	for(int i=0;i<n;i++)
	{
	for(int j=0;j<n;j++)
	{
	System.out.print(arr[i][j]+" ");
	}
	System.out.println();
	}
	System.out.println("sum1: "+sum1);
	System.out.println("sum2: "+sum2);
	
	System.out.println("substraction of diaogonal is: "+(sum1-sum2));
	}
}
