package day19_Tasks;

public class FirstDuplicate {
    public static void main(String[] args) {

        String str = "abbccdeef";


        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); // 'A'
            int count = 0; // represents the freq of the char

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i); // each char of str
                if (ch == each) { //DO the chars match?
                    count++; //if so, add one to the count for that char
                }
            }
            if (count != 1) {//if freq of char is not one, the character is not unique
                System.out.println(ch);
                break; //we don't need to check again, we found our match
            }
        }

    }}
/*  1. Write a program that can return the first duplicate character from a string*/