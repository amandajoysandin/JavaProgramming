package day19_LoopPractices;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aabccdeef";
        String result = ""; //bdf

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); // 'A'
            int count = 0; // represents the freq of the char

            for (int i = 0; i < str.length(); i++) { //compares the char in outer loop with each char in string
                char each = str.charAt(i); // each char of str
                if (ch == each) { //if the given char matches the index at char
                    count++;
                }

            }
            if (count != 1) {//if freq of char is not one, the character is not unique
                continue;
            }
            result += ch;

        }
            System.out.println(result);

    }
}
/*        5. Write a program that can find the unique (only 1)b characters
from a string without using index() and lastIndexOf() methods

        Ex:
        str = "aabccdeef";

        output:
        bdf
        */