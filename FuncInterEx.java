@FunctionalInterface
public interface FuncInterEx {
	
	void add();
	//void sub();
	
	
	

}
class FuncDemo implements FuncInterEx
{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Addition");
	}

	
}
