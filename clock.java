
import java.util.*;
class clock
{
	public static void main(String[] args)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the hours,minutes and seconds");
				int h=sc.nextInt();
				int m=sc.nextInt();
				int s=sc.nextInt();
				System.out.println("clock");
				System.out.println("hh:mm:ss");
				   for(h=h;h<24;h++)
				   {
					   for(m=m;m<60;m++)
					   {
						  for(s=s;s<60;s++)
						  {
						System.out.println(h+":"+m+":"+s+"\r");
						  Thread.sleep(1000);
					   }s=0;
				   }m=0;
	}h=0;
}
}

