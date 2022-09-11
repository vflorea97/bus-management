package ro.mycode.Models;

public class CustomerType {

    private int customerTypeId;
    private String customerType;
    private int pret;

    public CustomerType (){
        this.customerTypeId = 0;
        this.customerType = "";
        this.pret = 0;
    }

    public CustomerType (int customerTypeId,String customerType,int pret){
        this.customerTypeId = customerTypeId;
        this.customerType = customerType;
        this.pret = pret;
    }

    public CustomerType (String text){
        String [] prop = text.split(",");
        this.customerTypeId = Integer.parseInt(prop[0]);
        this.customerType = prop[1];
        this.pret = Integer.parseInt(prop[2]);
    }

    public String descriere (){
        String text = "";
        text += "Cod: " + this.customerTypeId + "\n";
        text += "Tip: " + this.customerType + "\n";
        text += "Pret: " + this.pret + "\n";
        return text;
    }

    public String toSave (){
        return this.customerTypeId+","+this.customerType+","+this.pret;
    }

    public int getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(int customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }
}
