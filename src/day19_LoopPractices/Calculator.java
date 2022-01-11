package day19_LoopPractices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter a math operator");
        char operator = scan.next().charAt(0); // we are calling a string and choosing the first char
                                                    //from the string-- used for getting char input
        if(operator == '+' || operator == '-');{ // if operator is not valid
            System.err.println("Invalid Math Operator: " + operator);
            System.exit(0); //This terminates if they provide an invalid entry
        }

        System.out.println("Enter a number: ");
        int num2 = scan.nextInt();

        if(operator == '-') {
            System.out.println(num1 - num2);
        }else {
            System.out.println(num1 + num2);
        }

    }
}
