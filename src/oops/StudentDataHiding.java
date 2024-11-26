package oops;

import java.util.*;

public class StudentDataHiding 
{
  private String name;
  private int rollnumber;
  private final int account=12345;
  private double amount;
  
  //get name
  public String getName()
  {
	  return this.name;
  }
  //set name 
  public void setName(String Name)
  {
	  this.name=Name;
  }
  public void setRollNumber(int roll)
  {
	  this.rollnumber=roll;
  }
  //set roll number
  public int getrollNumber()
  {
	  return this.rollnumber;
  }
  //set rol number
  public double setupdatBalance(double balance,int account123)
  {
	  if(account==account123)
	  {
		 return  amount=amount+balance; 
	  }
	  else
	  {
		throw new IllegalArgumentException("invalid account");  
	  }
	  
  }
  public void  setrollNumber(int rollnumber)
  {
	   this.rollnumber=rollnumber;
  }
  
  public void display()
  {
	  System.out.println(this.name);
	  System.out.println(this.rollnumber);
	  System.out.println(this.amount);
  }

}
  
