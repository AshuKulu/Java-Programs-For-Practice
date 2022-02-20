package com.ashukulu.javaprograms;

public class PrintAlphabets {
    public static void main(String[] args) {
        char ch;
        for(ch='A'; ch<='Z'; ++ch){
            System.out.print(ch+" ");
        }
        System.out.println();
        for(ch='a'; ch<='z'; ++ch){
            System.out.print(ch+" ");
        }
    }
}
