package com.ashukulu.javacwh;

public class LargestAmongThree {
    public static void main(String[] args) {
        int a=11;
        int b=9;
        int c=10;
        if(a>b){
            if(a>c){
                System.out.println(a);
            }else if (a<c){
                System.out.println(c);
            }
        } else if(a<b){
            if(b>c){
                System.out.println(b);
            } else if(b<c){
                System.out.println(c);
            }
        }
    }
}
