package day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        /* Write a program that can return the frequency of a char
        from a string.
        Ex:
        str = "AAABBBC"
        ch = 'A'
         */

        String str = "AAABBBCCC";
        char ch = 'A';

        int freq = 0; // +1+1+1 ==> 3

        for (int i = 0; i < str.length(); i++) { // i: indexes of str
            char eachChar = str.charAt(i);  //eachChar: each character of Str

            if (ch == eachChar) { //if given ch matches eachChar, ch is appeared in String
                freq++;
            }

            System.out.println(freq);
        }
    }
}