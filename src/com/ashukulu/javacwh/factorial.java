package com.ashukulu.javacwh;

public class factorial {
    //recursive factorial method
    static int factorial(int x){
        if(x==0){
            return 1;
        } else{
            return x*=factorial(x-1);
        }
    }

    public static void main(String[] args) {
        int fac=0;
        int n=2;
        for(int i=0; i<=n; i++){
            if(i==0){
                fac=1;
            }else{
                fac*=i;
            }
            System.out.println(fac);
        }
        System.out.println("Factorial of "+n+" is = "+fac);

        //Using recursive method
        System.out.println(factorial(8));

    }
}
