package practice_12_011_2021;

import java.util.Scanner;

public class IfElseSmallTasks {
    public static void main(String[] args) {
        /*Create a program that will accept a number and it will print these statements
        according to condition:
        This is positive number/// this is a negative number
         */

        int n =-4;

        if(n>0) {
            System.out.println("This is a positive number");
        }else{
            System.out.println("This is a negative number");}
        System.out.println("----------");

/* Take values of length and width of a rectangle from user and
check if it is square or not.
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length");
        double length = input.nextDouble();
        System.out.println("Enter the width");
        double width = input.nextDouble();

        if(length==width) {
            System.out.println("This is a square");
        }else{
            System.out.println("This is a rectangle");}

            System.out.println("--------------");

        /*Write a program to print absolute value of a number entered by user*/

        System.out.println("Enter a value");
        int num = input.nextInt();

        if (num<0){
            num = num*-1;
            System.out.println("Absolute value is " + num );
        }else {
            System.out.println("Absolute value is " + num);

        }
    }
}
