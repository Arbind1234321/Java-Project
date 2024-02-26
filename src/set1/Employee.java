package set1;

public class Employee implements Comparable
{
 int eid;
 String name;
public Employee(int eid, String name) {

	this.eid = eid;
	this.name = name;
}
@Override
public String toString() {
	return name+"----"+eid;
}
//For default natural sorting order
public int compareTo(Object obj)
{
	int eid1=this.eid;
	Employee e=(Employee)obj;
	int eid2=e.eid;
	if(eid1<eid2)
		return -1;
	else if(eid1>eid2)
		return +1;
	return 0;
}

}
