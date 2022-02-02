package com.ashukulu.javacwh;

public class pattern {
    //pattern method
    static void pattern1(int n){
        for(int i=0; i<n; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        //using foor-loop
        System.out.println("pattern 1");
        for(int i=0; i<5; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\nPattern 2");
        for(int i=5; i>0; i--){
            for(int j=0; j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //using method
        pattern1(7);
    }
}
