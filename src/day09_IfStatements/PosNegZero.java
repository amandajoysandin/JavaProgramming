package day09_IfStatements;

public class PosNegZero {
    public static void main(String[] args) {

        int n = 100;
if( n > 0) {
        System.out.println("Positive");
}
if (n < 0) {
        System.out.println("Negative.");
}
if( n == 0){
            System.out.println("Zero");
        }

        System.out.println("------------------------");

boolean positive = n > 0;
boolean negative = n < 0;

if(positive) {
    System.out.println("positive = " + positive);
}
        else if(negative) {
            System.out.println("negative = " + negative);
        }
        else{
            System.out.println("Zero");
        }


    }
}
