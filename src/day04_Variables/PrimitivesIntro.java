package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {
        // age: 38 years old
        byte age = 38;

        // weight: 160 pounds
      // byte weight = 160;    //  160 is out of byte range
       // byte num = -129; // -129 is out of byte's range
        short weight = 160; //160 is within range of short

        //Whole Numbers
        int salary = 100_000; //preferred data type for integer numbers

        long asset = 3_333_333_333L;


        //Decimals
        float tax = .26F;

        double PI = 3.14;

        //#-- single character, must use ' '
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);
        char ch2 = 35;
        System.out.println("ch2 = " + ch2);
        char ch3 = 45000;
        System.out.println("ch3 = " + ch3);

        char gender = 'F';
        char grade = 'F';
        char yesNo = 'F';

//Boolean for true or false

        boolean isEmployed = true;
        boolean isMarried = false;

        boolean result = 100 >300 ;

        System.out.println("isEmployed = " + isEmployed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        //String is for a sequence of characters (String of Text)
        String name = "Wooden Spoon";
        String city = "McLean";














    }

}
