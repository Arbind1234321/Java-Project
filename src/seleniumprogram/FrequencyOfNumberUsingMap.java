package seleniumprogram;
//Frequency of a number using map concept
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FrequencyOfNumberUsingMap {

	public static void main(String[] args) {
		int [] a= {10,10,20,20,20,30,50,50,80};
		
		Map<Integer, Integer> map=new HashMap();
		
		for(int i=0;i<a.length;i++)
		{
			if(map.containsKey(a[i]))
			{
				//digitmap.put(lastDigit ,digitmap.get(lastDigit)+1);
				map.put(a[i], map.get(a[i])+1);
			}
			else
			{
				map.put(a[i], 1);
			}
		}
//		Set<Integer> keys=map.keySet();
//		for(Integer key:keys)
//		{
//			System.out.println(key+" : "+map.get(key));
//		}
		for(Map.Entry<Integer, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}

	}

}
