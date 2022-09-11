package ro.mycode;

import ro.mycode.Controller.*;
import ro.mycode.Models.Customer;
import ro.mycode.View.ViewCustomer;
import ro.mycode.View.ViewLogin;

public class Main {

    public static void main(String[] args) {
//        ControllerCustomer controllerCustomer = new ControllerCustomer();
//        controllerCustomer.afisare();

//        ControllerCustomerType controllerCustomerType = new ControllerCustomerType();
//        controllerCustomerType.afisare();

//        ControllerFood controllerFood = new ControllerFood();
//        controllerFood.afisare();

//        ControllerOrder controllerOrder = new ControllerOrder();
//        controllerOrder.afisare();

//        ControllerTicket controllerTicket = new ControllerTicket();
//        controllerTicket.afisare();

        Customer customer = new Customer(100,"Albert","Tocea","alb@gmail.com",7351,"prpr");
        ViewCustomer viewCustomer= new ViewCustomer(customer);
    }
}
