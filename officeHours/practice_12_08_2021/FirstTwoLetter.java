package practice_12_08_2021;

import java.util.Scanner;

public class FirstTwoLetter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word.");
        String word = input.nextLine();


        if(word.isEmpty()){
            System.out.println("It cannot be empty.");
        }else if(word.length()<=2){
            System.out.println(word);
        }else{
            System.out.println(word.charAt(0) + "" + word.charAt(1)); //the string has to go at the beginning or in the  middle. It cannot go at the end of the print statement
            System.out.println(word.substring(0,2)); // we use index of 2 although we are not including that index
        }

input.close();
    }
}
/* (substring-length-isEmpty)

                      Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".

                              Input :"Hello"   → "He"
                              Input :"abcdefg" → "ab"
                              Input :"a"         → "a"
                              Input :""         → "It can not be empty"
         */