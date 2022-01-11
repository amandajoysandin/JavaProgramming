package day12_ScannerPractice;

import java.util.Scanner;

/*6. PlaceAnOrder task:
                Ask User to enter the product name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.*/
public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Product Name");
        String product = scan.nextLine();

        System.out.println("Enter Price");
        double price = scan.nextDouble();

        System.out.println("Enter Quantity");
        int quantity = scan.nextInt();
        double total = (price * quantity);

        scan.nextLine();

        System.out.println("Enter Your Name");
        String name = scan.nextLine();


        System.out.println(name + ", Your order for " + quantity + " " + product + "s has been placed. Your total is $" + total);





        scan.close();


    }
}
