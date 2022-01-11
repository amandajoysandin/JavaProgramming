package day22_MultiDemensionalArray;

import java.util.Arrays;

public class MultiDimensionalArraysIntro {

    public static void main(String[] args) {
        String[] group1 = {"Jon", "Jose", "James"};
        String[] group2 = {"Aaron", "Shane", "Brianna"};
        String[] group3 = {"Cassandra", "Tahir", "Aygun"};

        String [][] groups = new String[3][]; //index: 0, 1, 2
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

        System.out.println(Arrays.toString(groups)); //the toString method is for one dimensional array only
        System.out.println( Arrays.deepToString(groups));
        System.out.println("-----------------------------");

        /*{1,2,3}
        {4,5,6,7}
        {8,9,10,11,12}
        * */

  //index of elements we have:
        //                     0 1 2
            int[][] arr2D = { {1,2,3} , {4,5,6,7}, {8,9,10,11,12} };
                   //index of arrays 0         1            2
//the first [] is the index of the 1D arrays, and the second [] is the indexes of the elements

        System.out.println(Arrays.deepToString(arr2D)); //This will print our whole 2D array

        //{4,5,6,7}
        System.out.println(Arrays.toString(arr2D[1])); //this will return a 1D array at index 1

        //11
        System.out.println(arr2D[2][3]);//This is the index of array 3 and element 3 within that array


    }


}
/*
String[] group1 = {"Jon", "Jose", "James"}
String[] group2 = {"Jon", "Jose", "James"}
String[] group3 = {"Jon", "Jose", "James"}
**/