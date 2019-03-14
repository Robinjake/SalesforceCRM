package main.java.logger;
import java.util.Scanner;


public class Customer {
    //Customer id
    int id;

    public Customer(int id) {
        this.id = id;
    }

    public static boolean acceptSale() {
        Scanner reader = new Scanner(System.in);
        System.out.println("***CUSTOMER POV***");
        System.out.print("Would you like to accept the sale (y or n): ");
        String choice = reader.next();
        if(choice.equals("y"))
            return true;
        else
            return false;
    }

    public static boolean rateTransaction(){
        Scanner reader = new Scanner(System.in);
        System.out.println("***CUSTOMER POV***");
        System.out.print("Was your transaction experience positive (y or n): ");
        String choice = reader.next();
        if(choice.equals("y"))
            return true;
        else
            return false;
    }


}
