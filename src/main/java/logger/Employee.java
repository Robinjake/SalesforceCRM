/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alannoun
 */
package main.java.logger;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;


public class Employee {
    // Member fields
    int id;
    public Map<Integer, Sale> saleHistory;
    Map<Integer, Customer> customers;
    Sale sale;
    Logger log;
    final int MAX_ID_VALUE = 10000;

    // Constructor
    public Employee(int _id) {
        id = _id;
        log = new Logger();
        saleHistory = new HashMap<>();
        customers = new HashMap<>();
    }

    public Customer getCustomerAccount(int customer_id) {
        return customers.get(customer_id);
    }

    public Customer newCustomerAccount(int customer_id) {
        Customer newCustomer = new Customer(customer_id);
        customers.put(customer_id, newCustomer);
        return newCustomer;
    }

    // Creates a new sale object with a unique id and offer to the customer
    public void createSale(String product, Customer customer) {
        Random rand = new Random();
        int n = rand.nextInt(MAX_ID_VALUE);

        while (log.checkIfSaleIDExists(n)) {
            n = rand.nextInt(MAX_ID_VALUE);
        }
        sale = new Sale(n, product, Employee.this, customer);
        sale.setEmployee(this);

        log.offerSale(sale);
    }

    // Prints all of the ratings this employee has
    public void checkSaleHistory() {
        saleHistory.forEach((k,v) -> System.out.println("sale id: " + k + " | customer id: " +
                saleHistory.get(k).getCustomer().id + " | rating: " + v.getRating()));

    }

    // Adds a sale to the employee's history of sales
    public void addToSaleHistory(Sale sale) {
        saleHistory.put(sale.getId(), sale);
    }


}
