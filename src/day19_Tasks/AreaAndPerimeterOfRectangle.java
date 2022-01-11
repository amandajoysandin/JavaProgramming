package day19_Tasks;

import java.util.Scanner;

public class AreaAndPerimeterOfRectangle {
    public static void main(String[] args) {
        while(true){
            Scanner input = new Scanner(System.in);

            double side1;
            double side2;

            System.out.println("Enter side 1 of a rectangle.");
            side1 = input.nextDouble();
            System.out.println("Enter side 2 of a rectangle.");
            side2 = input.nextDouble();
            double area= side1*side2;
            double perimeter= 2*(side1 + side2);

            if (side1<=0 || side2<=0){
                System.err.println("Invalid Numbers.");
                break;
            }
            System.out.println("perimeter = " + perimeter);
            System.out.println("area = " + area);

            System.out.println("Would you like to calculate another rectangle?");
            String answer = input.next();

            if(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.err.println("Invalid answer");
                System.exit(0);
            }
            if(answer.equalsIgnoreCase("no")){
                System.out.println("Thank for using the calculator.");
                break;
            }

        }

    }
}


/*3. Write a program that can calculate the area and perimeter of a Rectangle:
			1. Ask the user "Enter the length of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the length of the rectangle"

			2. Ask the user "Enter the width of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the width of the rectangle"

			3. Display:
					1. Area of rectangle
					2. Perimeter of rectangle

			4. Ask the user "Would you like to calculate another Rectangle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

			Hint: Ones Uzun knows all the formulas you need for this task
*/