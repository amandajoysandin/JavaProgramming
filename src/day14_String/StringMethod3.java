package day14_String;

import java.nio.charset.StandardCharsets;

public class StringMethod3 {
    public static void main(String[] args) {
        //substring(beginning index, ending index+1- needed to include the last index)

        String word = "Cydeo School";
        //             012345....
        String brand = word.substring(0, 5);//Cydeo

        String str1 = word.substring(6); //Starts here and goes until end of String
        System.out.println("---------------------");



        String word2 = "Python C# Ruby";
        String s1 = word2.substring(0, word2.indexOf(" ") );
        String s2 = word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" "));
        String s3 = word2.substring(word2.lastIndexOf(" ")+1);


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }
}
