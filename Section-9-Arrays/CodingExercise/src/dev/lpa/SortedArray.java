package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    // write code here

    public static int[] getIntegers(int len) {

        int[] array = new int[len + 1];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < len; i++) {
            array[i] = s.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;

            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}