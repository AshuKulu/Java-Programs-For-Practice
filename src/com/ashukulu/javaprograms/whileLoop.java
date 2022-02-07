package com.ashukulu.javaprograms;

public class whileLoop {
    public static void main(String[] args) {
        //sum of first n natural numbers
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
