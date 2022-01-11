package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        //create a variable that's capable enough to contain 5 names

        String[] mygroup = new String [5];/// You only use this if you know how many elements there are but not what they are
        mygroup[0] = "Gunay"; //starts with index of 0
        mygroup [1] = "Neira";
        mygroup [2] = "Suat";
        mygroup [3] = "Hulya";
        mygroup [4] = "Mikael";
        //mygroup [5] = "Muhtar"; The index ends at 5, so there is not enough room for him.


//System.out.println(mygroup); //hashcode so you need the toString method
        System.out.println(Arrays.toString(mygroup));

        System.out.println("-----------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //^ you use this array when you know how many elements and what they are
        System.out.println(Arrays.toString(days));
        System.out.println("--------------------");

        int number = 12;

        if(number <1 || number >7){
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number-1]); //we have to subtract one to account or 0 as the beginning index



    }
}

