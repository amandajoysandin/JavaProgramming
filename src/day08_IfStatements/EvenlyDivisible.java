package day08_IfStatements;

public class EvenlyDivisible {

    /*2. Create a class called EvenlyDivisible,and write a program that can
check if a number is evenly divisible by 2, 3, 5
Ex:
number = 65;
output:
65 is divisible by 2: false
65 is divisible by 3: false
65 is divisible by 5: true
     */

    public static void main(String[] args) {

        int num = 65;

        if(num % 2 ==0){
            System.out.println("false");
    }if(num%3 ==0){
            System.out.println("false");
        }if (num%5 ==0){
            System.out.println("true");
        }





    }




}
