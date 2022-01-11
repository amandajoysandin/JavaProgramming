package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        double sum = 0;
        // 1+2 = 3....
        for (int i = 1; i < 101; i++) { //i is between 1 and 100
            sum += i;
        }
        System.out.println(sum); // 5050
        System.out.println("-------------------");

        int total = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        total = scan.nextInt();




    }
}
/* Write a program that can calculate the sum of all integers between 1 to 100*/