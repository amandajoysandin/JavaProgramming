package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {
        char[] letters = new char[26];

   /***/

        for (char i = 'A', j =0; i <='Z' && j < letters.length; i++, j++) {
            //^ i represents the index numbers from 0 to the last index number, increasing 1 each time
            //^ j represents the characters that pair with 0 to the last index number, increasing 1 each time
           letters[j]= i; //this pairs the i (letters) and j (each repetition of the loop) together
        }


        System.out.println(Arrays.toString(letters)); //[A~Z]

    }
}
