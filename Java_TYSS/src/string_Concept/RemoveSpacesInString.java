package string_Concept;

public class RemoveSpacesInString {

	public static void main(String[] args) {

		String input="I  am a      software    engg";
		int j=0;
		char[]ch=input.toCharArray();
		char[]ch1=new char[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				ch1[j]=ch[i];
				System.out.print(ch1[j]);
				j++;
	  }
			
		}
		
		
		
			

		
	}

}
