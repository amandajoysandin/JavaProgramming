package day19_Tasks;

public class IndexOfFirstDuplicate {
    public static void main(String[] args) {
    String str = "d";

        for (int j = 0; j <str.length(); j++) {
            char cOuter = str.charAt(j);
            int count = 0;


            for (int i = 0; i <str.length() ; i++) {
                char cInner = str.charAt(i);
                if(cOuter == cInner) {
                    count++;
                }
            }
                if (count !=1) {//if freq of char is not one, the character is not unique
                    System.out.println(str.indexOf(cOuter));
                    break;

        }

    }
}}

/*2. Write a program that cna return the index number of the first duplicated character from a string*/