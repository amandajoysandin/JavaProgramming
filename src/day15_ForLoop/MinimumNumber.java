package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int min = 2147483647; //any user entered number will be greater than this
// max = 12
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int num = scan.nextInt(); //1, 2, 3, 4, 5

            if(num < min) { //is user entered number greater than current max number
                min = num;
            }

        }System.out.println("min = " + min);

    }

}
/*Ask a user to enter 5 numbers.
 Write a program that can calculate the sum of the numbers*/