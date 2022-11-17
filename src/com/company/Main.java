package com.company;

public class Main {

    public static void main(String[] args) {
	    testNumbers();
    }

    public static void testNumbers(){
        int primeCount = 0;
        for (int j = 11; j <= 23; j++){
            if (isPrime(j)){
                System.out.println(j + " is a prime number");
                primeCount++;
            }
            if (primeCount ==5){
                System.out.println("the first 5 prime number in given range have been identified");
                break;
            }
        }
    }

    public static boolean isPrime(int num){
        if (num != 1) {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
