import java.util.*;
public class STDemo {
	
	

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("Smooth sea never made skilled sailors");
		int count=st.countTokens();
		System.out.println("No. of tokens:"+count);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			;
		}		
	}

}
