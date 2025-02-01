package org.example;

import java.util.Scanner;

public class HofstadterDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hofstadter G Sequence Driver Program");
        System.out.print("Enter a value for n: ");
        int n = scanner.nextInt();

        int result = Hofstadter.gSequence(n);
        System.out.println("G(" + n + ") = " + result);

        // Optional: Print first 15 terms for verification
        System.out.println("\nFirst 15 terms of Hofstadter G Sequence:");
        for (int i = 0; i < 15; i++) {
            System.out.println("G(" + i + ") = " + Hofstadter.gSequence(i));
        }

        scanner.close();
    }
}
