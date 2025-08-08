package com.arbind;

import java.util.Scanner;

public class NumberToString {
	 // Arrays for number-to-word conversion
    static String[] ones = {
        "", "One", "Two", "Three", "Four",
        "Five", "Six", "Seven", "Eight", "Nine",
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
        "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    static String[] tens = {
        "", "", "Twenty", "Thirty", "Forty",
        "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    // Method to convert number into words
    public static String convert(int number) {
        if (number < 1000 || number > 9999) {
            return "Please enter a four-digit number!";
        }

        StringBuilder word = new StringBuilder();

        int thousand = number / 1000;
        int hundred = (number % 1000) / 100;
        int lastTwo = number % 100;

        if (thousand != 0) {
            word.append(ones[thousand]).append(" Thousand ");
        }

        if (hundred != 0) {
            word.append(ones[hundred]).append(" Hundred ");
        }

        if (lastTwo != 0) {
            if (lastTwo < 20) {
                word.append(ones[lastTwo]);
            } else {
                word.append(tens[lastTwo / 10]).append(" ");
                word.append(ones[lastTwo % 10]);
            }
        }

        return word.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any four-digit number: ");
        int number = sc.nextInt();

        String result = convert(number);
        System.out.println("In Words: " + result);
    }

}
