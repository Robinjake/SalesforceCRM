/**
 * Written by Kyle Truong
 */

package main.java.customer.model;

import main.java.logger.model.Logger;
import main.java.sale.model.Sale;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerModel {
    // Member fields
    public Map<Integer, Sale> openSales; //TODO: make this a map
    public Map<Integer, Sale> closedSales;
    Logger logger;
    int id;

    // Constructor
    public CustomerModel(int customer_id, Logger log) {
        openSales = new HashMap<>();
        closedSales = new HashMap<>();
        logger = log;
        id = customer_id;
    }

    // Retrieve a new sale offer created by an employee
    public void retrieveNewSale(Sale sale) {
        openSales.put(sale.getId(), sale);
    }

    // TODO: update this when openSales is changed to a map
    // Moves a sale from open to closed
    // Notify the logger that the sale has been closed
    public void closeSale(int sale_id, boolean decision) {
        Sale closedSale = openSales.remove(sale_id);
        closedSale.setSaleDecision(decision);
        closedSales.put(closedSale.getId(), closedSale);
        logger.acceptClosedSale(closedSale.getId());
    }
    
    public int getID() {
        return id;
    }
}