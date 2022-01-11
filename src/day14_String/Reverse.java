package day14_String;

import java.util.Scanner;

/*Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
If word is shorter, display message: "Too short!".
If word is longer, display message: "Too long!".
Otherwise, reverse this word and print out result into the console.*/
public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");

        String w1 = input.nextLine();
        int n1 = w1.length();

        boolean validlong = (n1 > 5);
        boolean validshort = (n1 < 5);
        boolean valid = (n1 == 5);

        if (valid){
            System.out.println("" + w1.charAt(4) +
                    w1.charAt(3) + w1.charAt(2) + w1.charAt(1) +
                    w1.charAt(0));

        }else if(validlong){
            System.out.println("Too long");
        }else{
            System.out.println("Too short");
        }

      input.close();

    }
}
