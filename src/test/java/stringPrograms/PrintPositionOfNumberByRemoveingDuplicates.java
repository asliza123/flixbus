package stringPrograms;

import java.util.LinkedHashSet;

public class PrintPositionOfNumberByRemoveingDuplicates {

	public static void main(String[] args) {
		int []a= {4,1,4,2,0,2};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(Integer in:set)
		{
			for(int i=0;i<a.length;i++)
			{
				if(in==a[i])
				{
					System.out.println(in+" is present at "+(i+1)+" position");
					break;
				}
			}
		}
	}

}
