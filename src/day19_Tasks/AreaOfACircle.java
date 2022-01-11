package day19_Tasks;

import java.util.Scanner;

public class AreaOfACircle {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);

    double radius;
    double perimeter = 0;
    double area = 0;
    double diameter = 0;
    String answer = "";

        while (true){ // this forces the loop to run infinitely since the condition will always be true
        System.out.println("Enter the radius of the circle");
        radius = scan.nextDouble(); //uses the scanner to get a user input integer and assigns that to radius

        if (radius<=0){
            System.err.println("Invalid Entry for the radius of the circle");
            System.exit(0); //completely exits the program
        }


        perimeter =  radius * 2 * 3.14;
        area = radius * radius * 3.14;
        diameter = radius * 2;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
        System.out.println("diameter = " + diameter);

        System.out.println("Would you like to calculate another circle?");
        answer = scan.next();

        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
            //^if the user does not enter yes or no, it will be an invalid entry
            System.err.println("Invalid entry. Please re-enter");
            System.out.println("Would you like to calculate another circle?");
            answer = scan.next();
        }

        if (answer.equalsIgnoreCase("no")){
            System.out.println("Thank you for using Cydeo Circle Calculator APP");
            break;
        }

    }

        scan.close();
}
}


/*	1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message
				"Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

			Hint: Ones Uzun knows all the formulas you need for this task*/

