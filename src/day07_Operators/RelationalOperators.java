package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        //Greater than:
        boolean result1 = 100 > 90; //true
        boolean result2 = 200 > 300; //false

        System.out.println(result1);
        System.out.println(result2);

        System.out.println("---------------");

        //Greater than or equal:

        boolean result3 = 10 >= 9; //true
        boolean result4 = 100 >= 100; //true

        System.out.println(result3);
        System.out.println(result4);
        System.out.println("---------------");

        //Less than:

        boolean result5 = 5 < 10; //true
        boolean result6 = 20 < 8; //false

        System.out.println(result5);
        System.out.println(result6);

        System.out.println("-----------------");

        //Less than or equal to:

        boolean result7 = 1000 <= 2000; //true
        boolean result8 = 25 <= 15; //false

        System.out.println(result7);
        System.out.println(result8);

        System.out.println("-----------------");

        //Equal
        boolean result9 = 10 == 10; //true
        boolean result10 = 100 ==200; //false

        System.out.println(result9);
        System.out.println(result10);

        System.out.println("-----------------");

        //Not Equal:

        boolean result11 = 1000 != 1000; //false
        boolean result12 = 1000 != 2000 ; //true
        
        System.out.println(result11);
        System.out.println(result12);
    }
}
