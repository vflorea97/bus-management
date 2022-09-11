package ro.mycode.View;

import ro.mycode.Controller.*;
import ro.mycode.Models.Customer;
import ro.mycode.Models.Order;
import ro.mycode.Models.Ticket;

import java.util.Scanner;

public class ViewCustomer {

    private ControllerCustomer controllerCustomer;
    private ControllerTicket controllerTicket;
    private ControllerFood controllerFood;
    private ControllerCustomerType controllerCustomerType;
    private ControllerOrder controllerOrder;
    private Scanner scanner;
    private Customer customer;
    private Order order;
    private Ticket ticket;


    public ViewCustomer (Customer customer){
        controllerCustomer = new ControllerCustomer();
        controllerTicket = new ControllerTicket();
        controllerFood = new ControllerFood();
        controllerCustomerType = new ControllerCustomerType();
        controllerOrder = new ControllerOrder();
        scanner = new Scanner(System.in);
        order = new Order();
        ticket = new Ticket();
        this.customer = customer;

        runCustomer();
    }
    public void menu (){
        System.out.println("Bine ai venit" +customer.getFirstName() + " " + customer.getLastName() + " !" );
        System.out.println("Apasa 1 pentru a afisa tipurile de abonamente");
        System.out.println("Apasa 2 pentru a cumpara un abonament");
        System.out.println("Apasa 3 pentru a afisa abonamentul curent");
    }
    public void runCustomer (){
        boolean run = true;
        menu();
        while (run){
            int buton = Integer.parseInt(scanner.nextLine());
            switch (buton){
                case 1:
                    controllerCustomerType.afisare();
                    break;
                case 2:
                    buyTypeTicket();
                    break;
                case 3:
                    System.out.println(ticket.descriere());
                    break;
                default:
                    menu();
                    break;
            }
        }
    }

    public void buyTypeTicket (){
        System.out.println("Introdu codul tipului pe care vrei sa il cumperi:");
        int cod = Integer.parseInt(scanner.nextLine());
        System.out.println("Introdu codul produsului pe care vrei sa il consumi:");
        int codFood = Integer.parseInt(scanner.nextLine());
        if (controllerCustomerType.verificareCod(cod) != null && controllerFood.getFoodById(codFood) != null){
            System.out.println("Ai cumparat cu succes abonamentul");
            int orderId = controllerOrder.generareId();
            int ticketId = controllerTicket.generareId();
            String tipTicket = controllerCustomerType.verificareCod(cod).getCustomerType();
            int total = controllerCustomerType.verificareCod(cod).getPret() + controllerFood.getFoodById(codFood).getPret();
            ticket.setIdTicket(ticketId);
            ticket.setCustomerTypeId(customer.getCustomerId());
            ticket.setOrderId(orderId);
            ticket.setFoodId(codFood);
            ticket.setTotalPrice(total);
            Order order = new Order(orderId, customer.getCustomerId(),ticketId,tipTicket);
            controllerOrder.addOrder(order);
            Ticket ticket = new Ticket(ticketId,orderId, customer.getCustomerId(),codFood,total);
            controllerTicket.addTicket(ticket);

        }else{
            System.out.println("Codul abanamentului sau al produsului nu exista!! Reintrodu codurile:");
        }
    }

    public void afisareTicket (){


    }
}
