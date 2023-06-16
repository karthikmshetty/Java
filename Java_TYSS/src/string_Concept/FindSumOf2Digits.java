package string_Concept;

public class FindSumOf2Digits {

	public static void main(String[] args) {

		
		String s="a11b12d13"; //11+12+13
		int sum=0;
		int tsum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0'&&s.charAt(i)<='9') //0=48
			{
				int n=s.charAt(i)-48; 
				tsum=tsum*10+n;
			}
			else
			{
				sum=sum+tsum;
				tsum=0;
			}
	}
		System.out.println(sum);


}}
