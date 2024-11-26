package com.string;

class Wissen1
{ 
void wissen_method() throws Exception
{
System.out.println("WissenTech");
} 
} 
 public class Wissen2 extends Wissen1
{
void wissen_method() 
{
System.out.println("Wissen");
} 
public static void main(String args[])
{ 
Wissen2 w=new Wissen2(); 
try
{ 
w.wissen_method(); 
}
catch(Exception e)
{
System.out.print("hello");
} 
finally 
{
System.out.println("hi");
}
} 
}
