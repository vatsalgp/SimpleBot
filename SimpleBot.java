package simplebot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet();
        guessAge();
        count();
        test();
        end();
    }

    static void greet() {
        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2020.");
        System.out.println("Please, remind me your name.");
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Tell me the remainders of dividing your age by 3.");
        int rem3 = scanner.nextInt();
        System.out.println("Tell me the remainders of dividing your age by 5.");
        int rem5 = scanner.nextInt();
        System.out.println("Tell me the remainders of dividing your age by 7.");
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        System.out.println("Enter a number.");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++)
            System.out.println(i + "!");
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        while (scanner.nextInt() != 2)
            System.out.println("Please, try again.");
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
