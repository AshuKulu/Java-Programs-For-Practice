package com.ashukulu.javaprograms;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //for integer input
        int ip = sc.nextInt();
        int x=ip;
        int y=0;
        while(x>0){
            int z=x%10;
            y=y*10+z;
            x=x/10;
        }
        if (ip==y){
            System.out.println("Pallindrome Found");
        } else {
            System.out.println("Not a Pallindrome");
        }

        //for string input
        String input= sc.next();
        String reverse="";
        for(int i=(input.length())-1; i>=0; i--){
            reverse = reverse+input.charAt(i);
        }
        System.out.println(input);
        System.out.println(reverse);
        if(reverse.equals(input)){
            System.out.println("Pallindrome Found");
        } else {
            System.out.println("Not a Pallindrome");
        }
    }
}
