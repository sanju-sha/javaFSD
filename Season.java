import java.util.*;
public class Season 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		switch(num)
		{
		case 6:case 7:case 8:case 9:
			System.out.println("Rainy");
			break;
		case 10:case 11:case 12:case 1:
			System.out.println("Winter");
			break;
		case 2:case 3:case 4: case 5:
			System.out.println("summer");
			break;
			default:
				System.out.println("none");

			
		}
	}
	

}
