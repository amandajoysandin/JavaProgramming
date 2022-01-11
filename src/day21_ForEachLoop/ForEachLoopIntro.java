package day21_ForEachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {

        int[] numbers = {10, 20,30,40,50,60,70};
                     //    0   1  2  3  4  5  6
        for (int i = 0; i < numbers.length; i++) { //i: indexes of the array
            int eachElement = numbers[i];
            System.out.println(eachElement);
        }
        System.out.println("------------------");

        for (int i = numbers.length-1; i >=0; i--) { //will print the decending list of your array
            System.out.println(numbers[i]);

        }
        System.out.println("--------");
        for (int each : numbers) {
            System.out.println(each);
        }

    //    for( int each: numbers ){ //each: element of the array


    }
}
