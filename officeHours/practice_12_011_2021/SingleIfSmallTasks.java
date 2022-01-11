package practice_12_011_2021;

public class SingleIfSmallTasks {
    public static void main(String[] args) {
        /*Write an if statement that assigns 5 to x when y is equal to 20*/
        int x= 1;
        int y= 20;

        if(y==20){
            x = 5;
        }
        System.out.println(x);

        System.out.println("-------------");

        /*Write an if statement that multiplies payrate by 1.5 if hours are greater than 40*/

        double hourlyrate = 50;
        double hours = 40;

        if(hours>40)
            hourlyrate= (hourlyrate * 1.5);
        System.out.println(hourlyrate);

        System.out.println("------------------");

        /* Write and if statement that sets the variable fees to 50 if the boolean
        variable max is true
         */
 int fees;
 int a,b;
 boolean max = 2>1;

 if(max==true){
     fees = 50;

        System.out.println(fees);}
        System.out.println("---------------------");

 /* Write an if statement that prints "Ideal Temp" if the temp is between 70 and 80*/

double temp = 75;

if(temp>70 && temp <80){
    System.out.println("Ideal Temp");
}

        System.out.println("-----------------");

/*Write an if statement that assigns 20 to variable a
if variable b is 50 and c is greater than 100
 */
        int a1 = 0;
        int b1 = 50;
        int c1 = 140;

        if(b1==50 && c1>100){
            a1 = 20;
            System.out.println(a1);}





    }
}
