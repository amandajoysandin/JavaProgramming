package day10_NestedIfANDTernaries;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 400;

        if (score>= 0 && score <=100){// if score is valid
        if(score>= 60) {
            System.out.println("Pass");
        }else{
        System.out.println("Fail");


    }}else{
            System.out.println("invalid");
}
        System.out.println("------");

        int age = 25;
        boolean hasID = false;

        if (hasID){
            if (age>=21){
                System.out.println("Eligible to buy alcohol.");
        }else{
                System.out.println("Not eligible to buy alcohol");}

    }else{
            System.out.println("Must have ID to purchase alcohol");}

        System.out.println("--------");

        int number = 9;

        if(number >= 1 && number<=7){
            if(number == 1) {
                System.out.println("Monday");
            }else if (number == 2){
                System.out.println("Tuesday");
            }else if (number == 3) {
                System.out.println("Wednesday");
            }else if (number == 4) {
                System.out.println("Thursday");
            }else if (number == 5) {
                System.out.println("Friday");
            }else if (number == 6) {
                System.out.println("Saturday");
            }else {
                System.out.println("Sunday");}
        }

        else{
            System.out.println("Invalid Number");
        }










    }}