package day15_ForLoop;

import java.util.Locale;

public class FullName {
    public static void main(String[] args) {

        String firstName = "cyDEo",
                lastName = "SCHOOL";

       //firstName= firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();

        firstName = ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase();
        //              "C"                                 +     "ydeo"
        System.out.println(firstName);

    }
}
/*Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School*/