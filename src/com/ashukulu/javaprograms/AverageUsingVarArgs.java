package com.ashukulu.javaprograms;

public class AverageUsingVarArgs {
    static int sum=0;
    static int avg(int x, int ... arr){
        for(int i : arr){
            sum+=i;
        }
        return sum/arr.length;
    }

    public static void main(String[] args) {
        System.out.println(avg(1,2,3,4,5,6,7,8,9));
    }
}