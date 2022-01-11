package day12_ScannerPractice;
/*Write a program that can convert Miles to KM
        Ex:
        Enter miles:
        10.0

        output:
        10.0 miles equal to 16.09 kilometers*/


import java.util.Scanner;

public class MilesToKM {
    public static void main(String[] args) {

        System.out.println("Enter Miles:");
        Scanner input = new Scanner(System.in);

        double miles = input.nextDouble();
        double km = miles * (1.609);
        System.out.println(miles + " miles equals to " + km + " kilometers");






    }

}
