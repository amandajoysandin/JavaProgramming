package day12_Scanner;
 import  java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in); //Enter

        System.out.println("Enter your score");
        int score = input.nextInt(); //85

        input.nextLine(); // You need this to clear the scanner's memory

        System.out.println("Enter your full name"); //AJ
        String fullName = input.nextLine();





    }
}
