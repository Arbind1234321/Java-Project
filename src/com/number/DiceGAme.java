package com.number;

import java.util.Random;
import java.util.Scanner;

public class DiceGAme {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("Enter first player name");
		String fName = sc.next();
		System.out.println("Enter second  player name");
		String sName = sc.next();
		System.out.println(fName + " Press any button to flip dice");
		sc.next();
		int fno = rd.nextInt(6) + 1;
		System.out.println(sName + " Press any button to flip dice");
		sc.next();
		int sno = rd.nextInt(6) + 1;
		if (fno > sno) {
			System.out.println(fName + " won the game");
		} else if (sno > fno) {
			System.out.println(sName + " won the game");
		} else {
			System.out.println("Draw");
		}
		System.out.println("Score");
		System.out.println(fName + ":" + fno);
		System.out.println(sName + ":" + sno);

		int fcount = 0, scount = 0;
		while (true) {
			System.out.println(fName + " Presss any button");
			sc.next();
			fno = rd.nextInt(6) + 1;
			System.out.println("Your score is" + fno);
			if (fcount + fno <= 100) {
				fcount = fcount + fno;
				if (fcount == 100) {
					System.out.println(fName + " won the game");
					break;
				}
				System.out.println("Total score is " + fcount);
				System.out.println("============================");
				System.out.println(sName + " Presss any button");
				sc.next();
				sno = rd.nextInt(6) + 1;
				System.out.println("Your score is" + sno);
				if (scount + sno <= 100) {
					scount = scount + sno;
					if (scount == 100) {
						System.out.println(sName + " won the game");
						break;
					}
					System.out.println("Total score is " + fcount);
					System.out.println("============================");
				}

			}

		}
		System.out.println("Thanks");

	}

}
