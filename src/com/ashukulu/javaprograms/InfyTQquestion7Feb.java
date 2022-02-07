package com.ashukulu.javaprograms;

import java.util.Scanner;

public class InfyTQquestion7Feb {
    public static boolean perfectSquare(int x)
    {
        if (x >= 0) {
            int ps = (int)Math.sqrt(x);
            return ((ps * ps) == x);
        }
        return false;
    }
    public static void main(String[] args) {
        int row, col;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter rows of matrix: ");
            row = sc.nextInt();
            System.out.println("Enter columns of matrix: ");
            col = sc.nextInt();
            int inmatrix[][]=new int[row][col];
            System.out.println("Enter elements of matrix: ");
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    inmatrix[i][j]=sc.nextInt();
                }
            }
            int temparr[]=new int[row*col];
            boolean lToR = true;
            for(int l=0; l<temparr.length; l++){
                for(int i=0; i<row; i++) {
                    if (lToR) {
                        for (int j=0; j<col; j++) {
                            temparr[l]=inmatrix[i][j];
                        }
                    } else {
                        for (int j=col-1; j>=0; j--) {
                            temparr[l]=inmatrix[i][j];
                        }
                    }
                    lToR=!lToR;
                }
            }
            int sum = 0;
            for(int k:temparr){
                sum+=k;
            }
            if (perfectSquare(sum))
                System.out.print(Math.sqrt(sum));
            else
                System.out.print("-1");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
