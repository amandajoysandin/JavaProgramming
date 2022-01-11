package practice_01_05_22;

public class CustomMethodsIntro {
    public static void main(String[] args) {

        sum(5, 4);
        //(5.5, 4 ) will give compiler error

        System.out.println(sum1(5, 4)); // you have to print because you didn't print anything in the method
    }
    public static void sum(int a, int b){
        System.out.println(a+b);
    }

    public static int sum1(int a, int b){
        return a + b;
    }
}
