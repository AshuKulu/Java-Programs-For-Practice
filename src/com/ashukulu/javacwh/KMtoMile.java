package com.ashukulu.javacwh;

import java.util.Scanner;

public class KMtoMile {
    public static void main(String[] args) {
        System.out.print("Enter distence in KM: ");
        Scanner sc = new Scanner(System.in);
        float d = sc.nextFloat();
        System.out.println(d*0.621 + " Miles");
    }
}
