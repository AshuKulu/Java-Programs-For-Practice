package com.ashukulu.javaprograms;

import java.util.Scanner;

public class fibonaciNthTerm {
    static int fib(int n){
        if(n==1 | n==2){
            return n-1;
        } else{
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter which term you want from fibonacci series: ");
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        System.out.println(fib(h));
    }
}
