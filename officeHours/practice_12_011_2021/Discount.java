package practice_12_011_2021;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your quantity.");
        int quantity = input.nextInt();
        double unitprice = 100;
        double cost = (quantity * unitprice);
        double discount = quantity*.1;
        double totalcost = (cost - discount);

        if(totalcost>1000) {
            System.out.println("You get a discount of $" + (discount) +
                    " and your total cost is $" + totalcost);
        }else{
            System.out.println("No discount applied");


input.close();}
    }
}
/*A shop will give discount of 10%
if the cost of purchased quantity is more than 1000.
                            Create a quantity variable
                            Suppose, one unit will cost 100.
                            Judge and print total cost for user.
                            ( Scanner Class can be used )

                            INPUT for quantity :  5
                            EXPECTED : No discount applied

                            INPUT for quantiy  :  15
                            EXPECTED : You get a discount of $discount and
                            your total cost is $totalCost*/

