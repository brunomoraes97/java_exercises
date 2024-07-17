package com.examples.mytests;

import java.util.Scanner;

public class FactorialNumber {

    public static int calculate(int number) {
        int result = 1;
        for (int i = number; i > 0; i--) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a number: ");
        String number_string = scanner.nextLine();
        int number = Integer.parseInt(number_string);
        int result = FactorialNumber.calculate(number);
        System.out.println(result);
    }

}
