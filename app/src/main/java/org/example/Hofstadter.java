package org.example;

import java.util.HashMap;

public class Hofstadter {

    // Memoization map to store previously computed values
    private static HashMap<Integer, Integer> memo = new HashMap<>();

    // Recursive function to compute the nth term in the Hofstadter G Sequence
    public static int gSequence(int n) {
        if (n == 0) return 0; // Base case

        if (memo.containsKey(n)) {
            return memo.get(n); // Return cached result if available
        }

        int result = n - gSequence(gSequence(n - 1)); // Recursive formula
        memo.put(n, result); // Store computed value in memoization map

        return result;
    }

    public static void main(String[] args) {
        // Print the first 15 terms of the sequence
        System.out.println("Hofstadter G Sequence:");
        for (int i = 0; i < 15; i++) {
            System.out.println("G(" + i + ") = " + gSequence(i));
        }
    }
}
