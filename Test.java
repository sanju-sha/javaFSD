class prac{
void shape (int i)
{
	System.out.println("Triangle:"+i);
}
void shape( double j)
{
	System.out.println("Rectangle:"+j);
}
void shape(long k)
{ 
	System.out.println("square:"+k);
}
}
public class Test
{
public static void main(String[]args)
{
	prac d=new prac();
	d.shape(4);
	d.shape(3.2);
	d.shape(456);
}
}

