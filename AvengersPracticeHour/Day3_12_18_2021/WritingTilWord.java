package Day3_12_18_2021;

public class WritingTilWord {

        /*Given a non-empty string like "Code" print a string like below output.
                                (do with substring  first)
                                Code → "CCoCodCode"
                                abc → "aababc"
                                ab → "aab"
                                (do with charAt())
                                Code → "C-Co-Cod-Code"
                                abc → "a-ab-abc"
                                ab → "a-ab"*/
        public static void main(String[] args) {
String word = "Code";
            for (int i = 0; i <= word.length(); i++) {
                String temp = word.substring(0,i);
                System.out.println(temp);
            }


    }
}
