package ro.mycode.Models;

public class Food {

    private int foodId;
    private String name;
    private int pret;

    public Food (){
        this.foodId = 0;
        this.name = "";
        this.pret = 0;
    }

    public Food (int foodId,String name,int pret){
        this.foodId  = foodId;
        this.name = name;
        this.pret = pret;
    }

    public Food (String text){
        String [] prop = text.split(",");
        this.foodId = Integer.parseInt(prop[0]);
        this.name = prop[1];
        this.pret = Integer.parseInt(prop[2]);
    }

    public String descriere (){
        String text = "";
        text += "Food id: " + this.foodId + "\n";
        text += "Food name: " + this.name + "\n";
        text += "Price: " + this.pret + "\n";
        return text;
    }

    public String toSave (){
        return this.foodId+","+this.name+","+this.pret;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }
}
