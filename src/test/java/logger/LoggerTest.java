/**
 * @author Kyle Truong
 */

package test.java.logger;

import main.java.logger.Customer;
import main.java.logger.Employee;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class LoggerTest {
    Employee employee;
    Customer customer;

    @Before
    public void setUp() throws Exception {
        employee = new Employee(1);
        customer = new Customer(1);
    }

    @Test
    public void testIfSaleHasBeenMade() {
        employee.createSale("bread", customer);
        assertEquals(1, employee.saleHistory.size());
    }
}