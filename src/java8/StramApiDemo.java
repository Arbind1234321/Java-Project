package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StramApiDemo {

	public static void main(String[] args) {
//	
//		//Create the list and print even number
//		List<Integer>list1=List.of(2,3,4,5,6,7,8,88,99);//unmodifiable list
//		List<Integer> list2=new ArrayList<>();
//		list2.add(2);
//		list2.add(3);
//		list2.add(4);
//		list2.add(5);
//		list2.add(6);
//		list2.add(7);
//		list2.add(8);
//		list2.add(88);
//		System.out.println(list1);
//		System.out.println(list2);
//		
//		List<Integer> list3=Arrays.asList(2,3,4,5,6,7,8,9,88,99);
//		System.out.println(list3);
//		//filter even number from the list2
//		List<Integer> evenlist=new ArrayList<>();
//		
//		for(Integer i:list2)
//		{
//			if(i%2==0)
//			{
//				evenlist.add(i);
//			}
//		}
//		//System.out.println(evenlist);
//	//	
//		//List<Integer> newevenlist=new ArrayList<>();
//		
//		Stream<Integer> stream=list3.stream();//creating stream api for processing
//		
//		List<Integer> newevenlist=stream.filter(i->i%2==0).collect(Collectors.toList());//filtering and collecting
//		System.out.println(newevenlist);
//		
//		//System.out.println(stream.filter(i->i>10).collect(Collectors.toList()));
//		List<Integer>grater=list2.stream().filter(i->i > 10).collect(Collectors.toList());
//		System.out.println(grater);
		//List<String>names=List.of("arbind","Ankit","Amit","Sou","Monu");
		
//		names.stream().filter(e->e.equals("arbind")).forEach(e->{	
//				System.out.println(e);
//		});
		//filter(predicate);
//		List<String>newnames=names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
//		System.out.println(newnames);
//		// map(Funtion);
//		List<Integer>number=List.of(3,4,5,6,7,8);
//		//List<Integer>no=number.stream().map(i->i*i).collect(Collectors.toList());
//		
//		//System.out.println(no);
//		number.stream().map(i->i*i).forEach(e->{
//			
//			System.out.println(e);
//		});
		
	//List<Integer> list1=List.of(20,30,34,56,50);//Unmodifiable list
//		List<Integer> list2=Arrays.asList(3,5,7,9,12,14,18);
//		  List<Integer> l= list1.stream().map(i->i+5).collect(Collectors.toList());
//		  System.out.println(l);
//		  Collections.sort(l,(e,d)->-e.compareTo(d));
//		  System.out.println(l);
//		  //write a program to print  all number that divisible by 5
//		  list1.stream().filter(i->i%5==0).forEach(e->{
//			  System.out.println(e);
//		  });
		
		
		//Write a java program  to print the length of each string
		
		//List<String> l=Arrays.asList("Arbind122","kumar","Sonu","map")
//     String str="i am123 arl kumar automation";
//     String s[]=str.split(" ");
//     List<String > l=new ArrayList<>(Arrays.asList(s));
//		l.stream().map(i->i.length()).forEach(e->{
//			//System.out.println(e);
//		});
//		long count=l.stream().filter(i->i.length()>4).count();
//		System.out.println(count);
//		
//		l.stream().sorted((a,b)->-a.compareTo(b)).forEach(e->{
//			System.out.println(e);
//		});
//		
//		list1.stream().sorted((e,d)->e<d?1:e>d?-1:0).forEach(e->{
//			System.out.println(e);
//		});
//		
//		  Comparator<String> c=(s1,s2)-> {
//		    	
//		    	int l1=s1.length();
//		    	int l2=s2.length();
//		    	if(l1<l2) return -1;
//		    	else if(l1>l2) return 1;
//		    	else return  s1.compareTo(s2);
//		    	
//		    		
//		    };
//		    
//		   List<String> list=l.stream().sorted(c).collect(Collectors.toList());
//		   System.out.println(list);
	
		
//		String str="write a program to print all number that divisible by 5";
//		List<String> list=List.of(str.split(" "));
//		System.out.println(list);
//		List<String> l=list.stream().sorted().collect(Collectors.toList());
//		System.out.println(l);
//		
//		//write a program to short according to length
//		Comparator<String> c=(s1,s2)->{
//			int l1=s1.length();
//			int l2=s2.length();
//			if(l1<l2) return -1;
//			else if(l1>l2) return 1;
//			else return s1.compareTo(s2);
//		};
//		List<String>d=l.stream().sorted(c).collect(Collectors.toList());
//		System.out.println(d);
		
//		String str="abcd";
//		for(int i=0;i<str.length();i++)
//		{
//			String l=str.substring(i)+str.substring(0,i);
//			System.out.println(l);
//		}
		
		List<Integer> l=List.of(2,5,0,1,22,12,2,22);
//		Set<Integer> s=new HashSet<>(l);
//		System.out.println(s);
//		System.out.println(l);
//		List<Integer>d=s.stream().sorted().collect(Collectors.toList());
//		System.out.println(d);
//		System.out.println(d.get(d.size()-2));
//		Integer t=l.stream().min((i,a)->-i.compareTo(a)).get();
//		System.out.println(t);
		//l.stream().sorted().forEach(System.out::println);//:: colon operator using method reference.
		
		//String str="abcd";
		//char s[]=str.toCharArray();
		//System.out.println(Arrays.toString(s));
		Integer i[]= {2,3,4,5,6,6,7};
		
		Stream.of(i).forEach(System.out::println);
		
		//Stream.of(i).filter(e->e%2==0).distinct().forEach(System.out::println);
		

		
		
	
		
		}
	 }	
	






















