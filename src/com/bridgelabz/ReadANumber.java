package com.bridgelabz;

public class ReadANumber {
    public static void main(String[] args) {
        int  num = 1101001000;
        int unit = num % 10;
        int tenHundred = num % 100000 / 10000;
        System.out.println("The unit number is  " +unit);
        System.out.println("The ten hunderd number is  " +tenHundred);
    }
}
