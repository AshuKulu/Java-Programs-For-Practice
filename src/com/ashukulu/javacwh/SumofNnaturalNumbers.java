package com.ashukulu.javacwh;

public class SumofNnaturalNumbers {
    //recursive function to find sum of n natural numbers
    static int sum=0;
    static int recsum(int n){
        if(n>0){
            sum=n+recsum(n-1);
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(recsum(9));

        //using iterative loop
        int n=7;
        int i=1;
        int s=0;
        while(i<=n){
            s += i;
            i++;
            System.out.println(s);
        }
        System.out.println(s);
    }
}
