package problems;

import java.util.Scanner;

public class FindFactorials {
    /**
     * factorials of n n! = 1 * 2 * 3 * ......* n
     * */

    public static void main(String[] args) {
        int number;
        int factorial =1;
        //long factorial =1;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the Number:");
        number=scanner.nextInt();
        scanner.close();

        if(number <0)
            System.out.println("Can't find the number");
        else if(number<=1)
            System.out.printf("%d!=%d", number, factorial);
        else {
            for(int counter = number; counter >= 2; counter--){
                factorial =factorial *counter;
            }
            System.out.printf("%d!=%d", number, factorial);
        }
    }
}
