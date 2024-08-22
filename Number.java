import java.util.Scanner;
class Number 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int e=sc.nextInt();
		if(e%2==0)
		{
			System.out.println("even");
		}else
		{
			System.out.println("odd");
		}
		
		
	}

}
