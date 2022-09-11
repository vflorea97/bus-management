package ro.mycode.Controller;

import org.junit.jupiter.api.Test;
import ro.mycode.Models.Ticket;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTicketTest {

    @Test
    void getTicketByTicketId() {
        ControllerTicket controllerTicket = new ControllerTicket("new");
        Ticket ticket = new Ticket(22,22,22,22,22);
        controllerTicket.addTicket(ticket);

        controllerTicket.getTicketByTicketId(ticket.getIdTicket());

        assertEquals(true,controllerTicket.getTicketByTicketId(ticket.getIdTicket()) != null);
    }

    @Test
    void generareId() {
        ControllerTicket controllerTicket = new ControllerTicket("new");
        Ticket ticket = new Ticket(22,22,22,22,22);
        controllerTicket.addTicket(ticket);

        controllerTicket.generareId();

        assertEquals(23,controllerTicket.generareId());
    }
}