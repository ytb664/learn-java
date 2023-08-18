package dev.lpa;

public class Main {

    public static void main(String[] args) {

        int[] array = SortedArray.getIntegers(3);
        int[] newArray = SortedArray.sortIntegers(array);

        SortedArray.printArray(newArray);
    }
}
