package Collecions;
//second highest and second lowest number in list
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLowestAndHighestNumber {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(9,3,5,0,0,1,1,44,55,66,89);
		//sorting in assending order
		//nth smalest number skip(nth-1) 
		int s=2;
		int sl=list.stream().sorted().distinct().skip(0).findFirst().get();
		System.out.println(sl);
		int sh=list.stream().sorted(Collections.reverseOrder()).distinct().skip(s).findFirst().get();
		System.out.println(sh);
      int secondl =	list.stream().sorted().distinct().skip(1).findFirst().get();
      System.out.println(secondl);

	}

}
