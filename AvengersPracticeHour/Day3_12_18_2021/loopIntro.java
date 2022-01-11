package Day3_12_18_2021;

public class loopIntro {
    public static void main(String[] args) {
        //print numbers from 0-100
        for(int i = 0; i< 100; i++){
            System.out.print(i + " ");
        }
        System.out.println("-----------------------------");

        //only even numbers from 0 to 100
        System.out.println("0");
        for (int i = 0; i < 100; i+=2) {
            System.out.print(i +" ");
        }
        //only odd numbers from 0 to 100
        System.out.println("0");
        for (int i = 0; i < 100; i+=3) {
            System.out.print(i +" ");
        }

        //divide by numbers with 5 from 0 to 100

        System.out.println("0");
        for (int i = 0; i < 100; i+=5) {
            System.out.print(i +" ");
        }
        System.out.println("-----------------");
        //even numbers from 100 to 0
        System.out.println("0");
        for (int i = 100; i > 0; i-=2) {
            System.out.print(i +" ");
        }


    }
}
