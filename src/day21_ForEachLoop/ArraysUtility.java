package day21_ForEachLoop;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};

        System.out.println(nums);// this will print a hashcode, so you must convert it toString
        System.out.println(Arrays.toString(nums));//you need it for any single dimension array
        System.out.println(nums[0]); //this is not an array object it is an element included in the array

        /*
        String str = "Java";
        System.out.println(str);
        System.out.println(str.toString()); //the toString method is imported implicitly when you have a String variable
        */

        System.out.println("------------");

        int[] scores = {95, 100, 55, 65, 85, 78};

        Arrays.sort(scores); //55....100 //sorts in Ascending order
        System.out.println(Arrays.toString(scores));
        System.out.println("Min Score: " + scores[0]);
        System.out.println("Max Score: " + scores[scores.length-1]);

        String[] names = {"Gunay", "Anna", "Zuhal", "Ahmet", "Maria", "Sinem"};

        Arrays.sort(names);//sort them in alphabetical order

        System.out.println(Arrays.toString(names));

        String[] words = {"Anna", "ANNA"}; //Uppercase comes first- it follows the ASCII table

        System.out.println("-------------------");


        int [] arr1 = {1,3,2};
        int [] arr2 = {1,2,3};
boolean r1 =Arrays.equals(arr1,arr2);

       Arrays.sort(arr1); //{1,2,3}
        Arrays.sort(arr2); //{1,2,3}

        boolean r2 = Arrays.equals(arr1,arr2);

        System.out.println(r2);

        System.out.println("--------------");
        char[] ch1 = {'a', 'c', 'b'};
        char[] ch2 = {'b', 'a', 'c'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1, ch2);
    }
}
