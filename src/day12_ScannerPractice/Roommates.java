package day12_ScannerPractice;

import java.util.Scanner;

/*1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"*/
public class Roommates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int rm = scan.nextInt();

        boolean a = (rm>0 && rm<=2);
        boolean b = (!a && rm<=6);
        boolean c = (!a && !b && rm>=7);



        if(a) {
            System.out.println("Live with less than 3 people");
        }else if(b) {
            System.out.println("Live with 3 - 6 people");
        }else {
            System.out.println("Live with more than 6 people");
        }








        scan.close();

    }
}
