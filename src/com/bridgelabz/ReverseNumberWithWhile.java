package com.bridgelabz;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class ReverseNumberWithWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number which you want to reverse: ");
        int num = scanner.nextInt();
        int reverse = 0;
        int reminder;
        while (num != 0) {
            reminder = num % 10;
            reverse = reverse * 10 + reminder;
            num = num / 10;
        }
        System.out.println("The reverse form of the given number is: " +reverse);
    }
}
