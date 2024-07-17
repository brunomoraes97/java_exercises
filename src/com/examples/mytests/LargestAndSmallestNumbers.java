package com.examples.mytests;

public class LargestAndSmallestNumbers {
    public static void findLargestAndSmallest() {
        int[] numbers = {5, 3, 2, 4, 1};
        int smallest = numbers[0]; // 5
        int largest = numbers[0]; // 5

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            } else if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }

    public static void main(String[] args) {
        findLargestAndSmallest();
    }
}
