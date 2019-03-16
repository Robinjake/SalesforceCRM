package main.java;

import main.java.customer.model.CustomerModel;
import main.java.employee.model.EmployeeModel;
import main.java.logger.model.Logger;

/**
 * JUST FOR PLAYING AROUND WITH THE CODE AND QUICK TESTING
 */
public class Driver {
    public static void main(String[] args) {
        int employeeID = 123;
        int custID = 789;

        Logger logger = new Logger();
        EmployeeModel emp = new EmployeeModel(employeeID, logger);
        CustomerModel cust = new CustomerModel(custID, logger);

        emp.customers.put(custID, cust);
        emp.offerNewSale(789);

        int saleID = 0;

        for (int x : cust.openSales.keySet())
            saleID = x;

        cust.closeSale(saleID,true);

        System.out.println("hello world");
    }
}
