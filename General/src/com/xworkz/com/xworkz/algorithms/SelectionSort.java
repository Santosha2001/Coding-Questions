package com.xworkz.com.xworkz.algorithms;

public class SelectionSort {

    public static void selectionSort(int[] array) {
        int length = array.length;

        for (int i = 0; i < length - 1; i++) {

            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {

        int[] array = {98, 42, 67, 12, 8, 65};
        selectionSort(array);
    }
}
