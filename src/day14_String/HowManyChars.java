package day14_String;

import java.util.Scanner;

/*Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself*/
public class HowManyChars {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter any String");

        String word = input.nextLine();

        int length = word.length();

        if (length <= 0){
            System.out.println("String is empty");
        }else if (length > 3){
            System.out.println(word.charAt(length - 3) + "" + word.charAt(length - 2)
                    + word.charAt(length-1));
        }else{
            System.out.println(word);
        }

        input.close();
    }
}