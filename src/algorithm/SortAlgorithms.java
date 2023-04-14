package algorithm;

import java.util.Arrays;

public class SortAlgorithms {
    public static void mergeSort(int[] in) {

    }
    public static void selectionSort(int[] in) {

    }
    public static void quickSortRecursive(int[] in) {

    }
    public static void radixSort(int[] in) {

    }
    public static void timSort(int[] in) {

    }
    public static void bubbleSort(int[] in) {
        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in.length - i - 1; j++) {
                if(in[j] > in[j + 1]) {
                    int temp = in[j];
                    in[j] = in[j + 1];
                    in[j + 1] = temp;
                }
            }
        }
    }
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int chave = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > chave){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = chave;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[] {9, 8, 4, 1, 8, 2, 3, 4, 2, 3, 1, 2, 4, 8, 9, 5, 6, 2, 1, 3, 4, 8, 2, 3, 7, 8, 5, 4, 9, 2, 5, 6, 1, 9, 5, 7, 9, 0};
        int[] expected = new int[] {0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9};
        //testBubble(arr, expected);
        testInsertion(arr, expected);
    }
    public static void testBubble(int[] arr, int[] expected) {
//        printArray(arr);
        bubbleSort(arr);
//        printArray(arr);
        if(!Arrays.equals(arr, expected)) throw new RuntimeException("error on bubblesort");
    }
    public static void testInsertion(int[] arr, int[] expected){
        printArray(arr);
        insertionSort(arr);
        printArray(arr);
        if(!Arrays.equals(arr, expected)) throw new RuntimeException("error on bubblesort");
    }

    public static void printArray(int[] arr) {
        for(int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
