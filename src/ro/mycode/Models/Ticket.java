package ro.mycode.Models;

public class Ticket {

    private int idTicket;
    private int orderId;
    private int customerTypeId;
    private int foodId;
    private int totalPrice;

    public Ticket (){
        this.idTicket = 0;
        this.orderId = 0;
        this.customerTypeId = 0;
        this.foodId = 0;
        this.totalPrice = 0;
    }

    public Ticket (int idTicket,int orderId,int customerTypeId,int foodId,int totalPrice){
        this.idTicket = idTicket;
        this.orderId = orderId;
        this.customerTypeId =customerTypeId;
        this.foodId = foodId;
        this.totalPrice = totalPrice;
    }

    public Ticket (String text){
        String [] prop = text.split(",");
        this.idTicket = Integer.parseInt(prop[0]);
        this.orderId = Integer.parseInt(prop[1]);
        this.customerTypeId = Integer.parseInt(prop[2]);
        this.foodId = Integer.parseInt(prop[3]);
        this.totalPrice = Integer.parseInt(prop[4]);
    }

    public String descriere (){
        String text = "";
        text += "Ticket id: " + this.idTicket + "\n";
        text += "Order id: " + this.orderId + "\n";
        text += "Customer type id: " + this.customerTypeId + "\n";
        text += "Food id: " + this.foodId + "\n";
        text += "Total price: " + this.totalPrice + "\n";
        return text;
    }

    public String toSave (){
        return this.idTicket+","+this.orderId+","+this.customerTypeId+","+this.foodId+","+this.totalPrice;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(int customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
