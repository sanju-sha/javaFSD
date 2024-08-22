abstract class Demo
{
	abstract void show();
	void display()
	{
	System.out.println("complete method of abstract class");
	}
}
class  Test extends Demo
{
	void show()
	{
		System.out.println("abstract method of test class");
	}
}
class Abs
{
	public static void main(String[]args)
	{
		Test t=new Test();
		t.show();
		t.display();
	}
}