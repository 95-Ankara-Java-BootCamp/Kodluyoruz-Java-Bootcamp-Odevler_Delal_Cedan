package First1Week;

import java.util.Scanner;

public class Homework_3 {

    public static void main(String[] args) {

        // Fibonacci Series for first 10 terms

        int n =10 , fibo1 = 0, fibo2 = 1;

        System.out.print("Fibonacci Series for " + n + " terms: ");

        for (int i = 1; i <= n; ++i) {

            System.out.print(fibo1 + " + ");

            int fibo3 = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibo3;
        }
    }
}


