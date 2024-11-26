package com.programming;

public class DemoPrime {
	public static void main(String[] args) {
        int n = 10;
        boolean[] primes = new boolean[n+1];
        //sieve(n, primes);
        System.out.println(sieve(n, primes));
    }

    // false in array means number is prime
    static int sieve(int n, boolean[] primes) {
    	int count=0;
    	
        for (int i = 2; i*i <= n; i++) {
            if (!primes[i]) {
                for (int j = i*2; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 3; i <= n; i++) {
            if (!primes[i]) {
               // System.out.print(i + " ");
                count++;
            }
        }
        return count;
    }

}
