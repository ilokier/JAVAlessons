package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert size of the table");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Table size is " + size);

        int maxNumber = 0;
        int sum = 0;
       // int counter = numbers.length;

        for (int i = 0; i < size; i++) {
            System.out.println("Insert number " + (i+1));
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
            maxNumber = numbers[i];
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[1];
            }
        }
        double average = sum/size;
        System.out.println("The average of your numbers was: " + average);
        System.out.println("Your highest number was: " + maxNumber);
    }
}
