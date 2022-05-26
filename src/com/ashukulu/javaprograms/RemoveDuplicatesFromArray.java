package com.ashukulu.javaprograms;

import java.util.Arrays;
public class RemoveDuplicatesFromArray {
    static int funRemoveDuplicate(int array[], int n) {
        if (n == 0 || n == 1)
            return n;
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++)
            if (array[i] != array[i + 1])
                temp[j++] = array[i];
        temp[j++] = array[n - 1];
        for (int i = 0; i < j; i++)
            array[i] = temp[i];
        return j;
    }

    public static void main(String[] args) {
        int inputArray[] = {10,15,22,13,10,29,15,13,10,9,10,93,93};
        Arrays.sort(inputArray);
        int n = inputArray.length;
        n = funRemoveDuplicate(inputArray, n);
        for (int i = 0; i < n; i++)
            System.out.print(inputArray[i] + ", ");
            System.out.println(": Array without duplicate elements.");
    }
}
