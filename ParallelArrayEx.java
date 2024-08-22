import java.util.Arrays;

public class ParallelArrayEx {
	public static void main(String[] args) {
		int a[]= {2,3,41,4,2,34,4,3,1};
		Arrays.parallelSort(a);
		for(int i:a)
		{
			System.out.println(i);
		}
	}

}
