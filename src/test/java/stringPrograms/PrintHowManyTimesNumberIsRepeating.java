package stringPrograms;

import java.util.LinkedHashSet;

public class PrintHowManyTimesNumberIsRepeating {

	public static void main(String[] args) {
		int []a= {4,1,4,2,0,2};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(Integer in:set)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(in==a[i])
				{
					count++;
				}
			}
			System.out.println(a[in]+" is repeating "+count+" times");
		}
		
	}

}
