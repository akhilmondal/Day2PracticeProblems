package com.bridgelabz;

import java.util.Scanner;

public class PalindromeWithForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number which you want to reverse: ");
        int num = scanner.nextInt();
        int refNum = num;
        int reverse = 0;
        int remainder;
        for ( ; refNum != 0; refNum= refNum / 10) {
            remainder = refNum % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("reverse number is: " +reverse);
        System.out.println(num);
        if (num == reverse) {
            System.out.println("It's a palindrome number.");
        }else {
            System.out.println("It's not  a palindrome number. ");
        }
    }
}
