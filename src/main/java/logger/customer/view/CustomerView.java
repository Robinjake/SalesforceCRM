package main.java.logger.customer.view;

import java.util.Scanner;

public class CustomerView {

    CustomerModel customerModel; //Customer model object

    CustomerView(CustomerModel customerModel){ //Passing in a reference of customer model
        this.customerModel = customerModel;
    }

   public static void executeCustomerMenu(){

       Scanner scanner = new Scanner(System.in);
       int intInput;

       CustomerModel customerModel = new CustomerModel();
       CustomerView customerView = new CustomerView(customerModel);

       while(!exit) {

           System.out.println("Customer View Menu");
           System.out.println("0. Quit");
           System.out.println("1. View Open Sales");
           System.out.println("2. View Closed Sales");
           System.out.print("Enter option (0-2): ");
           intInput = scanner.nextInt();
           System.out.println();


           // View open sales
           if (intInput == 1) {
               customerView.ListOpenSales();
               System.out.println("Please Choose a sale: ");
               int index = scanner.nextInt();
               System.out.println();

               //saleDecision
               System.out.println("Would you like to accept or decline the sale? ");
               System.out.println("0. Accept ");
               System.out.println("1. Decline ");
               intInput = scanner.nextInt();
               System.out.println();

               if(intInput == 0){
                   customerView.closeSale(index, true);
               }

               else if(intInput == 1){
                   customerView.closeSale(index, false);
               }
           }

           //View closed sales
           else if (intInput == 2){
                for(int sale_id : closedSales.keySet()){
                    System.out.println(sale_id);
                }

           }

           else (intInput == 0){
               exit = true;
           }

       }

   }

}
