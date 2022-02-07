package com.ashukulu.javaprograms;

public class SwapInteger {
    public static void main(String[] args) {
        //Method-1 : Creating third variable
        int a=50;
        int b=70;
        System.out.println("Before swapping A & B are "+a+" and "+b+" respectively.");
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println("After swapping A & B are "+a+" and "+b+" respectively.");

//        //Method-2 : By addition and substraction of variables
//        a=a-b;
//        b=a+b;
//        a=b-a;
//        System.out.println("After swapping A & B are "+a+" and "+b+" respectively.");

        //Method-3 : Using bitwise operators
        a=a^b;
        b=a^b;
        a=b^a;
        System.out.println("After swapping A & B are "+a+" and "+b+" respectively.");
    }
}
