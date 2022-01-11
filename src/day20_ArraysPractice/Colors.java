package day20_ArraysPractice;

import java.util.Arrays;

public class Colors {
    public static void main(String[] args) {

     String[] colors = {"Yellow", "Red", "Black", "White", "Blue", "Green"};
     //^^ The compiler will not accept any other data type since you have assigned String.
        //You can only use curly braces if you know how many and what the elements are.

        System.out.println(colors.length); //this tells you how  many elements are in the Array
        System.out.println(Arrays.toString(colors)); //This tells you what the elements of the array are
        //^You must convert it to String to be able to print it





    }
}
