package day11_Switch_Scanner;

public class Elevator {

   /*
	2. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
    when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
    when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
    when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
    anything else: print "Invalid floor - 6"

    Note:
    Solution 1: use nested if statement
    Solution 2: use switch statement
    Solution 2: use if & switch statements mixed
    *
    */

    public static void main(String[] args) {
        //nested if
        int floor = 2 ;
        String result;

        if(floor == 1 || floor ==2 || floor ==3){
            if(floor ==1) {
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
            }else if(floor==2){
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
            }else {
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
            }
        }else{
            System.out.println("Invalid Floor");
        }

        System.out.println("---------------");
        //switch statement
        int floor2 = 6;
        String result2;

        switch (floor2){
        case 1:
            result2 = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
            break;
        case 2:
            result2 = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
            break;
        case 3:
            result2 = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
break;
        default:
            result2 = "Invalid Floor Selected";
            break;}
        System.out.println(result2);

        System.out.println("------------------");
//if and switch statements
        int floor3 = 4;
        String result3;

        if(floor3 ==1 || floor3 ==2 || floor3 ==3){
            switch (floor3) {
            case 1:
                result3 = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                break;
            case 2:
                result3 = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                break;
            default:
                result3 = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
                break;
        }}else{
            System.out.println("Invalid Floor Number");
        }}


}
