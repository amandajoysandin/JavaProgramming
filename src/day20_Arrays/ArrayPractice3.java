package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt();

        if(length<=0){    //we are using this to make sure the length will not be negative or 0
            System.err.println("Invalid Entry");
            System.exit(0); // it will exit the program if they enter a neg or 0
        }

        int[] numbers = new int[length]; //array needs to have enough capacity to contain
                                        //all the elements the user will enter

        for (int i = 0; i < length; i++) {
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt(); //5
        }

        System.out.println(Arrays.toString(numbers));
scan.close();


    }
}
