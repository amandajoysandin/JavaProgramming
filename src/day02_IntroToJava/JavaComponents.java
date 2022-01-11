package day02_IntroToJava;


import java.util.Scanner;

public class JavaComponents {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean isTall = scan.nextBoolean();
        boolean isFast = scan.nextBoolean();
        boolean isFlexible = scan.nextBoolean();
        String sport = "";

        if(isTall) {
            if (isFast) {
                sport = "bball";
            } else if (isFlexible) {
                sport = "gym";
            } else {
                sport = "vball";
            }
        }else{
            if(isFast) {
                sport = "soccer";
            }else{
                sport = "tennis";
            }
        }
        System.out.println(sport);
    }}