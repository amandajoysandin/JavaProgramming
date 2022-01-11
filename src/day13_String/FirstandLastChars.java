package day13_String;

import java.util.Scanner;

public class FirstandLastChars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence.");
        String s1 = scan.nextLine();
        char firstChar = s1.charAt(0);
        char lastChar = s1.charAt(  s1.length()-1  );
        System.out.println("firstChar = " + firstChar);
        System.out.println("lastChar = " + lastChar);
scan.close();
    }
}

