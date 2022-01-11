package day19_Tasks;

import java.util.Scanner;

public class AreaAndPerimeterOfASquare {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the side of the square:");
            int side = scan.nextInt();

            if (side <= 0) {
                System.out.println("Invalid Entry for the side of the square");
                System.exit(0);
            }

            System.out.println("Area is: " + side * side + ", " + "perimeter is " + 4 * side);

            System.out.println("Would you like to calculate another square?");
            String a = scan.next();

            while (!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))) {
                System.out.println("Invalid entry, please re-enter the answer:");
                a = scan.next();
            }

            if (a.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                System.exit(0);
            }

        }


    }
}

/*Write a program that can calculate the area and perimeter of a Square:
			1. Ask the user "Enter the side of the square:"
				if user enters 0 or negative numbers, terminate the program after
				displaying the error message "Invalid Entry for the side of the square"

			2. Display:
					1. Area of square
					2. Perimeter of square

			3. Ask the user "Would you like to calculate another Square?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

			Hint: Ones Uzun knows all the formulas you need for this task*/