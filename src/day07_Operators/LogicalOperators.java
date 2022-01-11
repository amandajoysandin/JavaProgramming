package day07_Operators;

public class LogicalOperators {

    public static void main(String[] args) {

        /*  && is for AND statements
        *   || is for OR statements
        * You need two Boolean statements for these^
        *
        *
        * */
//Logical AND: Both or All must be true
        boolean result1 = 10 > 5 && 10 >7;
        System.out.println(result1);
        //true AND true so we will get a true returned

        boolean result2 = 20 > 15 && 20>35;
        System.out.println(result2);
        //true and False, so we will get a false statement returned

        boolean result3 = 30 > 50 && 30 > 14;
        System.out.println(result3);
        //False, so result will be false. We don't need to check the second.


        //Logical OR- only one of the conditions must be met
boolean result4 = 100 == 200 || 100 != 300;
        System.out.println(result4);
//false, but since the second is true, we get true.

        boolean result5 = 1000 > 900 || 1000 < 2000;
        System.out.println(result5);
        //true and true, of course we get true, and we dont have to check the second

        boolean result6 = 7 < 0 ||  7 > 15;
        System.out.println(result6);
        //false and must check second to ensure its false also

        //Logical NOT:

        boolean result7 = !true; //false
        boolean result8 = !false; //true

        System.out.println(result7);
        System.out.println(result8);




    }


}
