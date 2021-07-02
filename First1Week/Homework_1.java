package First1Week;

import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) {
        double number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your average:");
        number = input.nextDouble();

        if (number < 100 && number >= 90) {
            System.out.println("AA");
        } else if (number < 90 && number >= 80) {
            System.out.println("BA");
        } else if (number < 80 && number >= 70) {
            System.out.println("BB+");
        } else if (number < 70 && number >= 60) {
            System.out.println("BB");
        } else if (number < 60 && number >= 50) {
            System.out.println("BC");
        } else if (number < 50 && number >= 45) {
            System.out.println("CC");
        } else if (number < 45) {
            System.out.println("FF");
        }

    }
}