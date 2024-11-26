package Collecions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingDuplicateObject {
	int id;
	String name;
	String dept;

	public RemovingDuplicateObject(int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public String toString() {
		return id + " " + name + " " + dept;
	}

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Set<Integer> m = new HashSet<>();
		RemovingDuplicateObject s = new RemovingDuplicateObject(100, "Arbind", "qa");
		RemovingDuplicateObject s1 = new RemovingDuplicateObject(101, "Deep", "Developer");
		RemovingDuplicateObject s2 = new RemovingDuplicateObject(100, "Arbind", "qa");
		list.add(s);
		list.add(s2);
		list.add(s1);
		for (int i = 0; i < list.size(); i++) {
			RemovingDuplicateObject e = (RemovingDuplicateObject)list.get(i);
			//System.out.println(e);
			if (m.contains(e.id)) {
				list.remove(e);
			} else {
				m.add(e.id);
			}
		}
		int i=0;
		for(Object o:list)
		{
		System.out.println(list.get(i++));
		
		}
		
	}

}
