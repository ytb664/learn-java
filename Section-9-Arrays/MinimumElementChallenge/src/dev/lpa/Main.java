package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = readIntegers();
        int min = findMin(array);
        System.out.println(Arrays.toString(array));
        System.out.println(min);

        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    private static int[] readIntegers() {

        Scanner s = new Scanner(System.in);
        String[] splitStrings = s.nextLine().split(",");

        int[] array = new int[splitStrings.length];

        for (int i = 0; i < splitStrings.length; i++) {
            array[i] = Integer.parseInt(splitStrings[i].trim());
        }

        return array;
    }

    private static int findMin(int[] array) {

        int min = array[1];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    private static void reverse(int[] array) {

        int[] secArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < array.length; i++) {
            array[i] = secArray[secArray.length - 1 - i];
        }
    }
}
