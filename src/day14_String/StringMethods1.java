package day14_String;

public class StringMethods1 {

    public static void main(String[] args) {
        String str1 = "     Batch 25      ";
        str1 = str1.trim();  //Batch 25 with no spaces in between

        System.out.println(str1);// will print with white space

        //You must assign it back to the variable with the white spaces trimmed...(add str1=)

        String str2 = "Cydeo School";

        int n1 = str2.indexOf("h"); //8
        System.out.println("n1 = " + n1);;

        int n2 = str2.indexOf("ool");//9
        System.out.println("n2 = " + n2);

        System.out.println("-----------------------");

        String str3 = "Java Programming Language";

        int n3 = str3.indexOf("am"); // You need to add more than just a or it will stop once it reads the first a
        System.out.println("n3 = " + n3);

        int n4 = str3.indexOf("gua");
        System.out.println("n4 = " + n4);

        int n5 = str3.lastIndexOf("g");//will give you last g in the String
        System.out.println("n5 = " + n5);

        System.out.println("----------");

        String s = "Java Nova Cava Wawa Orange";

        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a Ca");
       // int fourthA = s.indexOf("ava W");
        //int fourthA = s.lastIndexOf("av");
        int fourthA = s.indexOf("Ca") +1;
     //   int fifthA = s.lastIndexOf("va") +1;
        int fifthA = s.lastIndexOf("a W");
        int  sixthA = s.lastIndexOf("aw");
        int seventhA = s.lastIndexOf("a ");


        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);













    }



}
