package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] firstArray = getRandomArray(5);
        System.out.println(Arrays.toString(firstArray));
        int firstLen = firstArray.length;
        Arrays.sort(firstArray);

        int[] secondArray = new int[firstLen];
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = firstArray[firstLen - 1 - i];
        }
        System.out.println(Arrays.toString(secondArray));
    }

    private static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] newInt = new int[len];

        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }
}
