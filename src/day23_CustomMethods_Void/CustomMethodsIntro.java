package day23_CustomMethods_Void;

public class CustomMethodsIntro {

    public static void main(String[] args) {
        //public represents that everyone can access it
        //static allows you to call this method outside the class through the class name
        //void means it will not return anything from the method
        //main represents the method name (must be meaningful)

        System.out.println("Test Started");

        greeting();
        greeting();

        System.out.println("Test Completed");


    }


    public static void greeting(){

        System.out.println("Hello Cydeo!");
        System.out.println("How are you today?");


    }


}