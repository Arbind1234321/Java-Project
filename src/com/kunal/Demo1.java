package com.kunal;

public class Demo1 {
	
public static void main(String[] args)
{
 System.out.println(add(3,6));
 
}
static int add(int x, int y)
{ 
    int keep = (x & y) << 1;
    int res = x^y;
 
    // If bitwise & is 0, then there
    // is not going to be any carry. 
    // Hence result of XOR is addition.
    if (keep == 0)
        return res;
         
    return add(keep, res);
}


}

