package day21_ForEachLoop;

public class MaximumNumber {
    public static void main(String[] args) {

        //this is for the array
        int[] numbers = {10, 5, 20, 1, 0};
        int max = numbers[0]; //set the element at index of 0 to be the max so we can compare the
        //following elements to see if they are larger than the crrent max

        for (int i = numbers.length - 1; i >= 0; i--) {
            if(numbers[i] > max){ //if there is an element in the array thats greater than the current max number
                max = numbers[i]; // assigning greater number to variable max
            }

        }
        System.out.println(max);
        System.out.println("---------");


        }




    }

