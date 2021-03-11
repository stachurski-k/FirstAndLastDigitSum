package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(SumFirstAndLastDigit(504));
    }
    public static int SumFirstAndLastDigit(int number) {
        int sum = 0;
        int firstNumber = 0;
        int lastNumber = 0;

        if (number < 0) {
            return -1;
        } else {
            firstNumber = number;
            lastNumber = number %10;
        }
        while(firstNumber > 9) {
            firstNumber = firstNumber/10;

        }

        sum = firstNumber + lastNumber;
        return sum;

    }
}
