package com.ashukulu.javaprograms;

import java.util.Scanner;

public class InfyTQ8Feb2nd1 {
    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(System.in);
            String instr1 = s.next();
            String instr2 = s.next();
            int innum = s.nextInt();
            int s1=instr1.length();
            int s2=instr2.length();
            int big=0;
            if(s1>s2){
                big=s1;
            } else {
                big=s2;
            }
            int it=Math.floorDiv(big,innum);
            boolean b1 = (innum>instr1.length());
            boolean b2 = (innum>instr2.length());
            if(b1 || b2){
                System.out.println(instr1+instr2);
            } else {
                int it2=0;
                int it3=innum;
                for(int i=0; i<=it; i++){
                    for(int j=it2; j<it3; j++){
                        System.out.print(instr1.charAt(j));
                    }
                    for(int k=it2; k<it3; k++){
                        System.out.print(instr2.charAt(k));
                    }
                    it2+=innum;
                    it3+=innum;
                }
            }
        }
        catch (StringIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
