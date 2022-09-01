package ro.mycode.Controller;

import ro.mycode.Models.Order;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerOrder {

    private ArrayList<Order> orders;

    public ControllerOrder (){
        orders = new ArrayList<>();
        this.load();
    }
    public void load (){
        try {
            File file = new File("D:\\mycode\\incapsulare\\bus-management\\src\\ro\\mycode\\Data\\Order.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                String text = scanner.nextLine();
                Order order = new Order(text);
                this.orders.add(order);
            }
            scanner.close();

        }catch (Exception e){

        }
    }
    public void save (){
        try {
            File file = new File("D:\\mycode\\incapsulare\\bus-management\\src\\ro\\mycode\\Data\\Order.txt");
            FileWriter write = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(write);
            printWriter.print(this.toSave());
            printWriter.close();
        }catch (Exception e){

        }
    }
    public String toSave (){
        String text = "";
        int i;
        for (i = 0; i < orders.size() - 1; i++){
            text += this.orders.get(i).toSave() + "\n";
        }
        text += this.orders.get(i).toSave();
        return text;
    }
    public void afisare () {
        for (int i = 0; i < orders.size(); i++){
            System.out.println(orders.get(i).descriere());
        }
    }
}
