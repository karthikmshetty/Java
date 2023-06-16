package Patterns;

public class Mock {

	public static void main(String[] args) {

		
		int key=1;
		
		int[] a= {5,4,3,1};
		int[] b=new int[a.length];
		
		int last=a.length-1;
		
		for(int i=0;i<a.length;i++)
		{
			if(key==1)
			{
				b[last--]=a[i];
				while(i<b.length)
				{
					i++;
					b[last--]=a[i];

				}
			}
			else if(key==2)
			{
				b[last--]=a[i];
				b[last--]=a[i+1];
				break;
				
			}
				
				
		}
		for(int i:b)
		{
			System.out.print(i+" ");
		}
		
	}

}
