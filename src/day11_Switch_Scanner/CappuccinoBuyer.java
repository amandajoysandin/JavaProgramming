package day11_Switch_Scanner;
/*1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and thier price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output shoud be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed*/
public class CappuccinoBuyer {
    public static void main(String[] args) {

        String size = "tall";
        String result;

        //If statement
        if(size == "venti" || size == "tall" || size == "grande"){
            if(size == "venti"){
                System.out.println("Venti" + "\n$4.29" + "\n190 Calories");
            }else if(size == "tall"){
                System.out.println("Tall" + "\n$3.69" + "\n90 Calories");
            }else{
                System.out.println("Grande" + "\n$3.99" + "\n120 Calories");
            };

        }else {
            System.out.println("Invalid Size");
        }

        System.out.println("-------------------------");

   //Switch Statement

       switch (size) {
           case "tall":
               result = "You have ordered a Tall which costs $3.69 and is 90 calories.";
               break;
           case "grande":
               result = "You have ordered a Grande which costs $3.99 and is 120 calories.";
               break;
           case "venti":
               result = "You have ordered a Venti which costs $4.29 and is 190 calories.";
               break;
           default:
               result = "You have ordered an invalid size.";
       } System.out.println(result);


        System.out.println("-----------------------");
        //if statement and switch statement
          if(size == "venti" || size == "tall" || size == "grande"){
              switch (size) {
                  case "venti":
                      result = "You have ordered a Venti which costs $4.29 and is 190 calories.";
                      break;
                  case "tall":
                      result = "You have ordered a Tall which costs $3.69 and is 90 calories.";
                      break;
                  default:
                      result = "You have ordered a Grande which costs $3.99 and is 120 calories.";
              }System.out.println(result);
          }else{
          System.out.println("Invalid Size");

          }}    }
