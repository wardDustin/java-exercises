package org.launchcode.java.demos.java4python;

import java.util.Scanner;

/**
 * From "Java for Python Programmers"
 */
public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Hello, stranger! What is your name?");
            answer = scanner.next();
        } while(answer == null);
        System.out.println("Hello, " + answer);
    }
}
