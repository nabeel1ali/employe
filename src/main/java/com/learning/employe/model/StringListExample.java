package com.learning.employe.model;

import java.util.ArrayList;
import java.util.Scanner;

public class StringListExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringList = new ArrayList<>();

        // Prompt the user for input until they enter "exit"
        while (true) {
            System.out.print("Enter a value (or 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break; // Exit the loop if the user enters "exit"
            }

            stringList.add(input); // Add the input to the list
        }

        // Display the list
        System.out.println("List of values entered by the user:");
        for (String value : stringList) {
            System.out.println(value);
        }

        // Close the scanner
        scanner.close();
    }
}
