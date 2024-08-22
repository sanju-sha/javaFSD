import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		HashMap<Integer, String>map=new HashMap<Integer, String>();
		map.put(1,"Varun");
		map.put(2, "Vinay");
		map.put(3, "Sri");
		map.put(4, "Rekha");
		
		for(Entry r:map.entrySet()) {
			System.out.println(r.getKey()+ ":"+r.getValue());
		}
		
		Set s=map.keySet();
		System.out.println(s);
		
		Collection c=map.values();
		System.out.println(c);
		}

}
