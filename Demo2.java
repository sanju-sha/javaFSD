//multiple inheritance using interface
interface I1
{
	void show();
}
class Test1 implements I1
{
	public void show()
	{
		System.out.println("show method called");
	}
}
class Demo2 
{
	public static void main(String[]args)
	{
		Test1 t=new Test1();
		t.show();
	}
}