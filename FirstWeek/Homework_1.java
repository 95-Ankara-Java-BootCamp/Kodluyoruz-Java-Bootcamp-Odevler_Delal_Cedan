package FirstWeek;

import java.util.Scanner;
/*
    okul puanlarını harf karşılığını yazan program

*/

public class Homework_1 {
    
    public static void main(String[] args) {
        double number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your average:");
        number = input.nextDouble();

        if (number < 100 && number >= 70) {
            System.out.println("AA");
        } else if (number < 70 && number >= 50) {
            System.out.println("BB");
        } else if (number < 50 && number >= 35) {
            System.out.println("CC");
        } else if (number < 35) {
            System.out.println("FF");
        }

    }
}