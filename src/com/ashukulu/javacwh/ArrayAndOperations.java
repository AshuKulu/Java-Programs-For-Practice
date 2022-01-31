package com.ashukulu.javacwh;

import java.util.Scanner;

public class ArrayAndOperations {
    public static void main(String[] args) {
//        //sum of elements of an array
//        float [] values = {17.35f, 13.22f, 9.8f, 7.45f, 10.7f};
//        float sum=0;
//        for(float element : values){
//            sum+=element;
//        }
//        System.out.println(sum);

//        //searching element in an array
//        int [] roll = {64, 71,93,48,32};
//        int search = 71;
//        boolean found=false;
//        for(int item : roll){
//            if(search==item){
//                found = true;
//                break;
//            }
//        }
//        if(found){
//            System.out.println("Found");
//        }
//        else{
//            System.out.println("Not found");
//        }

//        //average of elements of an array
//        System.out.println("Enter number of students: ");
//        Scanner sc = new Scanner(System.in);
//        int stu = sc.nextInt();
//        int [] marks = new int[stu];
//        System.out.println("Enter marks of students: ");
//        for(int i=0; i<marks.length; i++){
//            Scanner in = new Scanner(System.in);
//            marks[i] = in.nextInt();
//        }
//        for(int i=0; i<marks.length; i++){
//            System.out.print(marks[i]+"\t");
//        }
//        int sum =0;
//        for(int elements : marks){
//            sum+=elements;
//        }
//        float avg=(float)sum/stu;
//        System.out.println("\nAverage = "+avg);

//        //printing array in reverse order
//        int [] nums = {64,71,93,48,32};
//        for(int i=nums.length-1; i>=0; i--){
//            System.out.println(nums[i]);
//        }

//        //maximum and minimum element of array
//        int [] nums = {64, 71,93,-48,32};
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for(int i=0; i<nums.length; i++){
//            if (nums[i]>max){
//                max=nums[i];
//            }
//        }
//        System.out.println("Max is "+max);
//        for(int i=0; i<nums.length; i++){
//            if (nums[i]<min){
//                min=nums[i];
//            }
//        }
//        System.out.println("Min is "+min);

//        //2D array addition
//        int arr1[][]={{1,2,3},{4,5,6}};
//        int arr2[][]={{9,8,7},{6,5,4}};
//        for(int i=0; i<arr1.length; i++){
//            for(int j=0; j<arr1[i].length; j++){
//                arr1[i][j]+=arr2[i][j];
//                System.out.print(arr1[i][j]+" ");
//            }
//            System.out.println();
//        }

//        //reversing an array
//        int [] nums = {64, 71,93,48,32,1,2};
//        int l= nums.length;;
//        int n=Math.floorDiv(l,2);
//        for(int i=0; i<n; i++){
//            //swap a[i] and a[l-1-i]
//            int temp = nums[i];
//            nums[i]=nums[l-1-i];
//            nums[l-1-i]=temp;
//        }
//        for(int item : nums){
//            System.out.print(item+" ");
//        }

        //sort an array
        int [] nums = {64, 71,93,48,32,1,2};
        for(int i=0; i<nums.length; i++){
            for (int j=0; j<nums.length; j++){
                if (nums[i] < nums[j]) {
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        for(int item : nums){
            System.out.print(item+" ");
        }


    }
}