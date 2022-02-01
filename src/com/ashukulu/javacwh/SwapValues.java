package com.ashukulu.javacwh;

import java.util.Scanner;

public class SwapValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value : ");
        String v1= sc.next();
        System.out.println("Enter first value : ");
        String v2= sc.next();
        System.out.println("Values before swapping are '"+v1+"' and '"+v2+"'.");
        String temp = v1;
        v1=v2;
        v2=temp;
        System.out.println("Values after swapping are "+v1+" and "+v2+"'.");
    }
}
