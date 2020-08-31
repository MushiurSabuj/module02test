package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 1, b = 2, k;
        Scanner scanner = new Scanner(System.in);
        k = 0;
        System.out.println("Enter any number:");
        int n = scanner.nextInt();
        System.out.println("1 1");
        while (k <= n) {
            k = a + b;
            if (k >= n)
                break;
            System.out.println(k + " ");
            a = b;
            b = k;
        }
        fibonacciSeries(100);


    }

    private static void fibonacciSeries(int n) {
        int a = 1, b = 2, k;
        Scanner scanner = new Scanner(System.in);
        k = 0;
        System.out.println("Enter any number:");
        int fibonacciSeries = scanner.nextInt();
        System.out.println("1 1");
        while (k <= n) {
            k = a + b;
            if (k >= n)
                break;
            System.out.println(k + " ");
            a = b;
            b = k;

            /**
             * Write a function to find fibonacciSerie of 100
             * */
        }

    }
}

