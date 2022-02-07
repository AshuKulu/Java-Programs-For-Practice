package com.ashukulu.javaprograms;

import java.util.Scanner;

public class EscapeSequence {
    public static void main(String[] args) {
        System.out.print("Enter Your Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("\"Dear "+name+",\n\tWelcome to #Octothorpe\'s matrix.\nThanks a lot for visiting!\"");
    }
}
