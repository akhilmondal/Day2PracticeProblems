package com.bridgelabz;

import java.util.Scanner;

public class SumOfNumberWithWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to count the sum. ");
        int num = scanner.nextInt();
        int addition = 0;
        int i = 0;
        int j = 0;
        while (i <= num) {
            addition = addition + i;
            System.out.print(i);
            while (j < num) {
                System.out.print(" + ");
                j++;
                break;
            }
            i++;
        }
        System.out.println("");
        System.out.println("The sum of the numbers from 0 to " +num +" is: " +addition);
    }
}
