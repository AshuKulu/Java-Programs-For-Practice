package com.ashukulu.javacwh;

public class multiplicationTable {
    public static void main(String[] args) {
        int i=1;
        int n=7;
        int p=0;
        while(i<=10){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
//            p+=n*i;
//            System.out.println(p);
            i++;
        }
    }
}
