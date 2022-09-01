package ro.mycode.Models;

public class Order {

    private int orderId;
    private int customerId;
    private int ticketId;

    public Order (){
        this.orderId = 0;
        this.customerId = 0;
        this.ticketId = 0;
    }

    public Order (int orderId,int customerId,int ticketId){
        this.orderId = orderId;
        this.customerId = customerId;
        this.ticketId = ticketId;
    }

    public Order (String text){
        String [] prop = text.split(",");
        this.orderId = Integer.parseInt(prop[0]);
        this.customerId = Integer.parseInt(prop[1]);
        this.ticketId = Integer.parseInt(prop[2]);
    }

    public String toSave (){
        return this.orderId+","+this.customerId+","+this.ticketId;
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
}
