package ro.mycode.View;

import ro.mycode.Controller.*;

public class ViewTickets {

    private ControllerTicket controllerTicket;
    private ControllerOrder controllerOrder;
    private ControllerCustomerType controllerCustomerType;
    private ControllerCustomer controllerCustomer;

    public ViewTickets (){
        controllerCustomer = new ControllerCustomer();
        controllerCustomerType = new ControllerCustomerType();
        controllerOrder = new ControllerOrder();
        controllerTicket = new ControllerTicket();
    }

    public ViewTickets (String text){
        controllerCustomer = new ControllerCustomer();
        controllerCustomerType = new ControllerCustomerType();
        controllerOrder = new ControllerOrder();
        controllerTicket = new ControllerTicket();
    }

    public void meniu (){
        System.out.println("Apasa 1 pentru a vizualiza abonamentele ");

    }

}
