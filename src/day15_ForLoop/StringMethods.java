package day15_ForLoop;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String str = "";// will register as empty OR blank
        String str2 = "  "; //is blank

        String str3 = "";

        boolean r = str3.isBlank();
        boolean r2 = str3.isEmpty();

        System.out.println(r);

        System.out.println("---------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equalsIgnoreCase(s2));//true

//Yes, YES, yEs, yES, YEs...

        System.out.println("yES".equalsIgnoreCase("yes"));

        System.out.println("-----------");

        String sentence = "My favorite programming language is Java";
        boolean hasC = sentence.contains("C++");
        boolean hasJava = sentence.contains("java"); //this pays attention to case, so you need a new string
        boolean hasANYjava = sentence.toLowerCase().contains("java");

        System.out.println(hasC);
        System.out.println(hasJava);
        System.out.println(hasANYjava);

        System.out.println("-----------");

        String input1 = "I love Java";
        String input2 = "Java";
        System.out.println(input1.equals(input2)); //false
        System.out.println(input1.equalsIgnoreCase(input2)); //false

        System.out.println(input1.contains("Java")); //true
        System.out.println(input1.contains("java")); //false

        System.out.println(input1.toLowerCase().contains("java")); //true
        //you have to convert to Upper or Lowercase to be able to compare in contains method

        System.out.println("-------------");

        String a = "Wooden Spoon";
        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("Spoon");
        boolean z = a.toLowerCase().startsWith("wooden");
        //


    }
}
