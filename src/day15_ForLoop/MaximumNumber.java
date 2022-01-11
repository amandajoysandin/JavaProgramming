package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -2147483648; //any user entered number will be greater than this
// max = 12
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int num = scan.nextInt(); //1, 2, 3, 4, 5

            if(num > max) { //is user entered number greater than current max number
                max = num;
            }

        }System.out.println("max = " + max);

    }

}

/*write a program that asks the user to enter a number 5 times.
Return the maximum number.

 */