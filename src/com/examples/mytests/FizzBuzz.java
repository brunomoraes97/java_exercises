package com.examples.mytests;

public class FizzBuzz {

    public static void fizzBuzz() {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        fizzBuzz();
    }

}
