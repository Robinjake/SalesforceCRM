package test.java.customer;

import main.java.customer.model.CustomerModel;
import main.java.employee.model.EmployeeModel;
import main.java.logger.model.Logger;
import main.java.sale.model.Sale;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerModelTest {

    EmployeeModel emp;
    Logger log;

    @Before
    public void setUp() throws Exception {
        log = new Logger();
        emp = new EmployeeModel(10, log);

    }

    @Test
    public void retrieveNewSale() {
        emp.createCust(10);
        emp.offerNewSale(10);

    }

    @Test
    public void closeSale() {
        emp.createCust(10);
        emp.offerNewSale(10);
        emp.closeSale(10);

    }
}