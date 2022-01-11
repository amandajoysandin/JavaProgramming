package day12_ScannerPractice;

import java.util.Scanner;

/*3. SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome*/
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Hourly Rate");
        double hourly = scan.nextDouble();
        System.out.println("Enter Number of Hours Weekly");
        double hrsWeek = scan.nextDouble();
        System.out.println("Enter your state tax percentage");
        double state = scan.nextDouble();
        System.out.println("Enter your Federal tax percentage");
        double fed = scan.nextDouble();

        double gross = (hourly*hrsWeek);
        double sTax = (state/100);
        double fTax = (fed/100);
        double tTax = (gross * (sTax+fTax));
        double net = (gross-tTax);

        System.out.println("gross = " + gross);
        System.out.println("tTax = " + tTax);
        System.out.println("net = " + net);








scan.close();
    }
}
