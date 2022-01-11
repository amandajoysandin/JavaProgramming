package day07_Operators;

import javax.lang.model.SourceVersion;

public class ShortHandOperators {
//assignment

    public static void main(String[] args) {
       int number = 100;
        System.out.println("number = " + number); //100

        number = 200 ;

        System.out.println("number = " + number); //200

        String word = "Java Programming";

        System.out.println("word = " + word);

        word = "Wooden Spoon";

        System.out.println("word = " + word);

        word= "Cydeo";

        System.out.println("word = " + word);

        System.out.println("----------------------------------------------");

        //Addition Assignment:

        int x = 100;
        System.out.println("x = " + x);
        System.out.println( x + 200); //300
        x= x + 200;

        System.out.println("x = " + x);


     //Subtraction Assignment

     int c = 200;
     c -= 100;// will decrease value by 100
     System.out.println(c);

//Multiplication Assignment

     int d = 4;
     d/= 4;
     System.out.println(d); //will print d/4

     //Division Assignment
     int e = 20;
     e/= 4; //divides the value by 4
     System.out.println(e); //will print e/4

     //Remainder Assignment
     int f = 200;
     f %=10;
     System.out.println(f); //will print what remains after f is divided by 10

    }



}
