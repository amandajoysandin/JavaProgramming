package day22_Tasks;

import java.util.Arrays;

public class ReverseTwoDimensional {

    public static void main(String[] args) {
        int[][] array = { {1,2,3}, {4,5,6}};

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(Arrays.toString(array));

        }


    }
}

  /*  Write a program that can reverse a two dimensional array (return new array)
		Ex:
                array = { {1,2,3}, {4,5,6}};


                output:
                reverse = { {6,5,4}, {3,2,1},};
*/