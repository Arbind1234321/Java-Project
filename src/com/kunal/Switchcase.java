package com.kunal;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// String vote=sc.next();
		int bcount = 0;
		int acount=0;
		int ccount=0;
		boolean flag = true;
		while (flag) {
			System.out.println("Now vote");
			String vote = sc.next();
			switch (vote) {
			case "B": {
				System.out.print("you voted for B");
				bcount++;
				break;

			}
			case "A": {
				System.out.println("you voted for A");
                acount++;
                break;
			}
			case "C": {
				System.out.println("you voted for C");
              ccount++;
              break;
			}
			case "R": {
				flag=false;
				int z=Math.max(acount, bcount);
				int y=Math.max(z, ccount);
				//
				bcount=y;
				System.out.println("B got "+bcount);
				if(acount>bcount)
				{	
					acount=acount-bcount;
				System.out.println("A got "+acount);
				}
				System.out.println("C got "+ccount);
              break;
			}
			
			default: {
				System.out.println("you voted");
			}

			}

		}
	}
}
