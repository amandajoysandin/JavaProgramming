
package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

        //  oddOrEven(); // the method demands additional info to complete its task

        oddOrEven(10);

        ageOfPerson(1995, 2022);

        printNumbers( 10, 20);

        eligibleToVote(34, true);


    }


    // create a function that can check if a number is odd number or even number
    public static void oddOrEven(int number){ // 10

        if(number % 2 == 0){
            System.out.println(number +" is an even number");
        }else{
            System.out.println(number +" is an odd number");
        }

    }


    // create a function that can display the age of the person

    public static void ageOfPerson(int birthYear, int currentYear) {
        int age = currentYear - birthYear;

        System.out.println("Your age is: "+age);
    }

    //create a function that can display if someone is eligible to vote.

    public static void eligibleToVote(int age, boolean isUSCitizen){
        if(age>=18 && isUSCitizen){
            System.out.println("You are eligible to vote.");
        }else{
            System.out.println("You are not eligible to vote.");}
    }




    //                                                       10       50
    //create a function that can print all the numbers between X and Y
    public static void printNumbers(int x, int y){
        for (int i= x+1; i<y ; i++) {
            System.out.println(i);

        }

    }


}
