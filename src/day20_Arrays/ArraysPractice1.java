package day20_Arrays;

import java.sql.Array;
import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {
//store the elements: 10, 20, 50, 70

        int[] numbers ={10, 20,50, 70};//you can use because you know how many and which elements

        System.out.println(Arrays.toString(numbers));  //call the toString method from Array's utility

        System.out.println("-------------");

        //create a variable that can contain 5 scores

        int [] scores = new int[5]; //this is for setting the size of the array--
        // if you stop here it will print the default for each type of variable

        scores[1] = 85; //first score
        scores[scores.length-1]= 95; //this gives you the last element
        scores[3] = 75;
        scores[0] = 65;//this is technically 1 because its the index of 0
        scores[2] = 55;
        System.out.println(Arrays.toString(scores));

        System.out.println("------------");

        String[] month = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"}; // 0~11 (length-1)
/*
        System.out.println(month[0]);
        System.out.println(month[1]);
        System.out.println(month[2]);
        System.out.println(month[3]);
        System.out.println(month[4]);
        System.out.println(month[5]);
        System.out.println(month[6]);
        System.out.println(month[7]);
        System.out.println(month[8]);
        System.out.println(month[9]);
        System.out.println(month[10]);
        System.out.println(month[11]);  //this is excessive so we will use a loop */

        for (int i = 0; i < month.length; i++) { //the ending index is always less than the length
                                //^ i represents the index numbers of the array starting from 0
            System.out.println(month[i]); // this represents the month associated with each i
        }

        System.out.println("----------------------");

        for(int i = month.length-1; i>=0; i--) {// i: represents the index numbers of the array starting from the last index
            System.out.println(month[i]);
        }






    }
}
