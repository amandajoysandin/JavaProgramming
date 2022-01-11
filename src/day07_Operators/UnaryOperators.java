package day07_Operators;

public class UnaryOperators {


    public static void main(String[] args) {
        int b = 25;
        System.out.println(++b); //increases value by 1 right away aka pre increment
        System.out.println(--b); //decreases value by 1 right away
        System.out.println(b++); //waits to increase value aka post increment, will print b first
        System.out.println(b--); //waits to decrease value aka post increment

        System.out.println("------------");

        int z = 45;
        System.out.println( ++z); //46, z=46
        System.out.println( z++); //46, z=47
        System.out.println(z); //47

        System.out.println("------------");

        int q = 30;

        System.out.println(--q); //29
        System.out.println(q--); //29
        System.out.println(q); //28
        ;


    }
}
