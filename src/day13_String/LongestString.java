package day13_String;


import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two sentences.");

        String s1 = scan.nextLine();
        String s2 = scan.nextLine();

        int n1 = s1.length();
        int n2 = s2.length();

        if(n1>n2) {
            System.out.println(s1);
        }else {
            System.out.println(s2);
        }





    }
}
/*write a program that asks user to enter two strings, and print out the longest string */