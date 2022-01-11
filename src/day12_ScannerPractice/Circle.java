package day12_ScannerPractice;

import javax.lang.model.SourceVersion;
import java.util.Scanner;
/*1. Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius*/

public class Circle {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius = scan.nextInt();

        double area = (3.14*radius*radius);
        double per = (2*3.14*radius);

        System.out.println("per = " + per);
        System.out.println("area = " + area);

scan.close();




    }
}
