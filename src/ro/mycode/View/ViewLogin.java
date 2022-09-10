package ro.mycode.View;

import ro.mycode.Controller.ControllerCustomer;
import ro.mycode.Controller.ControllerCustomerType;
import ro.mycode.Controller.ControllerTicket;

import java.util.Scanner;

public class ViewLogin {

    private ControllerTicket controllerTicket;
    private ControllerCustomer controllerCustomer;
    private ControllerCustomerType controllerCustomerType;
    private Scanner scanner;

    public ViewLogin (){
        controllerTicket = new ControllerTicket();
        controllerCustomer = new ControllerCustomer();
        controllerCustomerType = new ControllerCustomerType();
        scanner = new Scanner(System.in);
    }
    public ViewLogin (String text){
        controllerTicket = new ControllerTicket();
        controllerCustomer = new ControllerCustomer();
        controllerCustomerType = new ControllerCustomerType();
        scanner = new Scanner(System.in);
    }

    public void menu (){
        System.out.println("Apasa 1 pentru a te inregistra");
        System.out.println("Apasa 2 pentru a te loga");
        System.out.println("Apasa 3 pentru a cumpara un tichet fara cont");
        System.out.println("Apasa 4 pentru a reafisa meniul");
    }
    public void runLogin (){
        boolean run = true;
        menu();
        while (run){
            int buton = Integer.parseInt(scanner.nextLine());
            switch (buton){
                case 1:
                    break;
                default:
                    menu();
                    break;
            }
        }
    }

    public void addCustomer (){
        int id = controllerCustomer.generareId();
        System.out.println("Introdu numele: ");
        String firstName = scanner.nextLine();
        System.out.println("Introdu prenumele: ");
        String lastName = scanner.nextLine();
        System.out.println("Introdu emailul: ");
        String mail
        while(controllerCustomer.verificareEmail())

    }

}
