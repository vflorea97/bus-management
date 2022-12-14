package ro.mycode.Controller;

import ro.mycode.Models.Customer;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerCustomer {

    private ArrayList<Customer> customers;

    public ControllerCustomer(){
        customers = new ArrayList<>();
        this.load();
    }
    public ControllerCustomer(String text){
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
    public void save (){
        try{
            File file = new File("D:\\mycode\\incapsulare\\bus-management\\src\\ro\\mycode\\Data\\Customers");
            FileWriter writer = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(writer);
            printWriter.print(this.toSave());
            printWriter.close();


        }catch (Exception e){

        }
    }
    public String toSave (){
        String text = "";
        int i;
        for (i = 0; i < customers.size() - 1; i++){
            text += this.customers.get(i).toSave() + "\n";
        }
        text += this.customers.get(i).toSave();
        return text;
    }
    public void afisare (){
        for (int i = 0; i < customers.size(); i++){
            System.out.println(customers.get(i).descriere());
        }
    }

    public Customer getCustomerByEmail(String email){
        for (int i = 0; i < customers.size(); i++){
            if (customers.get(i).getEmail().equals(email)){
                return customers.get(i);
            }
        }
        return null;
    }
    public void addCustomer (Customer customer){
        if (getCustomerByEmail(customer.getEmail()) == null){
            this.customers.add(customer);
        }
    }
    public int generareId (){
        if (this.customers.size() > 0){
             return customers.get(customers.size() - 1).getCustomerId() + 1;
        }
        return 1;
    }
    public boolean verificareEmail (String email){
        for (int i = 0; i < customers.size(); i++){
            if (customers.get(i).getEmail().equals(email)){
                return true;
            }
        }
        return false;
    }
}
