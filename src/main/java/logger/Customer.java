package main.java.logger;
import java.util.Scanner;


public class Customer {

    int ID; //Customer ID

    public static boolean acceptSale() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Would you like to accept the sale?");
        String choice = reader.next();
        if(choice.equals("yes"))
            return true;
        else
            return false;
    }

    public static boolean rateTransaction(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Please rate your transaction experience");
        String choice = reader.next();
        if(choice.equals("good"))
            return true;
        else
            return false;
    }


}
