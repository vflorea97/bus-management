package ro.mycode.Controller;

import org.junit.jupiter.api.Test;
import ro.mycode.Models.Customer;

import static org.junit.jupiter.api.Assertions.*;

class ControllerCustomerTest {

    @Test
    public void getCustomerByEmail() {
        ControllerCustomer controllerCustomer = new ControllerCustomer("new");
        Customer customer = new Customer(100,"Alber","Tocea","alb@gmail.com",7351);
        controllerCustomer.addCustomer(customer);

        controllerCustomer.getCustomerByEmail(customer.getEmail());

        assertEquals(true,controllerCustomer.getCustomerByEmail(customer.getEmail()) != null);


    }

    @Test
    public void addCustomer() {
        ControllerCustomer controllerCustomer = new ControllerCustomer("new");
        Customer customer = new Customer(100,"Alber","Tocea","alb@gmail.com",7351);

        controllerCustomer.addCustomer(customer);

        assertEquals(true,controllerCustomer.getCustomerByEmail(customer.getEmail()) != null);
    }
}