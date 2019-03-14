//Aniruddha Bhattacharya
package main.java.logger;

public class Sale
{
    int id;// ID of the sale
    String product;// value for name of the product
    Employee employee; // employee object
    Customer customer;// customer object
    boolean rating;// value in the rating field
    boolean saleDecision;// value in the saleDecision

    // constructor for sale class
    Sale(int id, String product, Employee employee, Customer customer) {
        this.id = id;
        this.product = product;
        this.customer = customer;
        saleDecision = false;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    // setter for sale decision
    public void setSaleDecision(boolean decision)
    {
        saleDecision = decision;
    }

    // setter for rating field
    public void setRating(boolean rating)
    {
        this.rating = rating;
    }

    // getter for rating field
    public String getRating()
    {
        if (rating)
            return "good";
        else
            return "bad";
    }

    // getter for employee
    public Employee getEmployee()
    {
        return employee;
    }

    // setter for employee
    public void setEmployee(Employee employee)
    {
        this.employee = employee;
    }

    // getter for customer
    public Customer getCustomer()
    {
        return customer;
    }

    // setter for customer
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }

}


