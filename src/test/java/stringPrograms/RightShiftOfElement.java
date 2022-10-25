package stringPrograms;

public class RightShiftOfElement {

	public static void main(String[] args) {
int[] arr={10,20,30,40,50};
int[] arr1=new int[arr.length];

int n=1;
int k=0;
for(int i=n;i<arr.length;i++)
{
	arr1[i]=arr[k];
	k++;
}
for(int i=0;i<n;i++)
{
	arr1[i]=arr[k];
	k++;
}
for(int i=0;i<arr1.length;i++)
{
	System.out.print(arr1[i]+" ");
}
	
	}

}
