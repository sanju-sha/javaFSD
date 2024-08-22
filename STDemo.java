import java.util.StringTokenizer;

public class STDemo
{
	public static void main(String[]args)
	{
		StringTokenizer st=new StringTokenizer("Smile , the world smiles with you");
		int count=st.countTokens();
		System.out.println("No.tokens:"+count);
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
	}

}
