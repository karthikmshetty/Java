package Patterns;

public class Pattern5 {

	public static void main(String[] args) {

		//Triangle
	
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
			System.out.print("* ");
			}
	
			System.out.println();

		
	}}

}
