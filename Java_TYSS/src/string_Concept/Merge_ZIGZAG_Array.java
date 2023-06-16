package string_Concept;

public class Merge_ZIGZAG_Array {

	public static void main(String[] args) {

		
		int []a= {1,2,3};
		int []b= {4,5,6,10};  //1 4 2 5 3 6
		int j=0,k=0,i=0;
		
		int []c=new int[a.length+b.length];

		while(i<c.length) {
			if(j<a.length&&k<b.length) {
				c[i++]=a[j++];
				c[i++]=b[k++];
			}
			if(j<a.length) {
				c[i++]=a[j++];
			}
			if(k<b.length) {
				c[i++]=b[k++];
			}
		}
		
		
		for(int nb:c)
		System.out.print(nb+" ");
		
		
	}

	
	
}
