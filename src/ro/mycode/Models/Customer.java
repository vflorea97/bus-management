package ro.mycode.Models;

public class Customer {

    private int customerId;
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumaber;
    private String password;

    public Customer (){
        this.customerId = 0;
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.phoneNumaber = 0;
        this.password = "";
    }

    public Customer (int customerId,String firstName,String lastName,String email,int phoneNumaber,String password){
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumaber = phoneNumaber;
        this.password = password;
    }

    public Customer (String text){
        String [] prop = text.split(",");
        this.customerId = Integer.parseInt(prop[0]);
        this.firstName = prop[1];
        this.lastName = prop[2];
        this.email = prop[3];
        this.phoneNumaber = Integer.parseInt(prop[4]);
        this.password = prop[5];
    }

    public String descriere (){
        String text = "";
        text += "Customer id: " + this.customerId + "\n";
        text += "First name: " + this.firstName + "\n";
        text += "Last name: " + this.lastName + "\n";
        text += "Email: " + this.email + "\n";
        text += "Phone number: " + this.phoneNumaber + "\n";
        return text;
    }

    public String toSave (){
        return this.customerId+","+this.firstName+","+this.lastName+","+this.email+","+this.phoneNumaber+","+this.password;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumaber() {
        return phoneNumaber;
    }

    public void setPhoneNumaber(int phoneNumaber) {
        this.phoneNumaber = phoneNumaber;
    }

    public String getPassword (){
        return password;
    }
    public void setPassword (String password){
        this.password = password;
    }
}
