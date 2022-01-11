package day09_IfStatements;

public class OxygenTank {
    public static void main(String[] args) {

 /*. Create a class called OxygenTank. You are diving in the ocean.
 Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%*/

        int level =32;
        boolean message = (level>=00 && level<=100);
        String result;

       if(level>=49){result = "Be careful now you at at 50%";
       }else if(level>=50 && level<=59) {
           result = "Start to head back";
       }else if(level>=60 && level<=69) {
           result = "Don't go too far";
       }else if (level>=70 && level<=79) {
           result = "Still okay";
       }else if (level>=80 && level<=89) {
           result = "Your tank is full";
       }else{
           result = "Full of Air";
        } System.out.println(result);}



    }

