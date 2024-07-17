package com.examples.mytests;

import java.util.Scanner;

public class Palindrome {
    public static String reverse(String word) {
        String reverse_word = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse_word += word.charAt(i);
        }
        return reverse_word;
    }

    public static boolean checkPalindrome(String reverse_word, String word) {
        return word.equals(reverse_word);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a word: ");
        String word = scanner.nextLine();
        scanner.close();

        System.out.println("Word: " + word);
        String reverse_word = Palindrome.reverse(word);
        System.out.println("Reverse: " + reverse_word);

        Boolean check = Palindrome.checkPalindrome(reverse_word, word);
        if (check) {
            System.out.println("Word is a Palindrome!");
        } else if (!check) {
            System.out.println("Word is NOT a Palindrome.");
        }
    }
}
