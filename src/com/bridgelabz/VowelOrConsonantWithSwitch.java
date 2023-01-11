package com.bridgelabz;

import java.util.Scanner;

public class VowelOrConsonantWithSwitch {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}
