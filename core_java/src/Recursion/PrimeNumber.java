package Recursion;

import java.util.Scanner;

public class PrimeNumber {
    static Scanner sc = new Scanner(System.in);

    public static boolean isPrime(int input, int divisor) {
        if (input <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        if (divisor <= 1) {
            return true; // It's prime if we've checked all possible divisors
        }
        if (input % divisor == 0) {
            return false; // Number is divisible by a factor other than 1 and itself
        }
        return isPrime(input, divisor - 1);
    }

    public static void main(String[] args) {
        int input = sc.nextInt();
        
        
        
        boolean result = isPrime(input, input/2 );

        if (result) {
            System.out.println("Number " + input + " is prime");
        } else {
            System.out.println("Number " + input + " is not prime");
        }

        sc.close();
    }
}