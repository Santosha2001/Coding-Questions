package com.xworkz.com.xworkz.algorithms;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] array = {24, 8, 2, 98, 25, 67};
        bubbleSort(array);

        //output: 2 8 24 25 67 98
    }
}
