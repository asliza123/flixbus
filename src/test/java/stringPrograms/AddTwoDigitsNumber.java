package stringPrograms;


public class AddTwoDigitsNumber {

	public static void main(String[] args) {
		String s="a12b13c42";
		String num="";
		int sum=0;
		char []ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0'&&ch[i]<='9')
			{
				num=num+ch[i];
			}
		}
		System.out.println(num);
		int n=Integer.parseInt(num);
		System.out.println(n);
		for(int i=n;i>0;i/=100)
		{
			sum=sum+(i%100);
			System.out.println(sum);
		}
		System.out.println(sum);
		
	}

}
