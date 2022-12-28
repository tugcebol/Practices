package Practices_From_Youtube.Loops;

import java.util.Scanner;

public class Question_02 {

    // Write a program which reads a positive number N from the user
    // then indicates if N is prime or not.
    // N is a prime number if its divisors are only 1 and N.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scan.nextInt();

        int counter=1;

        for (int i = 2; i <number ; i++) {
            if (number % i == 0){
                counter += i;
            }
        }

        System.out.println(counter == 1
                ?
                "The number " +number + " is a prime number"
                :
                "The number " + number + " is not a prime number.");
    }


}
