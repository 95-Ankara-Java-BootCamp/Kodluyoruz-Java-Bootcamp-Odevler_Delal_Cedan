package SecondWeek;

    /*
    * Midterm Degree = 30%
    * final Degree = 70%
    */

import java.util.Scanner;

public class GradeCalculation {

    static double average = 0;

    static double calculateAverage(double midtermDegree, double finalDegree) { //to calculate our average
        average = (midtermDegree * 0.30) + (finalDegree * 0.70);
        System.out.println("Your Average : " + average);

        return average;
    }

    private static void letterGrade(double average) { // to take our letter grade

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

        double midtermDegree , finalDegree;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Midterm Note :");
        midtermDegree = scan.nextDouble();

        System.out.print("Enter Your Final Nore :");
        finalDegree = scan.nextDouble();

        if ((midtermDegree < 0 || midtermDegree > 100) || (finalDegree < 0 || finalDegree > 100)) {

            System.out.println("Sorry Wrong Data.Please make sure that your grade between 0 and 100");

        } else {

            calculateAverage(midtermDegree, finalDegree);
            letterGrade(average);
        }

    }
}
