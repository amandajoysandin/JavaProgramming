package day12_ScannerPractice;
/*3. Write a program that can convert cents to dollars,
if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
* */

import java.sql.SQLOutput;
import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter Cents");
        int centsorig = input.nextInt();
        int dollars = (centsorig/100);
        int cents = ((centsorig)%100);


        System.out.println(centsorig + " cents is equal to: " + dollars + " dollars and " + cents + " cents");






    }
}
