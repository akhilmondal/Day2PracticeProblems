package com.bridgelabz;

import java.util.Scanner;

public class NumToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a single digit number: ");
        int num = scanner.nextInt();
        if (num < 10){
            String Word[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            String value = Word[num];
            System.out.println("The word form of the number " +num +" is " +value);
        }else{
            System.out.println("Try single digit number only. For multiple digits, i never code yet ! ");
        }

    }
}
