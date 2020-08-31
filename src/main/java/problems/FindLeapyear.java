package problems;

import java.util.Scanner;

public class FindLeapyear {
    //private static void findLeapyear(int year) {


            /**
             * All leap years are divisible by 4 except century years are divisible by 4 and 400
             * If century years are divisible by 4 but not divisible by 400 that will not be leap year
             */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("enter a year you would like to see:");
        year = scanner.nextInt();
        scanner.close();

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " Is leap year!");
        } else if (year % 400 == 0) {
            System.out.println(year + " Is leap year");
        } else {
            System.out.println(year + " Is not leapyear");

        }
    }

}

    /*private static void findLeapyear(int year) {
        Scanner scanner = new Scanner(System.in);
        //int year;
        System.out.println("enter a year you would like to see:");
        year = scanner.nextInt();
        scanner.close();

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " Is leap year!");
        } else if (year % 400 == 0) {
            System.out.println(year + " Is leap year");
        } else {
            System.out.println(year + " Is not leapyear");



    }*/
