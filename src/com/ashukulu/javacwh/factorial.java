package com.ashukulu.javacwh;

public class factorial {
    public static void main(String[] args) {
        int fac=1;
        int n=8;
        for(int i=1; i<=n; i++){
//      for(int i=0; i<=n; i++){
//            if(i==0 || i==1){
//                fac=1;
//            }else{
//                fac*=i;
//            }
            fac*=i;
            System.out.println(fac);
        }
    }
}
