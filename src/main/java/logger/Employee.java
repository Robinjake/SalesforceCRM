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
import java.util.List;



public class Employee {
    int ID;
    HashMap<Integer, Sale> empSales = new HashMap<>();
    Sale newSale;
    Logger log;
    public Employee(int _id) {
        ID = _id;
        log = new Logger();
    }
    public void createSale() {
        newSale = new Sale();

    }
    public void offerSale(Sale _newSale) {
        log.offerSale(_newSale);
    }

    public void getTranRating() {
         empSales.forEach((k,v) -> System.out.println("key: "+k+" value:"+ v.getRatingField));
    }


}
