package com.ashukulu.javaprograms;

public class MinMaxElementsofArray {
    public static void main(String[] args) {
        int [] nums = {12,9,5,76,3,42,76,22};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if (nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println("Max is "+max);
        for(int i=0; i<nums.length; i++){
            if (nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println("Min is "+min);
    }
}
