package set;

import java.util.Comparator;

public class MyComparator implements Comparator

{

	@Override
	public int compare(Object obj1, Object obj2) {
		Integer I1=(Integer)obj1;
		Integer I2=(Integer)obj2;
		//MyComparator I1=(MyComparator)obj1;
		//MyComparator I2=(MyComparator)obj2;
		//String I1=obj1.toString();
		//String  I2=obj2.toString();
//		if(I1<I2)
//		{
//			return +1;
//		}
//		else if(I1>I2)
//		{
//			return -1;
//		}
//		else
//		return 0;
		return -I1.compareTo(I2);//customized sorting order
		//return I1.compareTo(I2);//DNSO
	}

}
