package com.ashukulu.javaprograms;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for first number: ");
        int n1= sc.nextInt();
        n1 = ( n1 > 0) ? n1 : -n1;
        System.out.println("Enter value for second number: ");
        int n2= sc.nextInt();
        n2 = ( n2 > 0) ? n2 : -n2;

        //1st method
        int lcm = Math.max(n1, n2);
        //int lcm = (n1>n2) ? n1 : n2;
        while(true){
            if(lcm%n1==0 && lcm%n2==0){
                System.out.printf("LCM of %d and %d is : %d", n1,n2,lcm);
                break;
            }
            ++lcm;
        }

        //2nd method
        //LCM from GCD
        //LCM=(1st number*2nd number)/GCD
        int gcd=0;
        for(int i=1; i<=n1 && i<=n2; i++){
            if(n1%i==0 && n2%i==0){
                gcd = i;
            }
        }
        lcm=(n1*n2)/gcd;
        System.out.printf("\nLCM of %d and %d is : %d", n1,n2,lcm);
    }
}
