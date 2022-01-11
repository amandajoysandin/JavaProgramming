package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {

        public static void main(String[] args) {
            String str = "Cydeo82376@#$ %^&";
            String digits = "";
            String letter = "";
            String ch = "".trim();
            for (int i = 0; i < str.length(); i++) {
                char ch1 = str.charAt(i);
                if (ch1 >= 48 && ch1 <= 57) {
                    digits += ch1;

                } else if ((ch1 >= 65 && ch1 <= 90) || (ch1 >= 97 && ch1 <= 122)) {
                    letter += ch1;

                } else {
                    ch += ch1;

                } ch = ch.trim();
            }
            System.out.println("digits = " + digits);
            System.out.println("letter = " + letter);
            System.out.println("ch = " + ch);
        }
    }