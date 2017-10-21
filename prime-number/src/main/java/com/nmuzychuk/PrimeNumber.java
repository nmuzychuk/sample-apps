package com.nmuzychuk;

public final class PrimeNumber {

    private PrimeNumber() {
    }

    public static boolean isPrime(final int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void printPrimes(final int upTo) {
        for (int i = 2; i < upTo; i++) {
            if (isPrime(i)) {
                System.out.printf("%d ", i);
            }
        }
    }

}
