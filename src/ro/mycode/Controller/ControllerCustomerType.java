package ro.mycode.Controller;

import ro.mycode.Models.CustomerType;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerCustomerType {

    private ArrayList<CustomerType> customerTypes;

    public ControllerCustomerType (){
        customerTypes = new ArrayList<>();
        this.load();
    }
    public void load (){
        try{
            File file = new File("D:\\mycode\\incapsulare\\bus-management\\src\\ro\\mycode\\Data\\CustomerType");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                String text = scanner.nextLine();
                CustomerType customerType = new CustomerType(text);
                this.customerTypes.add(customerType);
            }
            scanner.close();

        }catch (Exception e){

        }
    }
    public void save (){
        try{
            File file = new File("D:\\mycode\\incapsulare\\bus-management\\src\\ro\\mycode\\Data\\CustomerType");
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
        for (i = 0; i < customerTypes.size() - 1; i++){
            text += this.customerTypes.get(i).toSave() + "\n";
        }
        text += this.customerTypes.get(i).toSave();
        return text;
    }
}
