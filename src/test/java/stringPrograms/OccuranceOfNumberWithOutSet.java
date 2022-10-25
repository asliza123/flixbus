package stringPrograms;

public class OccuranceOfNumberWithOutSet {

	public static void main(String[] args) {
		int []arr= {4,2,3,5,4,4,2};
		boolean []a=new boolean[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			if(a[i]==false)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					
					if(arr[i]==arr[j])
					{
						count++;
						a[j]=true;
					}
					
			}
				if(count>1)
				System.out.println(arr[i]+" occurs "+count+" times ");
			
			}
		}

	}

}
