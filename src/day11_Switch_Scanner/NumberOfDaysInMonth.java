package day11_Switch_Scanner;

public class NumberOfDaysInMonth {
    /*28 Days: 2
    30 Days : 4, 6, 9, 11
    31: 1, 3, 5, 7, 8, 10, 12
    *

    *
    * */
    public static void main(String[] args) {

        int num = 2;
        int year = 2000;
        String result = "";



        if(num >= 1 && num <= 12){// num= 1~12
switch (num){
    case 2:
        result = (year % 4 ==0)? "29 days" : "28 days";
        break;

    case 4: case 6: case 9: case 11:
        result = "30 days";
        break;
    default:
        result = "31 days";}
}else{
                result = "Invalid Number";
        }
        System.out.println(result);
    }
}









