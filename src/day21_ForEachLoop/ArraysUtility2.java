package day21_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};
        String[] earlyBirds = Arrays.copyOf(students, 3); //The length is how many elements it will print

        System.out.println(Arrays.toString(earlyBirds));
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};

        numbers = Arrays.copyOf(numbers, 5); //{1,2,3,4,5}//copies from first element to given number in a new array
        System.out.println(Arrays.toString(numbers)); //

        System.out.println("--------");

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2, 6);//copies array from beginning index to ending index (which is excluded)

        System.out.println(Arrays.toString(ch2));

        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
                   //   0    1   2   3   4   5   6   7   8    9

        int[] result =Arrays.copyOfRange(scores,3, 8); //include further index to include the one you want
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(scores, 3,scores.length);


    }
}
