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
public class Test2 extends Demo111
{
	public static void main(String[]args)
	{
		Test2 s=new Test2();
		s.show();
		
	}
}

