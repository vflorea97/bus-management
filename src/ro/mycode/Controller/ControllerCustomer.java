package ro.mycode.Controller;

import ro.mycode.Models.Customer;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerCustomer {

    private ArrayList<Customer> customers;

    public ControllerCustomer(){
        customers = new ArrayList<>();
    }

    public void load (){
        try{
            File file = new File("D:\\mycode\\incapsulare\\bus-management\\src\\ro\\mycode\\Data\\Customers");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                String text = scanner.nextLine();
                Customer customer = new Customer(text);
                this.customers.add(customer);
            }
            scanner.close();

        }catch (Exception e){

        }
    }
}
