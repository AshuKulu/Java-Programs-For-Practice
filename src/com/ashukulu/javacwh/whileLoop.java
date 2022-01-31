package com.ashukulu.javacwh;

public class whileLoop {
    public static void main(String[] args) {
        int n=7;
        int sum = 0;
        int i=1;
        while(i<=n){
            sum += i;
            i++;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
