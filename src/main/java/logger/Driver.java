/**
 * Interface, written by Kyle Truong
 */

package main.java.logger;

import java.util.HashSet;
import java.util.Set;

public class Driver {
    public static void main(String[] args) {
        String name = "Kyle";
        Set<String> names = new HashSet<>();
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