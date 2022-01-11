package practice_12_22_2021;

public class UnitTwo_WhileLoop {
    public static void main(String[] args) {


        int a = 0;

        do{
            a = a++ + --a ; // a = 0 + 0 - 0 = 0
          //  - (a % 3)
    } while (++a < 4);
        System.out.println(a);
}}
