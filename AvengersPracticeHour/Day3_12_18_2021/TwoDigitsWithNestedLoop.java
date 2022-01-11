package Day3_12_18_2021;

public class TwoDigitsWithNestedLoop {
    public static void main(String[] args) {
        //writing two digit numbers with nested loops
        // hint: AB=10*A+B

        for (int a = 1; a < 9; a++) {
            for (int b = 0; b <=9 ; b++) {
                int ab=10*a+b;
                System.out.print(ab+" ");
            }

        }


    }
}
