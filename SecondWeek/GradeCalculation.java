package SecondWeek;

import java.util.Scanner;

public class GradeCalculation {

    static double average = 0;

    static double calculateAverage(double midtermNote, double finalNote) {
        average = (midtermNote * 0.30) + (finalNote * 0.70);
        System.out.println("Your Average : " + average);

        return average;
    }

    private static void letterGrade(double average) {

        if (average < 100 && average >= 70) {
            System.out.println("congratulations, Your Letter Grade : AA");
        } else if (average < 70 && average >= 50) {
            System.out.println("congratulations, Your Letter Grade : BB");
        } else if (average < 50 && average >= 35) {
            System.out.println("congratulations, Your Letter Grade : CC");
        } else if (average < 35) {
            System.out.println("Your Letter Grade : FF");
        }

    }

    public static void main(String[] args) {

        double midtermNote , finalNote;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Midterm Note :");
        midtermNote = scan.nextDouble();

        System.out.print("Enter Your Final Nore :");
        finalNote = scan.nextDouble();

        if ((midtermNote < 0 || midtermNote > 100) || (finalNote < 0 || finalNote > 100)) {

            System.out.println("Sorry Wrong Data.Please make sure that your grade between 0 and 100");

        } else {

            calculateAverage(midtermNote, finalNote);
            letterGrade(average);
        }

    }
}
