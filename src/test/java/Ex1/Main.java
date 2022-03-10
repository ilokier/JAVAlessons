package Ex1;

import java.util.Random;
import java.util.Scanner;


public class Main {


    public static void main(String args[]) {
        int numberToGuess = new Random().nextInt(100);
        Scanner scanner = new Scanner(System.in);
        System.out.println(numberToGuess);

        for (int i = 0; i < 5; i++) {
            System.out.println("Choose number between 0 and 100");
            int choice = scanner.nextInt();
            if (choice == numberToGuess) {
                System.out.println("You guessed it!");
                break;
            } else if (choice > numberToGuess) {
                System.out.println("Your number is GREATER than the one you are trying to guess");
            } else if (choice < numberToGuess) {
                System.out.println("Your number is LOWER than the one you are trying to guess");

            }System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);
        }
    }
}

