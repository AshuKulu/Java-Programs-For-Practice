package com.ashukulu.javacwh;

import java.util.Scanner;

public class GreetJava {
    public static void main(String[] args) {
        System.out.print("Enter Your Name: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Hello "+str+"! Have a Good Day.");
    }
}
