package day09_IfStatements;



public class MinNumber {
  /*  1. Create a class called MinNumber, Write a program that can print
            the minimum number between two numbers, if both are equal then print Equal
    Ex:
    n1= 100, n2 = 200;
    output:
            100 is the minimum number
    n1 & n2
    possibility #1: n1 is Min
    possibility #2: n2 is Min
    possibility #3: equal*/

    public static void main(String[] args) {


        int n1 = 100;
        int n2 = 20;

        if (n1 > n2) {
            System.out.println("n2 is Min");
        }
        else if (n2 > n1) {
            System.out.println("n1 is Min");
        }else{
            System.out.println("equal");
        }

    }

}
