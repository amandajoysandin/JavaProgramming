package day09_IfStatements;

public class FizzBuzz {
    public static void main(String[] args) {
        /*1. Create a class called FizzBuzz, an integer variable named number is given to you,
        write a program that prints "Fizz" if the number is divisible by 3,
        prints "Buzz" if the number is divisible by 5, and
        prints FizzBuzz if the number is divisible by both 3 and 5.

            Ex:
                number 15

            Output:
                FizzBuzz*/

        int num = 32;
        boolean fizz = (num%3 ==0);
        boolean buzz = (num%5 ==0);
        boolean fizzbuzz = (fizz && buzz);

        if(fizzbuzz) {
            System.out.println("FizzBuzz");
        } else if (fizz) {
            System.out.println("fizz");
        }else if(buzz){
            System.out.println("buzz");
        }else{
            System.out.println("invalid");}







    }
}
