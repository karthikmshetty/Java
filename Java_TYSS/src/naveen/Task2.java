package naveen;

public class Task2 {

	public static void main(String[] args) {
		
		int k=1;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i+j>3)
				{
					System.out.print(k++ +" ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i+j>3)
				{
					System.out.print(k++ +" ");
				}
				else
				{
					if(i>2)
					System.out.print(" ");
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		
}
}