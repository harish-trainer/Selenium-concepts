import java.util.Collection;
import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		
		hm.put(1, "Harish");
		hm.put(2, "Raj");
		hm.put(3, "Mohana");
		hm.put(4, "karthik");
		
		hm.put(1, "latha");
		
		hm.put(5, "Mohana");
		System.out.println(hm);
		
		
		System.out.println(hm.get(3));
		
		
	}

}
