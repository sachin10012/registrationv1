package com.api;

import java.util.Scanner;

public class B {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a string to check if it's a palindrome:");
            String input = scanner.nextLine();
            String cleanedInput = input.replaceAll("[\\W_]", "").toLowerCase();

            if (isPalindrome(cleanedInput)) {
                System.out.println("\"" + input + "\" is a palindrome.");
            } else {
                System.out.println("\"" + input + "\" is not a palindrome.");
            }

            scanner.close();
        }

        private static boolean isPalindrome(String str) {
            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }




