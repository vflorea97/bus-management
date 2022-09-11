package ro.mycode.Controller;

import org.junit.jupiter.api.Test;
import ro.mycode.Models.CustomerType;

import static org.junit.jupiter.api.Assertions.*;

class ControllerCustomerTypeTest {

    @Test
    public void verificareCod() {
        ControllerCustomerType controllerCustomerType = new ControllerCustomerType("new");
        CustomerType customerType = new CustomerType(1,"Lunar",80);
        controllerCustomerType.addCustomerType(customerType);

        controllerCustomerType.verificareCod(customerType.getCustomerTypeId());

        assertEquals(1,controllerCustomerType.verificareCod(customerType.getCustomerTypeId()).getCustomerTypeId());
    }
}