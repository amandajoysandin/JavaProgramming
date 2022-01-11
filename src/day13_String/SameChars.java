package day13_String;

import java.util.Scanner;

/*write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
*/
public class SameChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence.");
        String s1 = scan.nextLine();

        char n1 = s1.charAt(0);
        char n2 = s1.charAt( s1.length()-1 );

        if(n1==n2) {
            System.out.println("same");
        }else{
            System.out.println("not same");}

        scan.close();


    }
}
