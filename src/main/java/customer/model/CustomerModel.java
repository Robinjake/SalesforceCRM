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
    public List<Sale> openSales; //TODO: make this a map
    public Map<Integer, Sale> closedSales;
    Logger logger;
    int id;

    // Constructor
    public CustomerModel(int customer_id) {
        openSales = new ArrayList<>();
        closedSales = new HashMap<>();
        logger = new Logger();
        id = customer_id;
    }

    // Retrieve a new sale offer created by an employee
    public void retrieveNewSale(Sale sale) {
        openSales.add(sale);
    }

    // TODO: update this when openSales is changed to a map
    // Moves a sale from open to closed
    // Notify the logger that the sale has been closed
    public void closeSale(int sale_index, boolean decision) {
        Sale closedSale = openSales.remove(sale_index);
        closedSale.setSaleDecision(decision);
        closedSales.put(closedSale.getId(), closedSale);
        logger.acceptClosedSale(closedSale.getId());
    }
}