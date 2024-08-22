//overriding
class override1
{
	void show()
	{
		System.out.println("parent class method called");
	}
}
class Demo111 extends override1
{
	void show()
	{
		super.show();
		System.out.println("child class method called");
	}
}
public class Override extends Demo111
{
	public static void main(String[]args)
	{
		Override s=new Override();
		s.show();
		
	}
}

