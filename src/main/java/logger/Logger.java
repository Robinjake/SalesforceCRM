/**
 * Kyle Truong
 */

package main.java.logger;

import java.util.HashMap;
import java.util.Map;

public class Logger {
    private Map<Integer, Sale> allSales;

    public Logger() {
        allSales = new HashMap<>();
    }

    public void offerSale(Sale sale) {
        allSales.put(sale.getId(), sale);
        sale.setSaleDecision(sale.getCustomer().acceptSale());
        sale.setRating(sale.getCustomer().rateTransaction());
        sale.getEmployee().addToSaleHistory(sale);
    }

    public boolean checkIfSaleIDExists(int id) {
        return allSales.containsKey(id);
    }
}