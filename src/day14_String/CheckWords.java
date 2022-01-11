package day14_String;

import java.util.Scanner;

/*Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:
            print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
*/
public class CheckWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 words.");
        String w1 = input.next();
        String w2 = input.next();
        String w3 = input.next();

        int w1Length = w1.length();
        int w2Length = w2.length();
        int w3Length = w3.length();

        if(w1Length == w2Length && w2Length == w3Length){
            System.out.println("All words are the same length");
        }else if((w1Length != w2Length) || (w1Length != w3Length) && (w2Length == w3Length)){
            System.out.println("All different lengths");
        }else {
            System.out.println("Not Same nor Different lengths");
        }


        input.close();
    }
}
