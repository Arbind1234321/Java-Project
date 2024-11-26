package Constructor;
//for any java class if we are allow to  create only one object for that class such type of class is  called singleton class it improve
//the performance and memory utilization.
public class Test 
{/*
	//1 private static variable 
	private static Test t=new Test();
	//private constructor
  private Test() {
	  
  }
  //3Factory method as public  
  public static Test getTest()
  {
	  return t;
  }*/
	
	//Approach 2
	//private static variable set as null
	private static  Test t=null;
	//2 private constructor
	private Test() {
		
	}
	//3 use public  factory method to produce object 
	public static Test getTest() {
		if(t==null)
		{
			t=new Test();
		}
		return t;
	}
	
}
