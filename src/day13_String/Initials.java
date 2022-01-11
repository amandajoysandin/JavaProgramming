package day13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next(); //Java

        System.out.println("Enter your last name");
        String lastName = scan.next(); //

        char n1 = firstName.charAt(0);
        char n2 = lastName.charAt(0);

        System.out.println(n1 + "." + n2 + ".");





    }
}
