/**
 * Written by Kyle Truong
 */

package test.java.logger;

import main.java.customer.model.CustomerModel;
import main.java.employee.model.EmployeeModel;
import main.java.logger.model.Logger;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoggerTest {
    final static int empID = 123;
    final static int custID = 789;
    Logger log;
    EmployeeModel emp;
    CustomerModel cust;

    @Before
    public void setUp() throws Exception {
        log = new Logger();
        emp = new EmployeeModel(empID, log);
        cust = new CustomerModel(custID, log);
        emp.customers.put(custID, cust);
    }

    /**
     * Test whether a new sale gets logged as an open sale
     */
    @Test
    public void testAcceptNewSale() {
        emp.offerNewSale(custID);
        assertEquals(1, log.openSales.size());
        assertEquals(0, log.closedSales.size());
    }

    /**
     * When a customer closes a sale, check if the log moves the sale from open to closed
     */
    @Test
    public void testAcceptClosedSale() {
        emp.offerNewSale(custID);

        int sale_id = 0;
        for (int x : log.openSales.keySet())
            sale_id = x;

        cust.closeSale(sale_id, true);
        assertEquals(0, log.openSales.size());
        assertEquals(1, log.closedSales.size());
    }

    /**
     * When a sale gets logged, check if that id exists in either open or closed
     */
    @Test
    public void testDoesSaleIdExist() {
        emp.offerNewSale(custID);

        int sale_id = 0;
        for (int x : log.openSales.keySet())
            sale_id = x;

        assertTrue(log.doesSaleIdExist(sale_id));
    }
}