package com.api;
   import java.util.Scanner;

    public class F {
            public static void main(String[] args) {
                int[] arr = {64, 34, 25, 12, 22, 11, 90};
                bubbleSort(arr);
                System.out.println("Sorted array:");
                printArray(arr);
            }

            static void bubbleSort(int[] arr) {
                int n = arr.length;
                boolean swapped;

                for (int i = 0; i < n - 1; i++) {
                    swapped = false; // Flag to check if a swap was made

                    for (int j = 0; j < n - 1 - i; j++) {
                        if (arr[j] > arr[j + 1]) {
                            // Swap arr[j] and arr[j + 1]
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                            swapped = true; // A swap was made
                        }
                    }

                    // If no swaps were made, the array is already sorted
                    if (!swapped) break;
                }
            }

            static void printArray(int[] arr) {
                for (int num : arr) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
















