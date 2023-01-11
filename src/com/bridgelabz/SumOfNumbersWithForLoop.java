package com.bridgelabz;

import java.util.Scanner;

public class SumOfNumbersWithForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to count the sum. ");
        int num = scanner.nextInt();
        int addition = 0;
        for (int i = 0; i <= num; i++) {
            System.out.print(i);
            for (int j = 0; j < num; j++) {
                System.out.print(" + ");
                break;
            }
            addition = addition + i;
        }
        System.out.println();
        System.out.println("The sum of the numbers from 0 to " +num +" is: " +addition);
    }
}
