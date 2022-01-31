package com.ashukulu.javacwh;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        System.out.print("Enter Your Income in Lakhs: ");
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        float tax = 0;
        if(income<2.5f){
            tax = tax + 0;
            System.out.println("Tax to be paid is "+tax+" Lakhs");
        } else if(income>2.5f && income<=5.0f) {
            tax = tax + 0.05f * (income - 2.5f);
            System.out.println("Tax to be paid is "+tax+" Lakhs");
        } else if(income>5.0f && income<=10.0f) {
            tax = tax + 0.05f * 2.5f;
            tax = tax + 0.15f * (income - 5.0f);
            System.out.println("Tax to be paid is "+tax+" Lakhs");
        }  else if(income>10.0f) {
            tax = tax + 0.05f * 2.5f;
            tax = tax + 0.15f * 5.0f;
            tax = tax + 0.3f * (income - 10.0f);
            System.out.println("Tax to be paid is "+tax+" Lakhs");
        }
    }
}
