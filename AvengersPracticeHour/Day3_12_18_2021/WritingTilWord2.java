package Day3_12_18_2021;

public class WritingTilWord2 {
       /*Given a non-empty string like "Code" print a string like below output.

                                (do with charAt())
                                Code → "C-Co-Cod-Code"
                                abc → "a-ab-abc"
                                ab → "a-ab"*/
       public static void main(String[] args) {
           String word = "Code";
           String c=word.charAt(0) +""; //This will print C but we need "" to pass it as a String
           String co2=word.charAt(0) + word.charAt(1) + "";//will print 178 because the "" is at the end
           String co= ""+ word.charAt(0) + word.charAt(1); //"" first since it reads left to right
           String cod= ""+ word.charAt(0) + word.charAt(1) + word.charAt(2); //prints cod
           String code= ""+ word.charAt(0) + word.charAt(1) + word.charAt(2) + word.charAt(3);//prints cod

String temp= "";
           for (int i = 0; i < word.length(); i++) {
               for (int j = 0; j <=i; j++) {
                   temp += ""+word.charAt(j);
               }
               temp+="-";
           }
           System.out.println("temp=" + temp);

       }
}
