package ro.mycode.Models;

public class Order {

    private int orderId;
    private int customerId;
    private int ticketId;
    private String tipTicket;

    public Order (){
        this.orderId = 0;
        this.customerId = 0;
        this.ticketId = 0;
        this.tipTicket = "";
    }

    public Order (int orderId,int customerId,int ticketId,String tipTicket){
        this.orderId = orderId;
        this.customerId = customerId;
        this.ticketId = ticketId;
        this.tipTicket = tipTicket;
    }

    public Order (String text){
        String [] prop = text.split(",");
        this.orderId = Integer.parseInt(prop[0]);
        this.customerId = Integer.parseInt(prop[1]);
        this.ticketId = Integer.parseInt(prop[2]);
        this.tipTicket = prop[3];
    }

    public String descriere (){
        String text = "";
        text += "Order id: " + this. orderId + "\n";
        text += "Customer id: " + this.customerId + "\n";
        text += "Ticket id: " + this.ticketId + "\n";
        text += "Tip ticket: " + this.tipTicket + "\n";
        return text;
    }

    public String toSave (){
        return this.orderId+","+this.customerId+","+this.ticketId+","+this.tipTicket;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getTipTicket(){
        return tipTicket;
    }
    public void setTipTicket (String tipTicket){
        this.tipTicket = tipTicket;
    }
}
