import main.java.customer.model.CustomerModel;
import main.java.logger.model.Logger;
import main.java.employee.model.EmployeeModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alannoun
 */
public class EmployeeModelTest {
    EmployeeModel employee;
    Logger empLog,custLog;
    CustomerModel customer;
    
    public EmployeeModelTest() {
        empLog = new Logger();
        custLog = new Logger();
        employee = new EmployeeModel(1234, empLog);
        customer = new CustomerModel(2345, custLog);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        empLog = new Logger();
        employee = new EmployeeModel(1234, empLog);
    }
    
    @After
    public void tearDown() {
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void openNewSale(){ //This file creates a new sale then outputs all the open sales with a certain customer the employee has.
        employee.createCust(1234);
        employee.offerNewSale(1234);
        employee.showOpenSales();
        
}
}