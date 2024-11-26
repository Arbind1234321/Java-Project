package map;
//Write a code to print order id in between given time
import java.sql.Time;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class PrintOrderInGivenTimeInterval {
	public static void main(String[] args) {
		
		Map<Integer, Integer> hm = new HashMap<>();
		
		hm.put(1000, 1030);
		hm.put(1001, 1130);
		hm.put(1002, 1031);
		hm.put(103, 1245);
		hm.put(1040, 1000);
		hm.put(1006, 1256);

		List<Integer> li = new ArrayList<>();
//		Set<Integer> set = hm.keySet();
//		for (Integer t : set) {
//			if (hm.get(t) >= 1030 && hm.get(t) < 1256) {
//				li.add(t);
//			}
//		}
//		System.out.println(li);
		Set<Map.Entry<Integer, Integer>> s=hm.entrySet();
		for(Entry<Integer, Integer>t:s)
		{
			if(t.getValue()>1030&& t.getValue()<1245)
			{
				li.add(t.getKey());
			}
		}
		System.out.println(li);
		

	}

}
