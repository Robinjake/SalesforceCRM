package main.java.logger;

import java.util.HashMap;
import java.util.Map;

public class Logger {
    private Map<Integer, Sale> allSales;

    public Logger() {
        allSales = new HashMap<>();
    }

    public offerSale(Sale sale) {
        allSales.put(sale.getSaleID(), sale);
        sale.setSaleDecision(sale.getCustomer().acceptSale());
        sale.setRating(sale.getCustomer().rateTransaction());
        sale.getEmployee().updateEmployeeSales(sale);
    }

    // test
}