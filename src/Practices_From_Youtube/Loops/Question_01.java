package Practices_From_Youtube.Loops;

import java.util.Scanner;

public class Question_01 {

    // Write a program that reads an integer between 1 and 10 from the user.

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number between 1 and 10: ");

        int number = scan.nextInt();

        while (number < 1 || number > 10) {

            System.out.println(number + " is not between 1 and 10. Try again: ");
            number = scan.nextInt();

        }

        System.out.println(number + " is between 1 and 10. Thanks!");

    }
}

