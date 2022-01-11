package day20_Arrays;

import java.util.Scanner;

public class MinMaxNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {//the loop will repeat as many times as the array is long
            System.out.println("Enter a number.");
           numbers[i]= input.nextInt(); //each user entered input will be assigned to the indexes of the array numbers
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) { //if there is a number larger than the assigned max
                max = numbers[i]; //replace the old one if you find a larger number
            }
            if (numbers[i] < min) { //if there is a number larger than the assigned max
                min = numbers[i]; //replace the old one if you find a smaller number
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
