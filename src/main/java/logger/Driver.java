/**
 * Interface, written by Kyle Truong
 */

package main.java.logger;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Logger logger = new Logger();
        Scanner scanner = new Scanner(System.in);

        // TODO: Have a way to log on and enter your employee id or create a new employee account
        // Hard coded employee and customer
        Employee employee = new Employee(1); // 1 represents employee id
        int intInput = 0;
        String strInput = "";


        while (true) {
            System.out.println("CRM Menu");
            System.out.println("1. Quit");
            System.out.println("2. Make a sale");
            System.out.println("3. Check sale history");
            System.out.print("Enter option (1-3): ");
            intInput = scanner.nextInt();
            System.out.println();

            // Make a sale
            if (intInput == 2) {
                Customer customer;
                Sale newSale;

                System.out.println("1. New customer");
                System.out.println("2. Existing customer");
                System.out.print("Enter option (1-2): ");
                intInput = scanner.nextInt();
                System.out.println();

                if (intInput == 1) {
                    System.out.print("What is your customer's id: ");
                    intInput = scanner.nextInt();
                    employee.newCustomerAccount(intInput);
                    customer = employee.getCustomerAccount(intInput);
                    System.out.println();
                }
                else {
                    System.out.print("Enter customer id: ");
                    intInput = scanner.nextInt();
                    customer = employee.getCustomerAccount(intInput);
                    System.out.println();
                }

                System.out.print("What are you selling: ");
                strInput = scanner.next();
                System.out.println();

                employee.createSale(strInput, customer);
                System.out.println();
            }

            // Check employee sale history
            else if (intInput == 3) {
                employee.checkSaleHistory();
                System.out.println();
            }

            else
                return;

            System.out.println("TRANSACTION COMPLETE");
        }
    }
}

/**
 * SAMPLE OUTPUT
 *
 * CRM Menu
 * 1. Quit
 * 2. Make a sale
 * 3. Check sale history
 * Enter option (1-3): 2
 *
 * 1. New customer
 * 2. Existing customer
 * Enter option (1-2): 1
 *
 * What is your customer's id: 123
 *
 * What are you selling: bread
 *
 * ***CUSTOMER POV***
 * Would you like to accept the sale (y or n): y
 * ***CUSTOMER POV***
 * Was your transaction experience positive (y or n): y
 *
 * CRM Menu
 * 1. Quit
 * 2. Make a sale
 * 3. Check sale history
 * Enter option (1-3): 3
 *
 * sale id: 2768 | customer id: 123 | rating: good
 *
 * CRM Menu
 * 1. Quit
 * 2. Make a sale
 * 3. Check sale history
 * Enter option (1-3): 1
 *
 *
 * Process finished with exit code 0
 */