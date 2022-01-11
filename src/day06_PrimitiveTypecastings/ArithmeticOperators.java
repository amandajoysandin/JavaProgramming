package day06_PrimitiveTypecastings;



public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println("12" + 1);  //121, concatenation
        System.out.println(12 + 1);  // 13, Addition
        System.out.println(100 - 50); //50, subtraction
        System.out.println(10 * 6); //60, Multiplication


        System.out.println( 100 /3 ); //33
        System.out.println( 10.0 / 4 ); //2.5-- add a .0 to help you get a decimal result
        System.out.println( 10 / 4d); //2.5-- add a d to get a decimal

        int a = 100;
        double b = a/6; //16.0
        System.out.println(b);

        double c = (double)a/6; //16.66
    }




}

/*
+: Addition
-: Subtraction
*: Multiplication
/: Division
%: Remainder


integer / integer ===> integer
decimal / integer ===> decimal
integer / decimal ===> decimal
decimal / decimal ===> decimal
*/