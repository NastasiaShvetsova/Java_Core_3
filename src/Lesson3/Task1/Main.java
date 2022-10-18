package Lesson3.Task1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer[] array = {1, 2, 3, 4};

        swap(array, 1, 3);
    }
    public static void swap(Object[] arr, int index1, int index2) {
        System.out.println("Was before: " + Arrays.toString(arr));
        Object sw = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = sw;
        System.out.println("The result of the replacement: " + Arrays.toString(arr));
    }
}