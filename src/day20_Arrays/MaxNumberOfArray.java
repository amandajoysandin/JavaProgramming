package day20_Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 20, 1, 0};
        int max = numbers[0]; //set the element at index of 0 to be the max so we can compare the
                                //following elements to see if they are larger than the crrent max

        for (int i = numbers.length - 1; i >= 0; i--) {
            if(numbers[i] > max){ //if there is an element in the array thats greater than the current max number
                max = numbers[i]; // assigning greater number to variable max
            }
            
        }
        System.out.println(max);


        System.out.println("-------------------");

        int[] number1= {23, 6, 3, 5, 9, 5, 34, 14};
        int min = number1[0];

        for (int i = 0; i < number1.length; i++) {
            if (number1[i] < min){
            min = number1[i];}
        }
        System.out.println(min);

        }
    }
