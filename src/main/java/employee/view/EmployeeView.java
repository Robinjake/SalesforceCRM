/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alannoun
 */
package main.java.employee.view;

import java.util.Scanner;
import main.java.employee.model.EmployeeModel;
import main.java.logger.model.Logger;

public class EmployeeView {
    Logger log;
    EmployeeModel _employee;
    Scanner input;
    EmployeeView(EmployeeModel _emp) {
        log = new Logger();
        _employee = _emp;
        input = new Scanner(System.in);
    }
    
    public void executeMenu() {
        while (true) {
            int choice = input.nextInt();
            System.out.println("0. Quit");
            System.out.println("1. Open new sale");
            System.out.println("2. View closed sales");
            System.out.println("3. View open sales");
            if (choice == 0)
                break;
            else if (choice == 1) {
                
                System.out.println("Enter customer ID");
                int n = input.nextInt();
                _employee.offerNewSale(n);
            }
            else if (choice == 2) {
                _employee.showClosedSales();
            }
            else if (choice == 3) {
                _employee.showOpenSales();
            }
            else {
                System.out.println("Invalid input");
            }
        }
    }
    
    
}
