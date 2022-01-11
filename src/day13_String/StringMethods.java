package day13_String;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String word = "Cydeo";
               //index 01234

        char thirdChar = word.charAt(3);

        System.out.println("thirdChar = " + thirdChar);
/*
        char tenthChar = word.charAt(9);
        System.out.println("tenthChar = " + tenthChar);
       //out of range so we can't use this */

        System.out.println("---------------");

        String s1 = "Batch 25 is the best batch.";
        int totalChars = s1.length();

        System.out.println("totalChars = " + totalChars);

        char lastChar = s1.charAt(  s1.length()-1  );
        System.out.println("lastChar = " + lastChar);

        System.out.println("-------------");

        String str = "wooden spoon";
        str.toUpperCase(); //"WOODEN SPOON"

        System.out.println(str);


        


    }
}
