package com.ashukulu.javaprograms;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.print("Enter number of day of week: ");
        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();
        switch (var) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wedday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Satday");
            case 7 -> System.out.println("Sunday");
        }
    }
}
