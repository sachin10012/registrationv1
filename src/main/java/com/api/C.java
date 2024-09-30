package com.api;

import java.util.Arrays;

public class C
{
    public static void main(String[] args) {
            int[] array = {5, 2, 8, 1, 3};

            // Bubble Sort
            bubbleSort(array);

            System.out.println("Sorted array: " + Arrays.toString(array));
        }

        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    // Swap if the element found is greater than the next element
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }


