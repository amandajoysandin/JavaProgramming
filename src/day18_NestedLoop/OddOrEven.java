package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("Enter a number.");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is an even number");
            } else {
                System.out.println(num + " is an odd number");
            }
            System.out.println("Would you like to enter another number?");
            String a = scan.next().toLowerCase();

            while( !(a.equals("yes") || a.equals("no"))) {
    System.err.println("Please reenter- would you like to enter another number");
                break;
            }
        }
    }}
/*Write a program that asks user to enter a number , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

                If user enters invalid answer, repeat the previous steps*/