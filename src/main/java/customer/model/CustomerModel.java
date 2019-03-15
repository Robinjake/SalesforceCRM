package main.java.customer.model;

import main.java.logger.Sale;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerModel {
    List<Sale> openSales;
    Map<Integer, Sale> closedSales;

    CustomerModel() {
        openSales = new ArrayList<>();
        closedSales = new HashMap<>();
    }

    void closeSale(int sale_index, boolean decision) {
        Sale closedSale = openSales.remove(sale_index);
        closedSale.setSaleDecision(decision);
        closedSales.put(closedSale.getId(), closedSale);
    }
}