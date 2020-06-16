package com.michalkrzyska;

public class PrimeGaps {

    public static long[] gap(int g, long m, long n) {
        long firstPrime = 0;
        long secondPrime = 0;
        boolean flag = true;
        long[] toReturn = new long[2];
        for (long i = m; i <= n; i++) {
            if (flag) {
                if (isPrime(i)) {
                    firstPrime = i;
                    flag = false;
                }
            } else {
                if (isPrime(i)) {
                    secondPrime = i;
                    if (firstPrime + (long) g == secondPrime) {
                        toReturn[0] = firstPrime;
                        toReturn[1] = secondPrime;
                        break;
                    } else {
                        i =firstPrime;
                        flag = true;
                    }

                }
            }
        }
        if (toReturn[0] == 0){
            return null;
        }
        return toReturn;
    }

    public static boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        } else if (number == 2 || number == 3) {
            return true;
        } else if (number % 2 == 0) {
            return false;
        } else {
            for (int i = 3; i < number / 2; i++) {
                if (i % 2 == 0){
                    continue;
                }
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
