/**
 * Written by Alan Noun
 */

package main.java.employee.model;

import main.java.customer.model.CustomerModel;
import main.java.logger.model.Logger;
import main.java.sale.model.Sale;
import java.util.*;

public class EmployeeModel {
    // Member fields
    public Map<Integer, Sale> openSales;
    public Map<Integer, Sale> closedSales;
    public Map<Integer, CustomerModel> customers;
    private Logger logger;
    private int id;
    private final int MAX_SALE_ID = 10000;

    // Constructor
    public EmployeeModel(int employee_id, Logger log) {
        logger = log;
        closedSales = new HashMap<>();
        openSales = new HashMap<>();
        customers = new HashMap<>();
        id = employee_id;
    }

    // Retrieve a customer by their unique id
    public CustomerModel getCustomer(int customer_id) {
        return customers.get(customer_id);
    }
    
    public boolean doesCustExist(int id) {
        return customers.containsKey(id);
    }

    // Create a new sale with a unique id then offer it a specific customer
    public void offerNewSale(int customer_id) {
        Random rand = new Random();
        int n = rand.nextInt(MAX_SALE_ID);

        while (logger.doesSaleIdExist(n))
            n = rand.nextInt(MAX_SALE_ID);

        // Create sale object
        Sale newSale;
        
        
        newSale = new Sale(this, getCustomer(customer_id), n);
        
//        newSale.setEmployee(this);
        
        openSales.put(n, newSale);
        logger.acceptNewSale(newSale);
    }

    // Move an open sale to a closed sale
    public void closeSale(int sale_id) {
        Sale closedSale = openSales.remove(sale_id);
        closedSales.put(sale_id, closedSale);
    }
    
    public void createCust(int n) {
        
        Logger log = new Logger();
        CustomerModel cust = new CustomerModel(n, log);
        customers.put(n, cust);
    }
    
    public void showClosedSales() {
        closedSales.forEach((k,v) -> System.out.println("Sale ID: "+k+" Customer:"+v.getCustomer()));
    }
    public void showOpenSales() {
        openSales.forEach((k,v) -> System.out.println("Sale ID: "+k+" Customer:"+v.getCustomer().getID()));
    }
}
