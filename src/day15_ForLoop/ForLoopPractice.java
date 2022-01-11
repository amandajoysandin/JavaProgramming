package day15_ForLoop;

public class ForLoopPractice {
    public static void main(String[] args) {

//15 16 17 18 19 .... 44 45

      for(int i = 15; i <= 45; i ++) {

          System.out.print(i + " ");

      }
        System.out.println("----------");
        //100-5- going backwards

        for(int i = 100; i >=50; i--) { // i: 100, 99, 98,, ...50.
            //49 makes this loop false so the loop will stop
            System.out.print(i + " ");
        }
            System.out.println("--------------");

            //Print all even numbers between 1 and 55

            for(int i = 1; i<=55; i++ ){
                if (i% 2 == 0){
                    System.out.print(i + " ");

            }
    }}}
            /*
            for(int i = 2; i <=54; i ++2 ){
            System.out.print(i + " ");
            }

        System.out.println("------------");

}}
*/