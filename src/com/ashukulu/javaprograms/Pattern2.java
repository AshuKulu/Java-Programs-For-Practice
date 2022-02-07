package com.ashukulu.javaprograms;

public class Pattern2 {
    //pattern method
    static void pattern2(int n){
        for(int i=n; i>=0; i--){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Pattern 2");
        for(int i=5; i>0; i--){
            for(int j=0; j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        pattern2(5);
    }
}
