package day12_ScannerPractice;
/*2. Write a program for the speed check. a variable named speedLimit is given and assigned,
ask user to enter the current speed,
if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!*/
import java.util.Scanner;

public class SpeedLimit {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter Current Speed:");
        int speed = scan.nextInt();

        int fast = (speed-55);
        boolean msg = fast>0;

        if(msg) {
            System.out.println("Slow Down! You are going " + fast + "mph over the speed limit.");
        }else{}








        scan.close();
    }
}
