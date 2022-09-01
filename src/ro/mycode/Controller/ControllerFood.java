package ro.mycode.Controller;

import ro.mycode.Models.Food;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerFood {

    private ArrayList<Food> foods;

    public ControllerFood (){
        foods = new ArrayList<>();

    }
    public void load (){
        try{
            File file = new File("D:\\mycode\\incapsulare\\bus-management\\src\\ro\\mycode\\Data\\Food.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                String text = scanner.nextLine();
                Food food = new Food(text);
                this.foods.add(food);
            }
            scanner.close();
        }catch (Exception e){

        }
    }
    public void save (){
        try{
            File file = new File("D:\\mycode\\incapsulare\\bus-management\\src\\ro\\mycode\\Data\\Food.txt");
            FileWriter writer = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(writer);
            printWriter.print(this.toSave());
            printWriter.close();

        }catch (Exception e){

        }
    }
    public String toSave (){
        String text = "";
        int i = 0;
        for (i = 0; i < foods.size() - 1; i++){
            text += this.foods.get(i).toSave() + "\n";
        }
        text += this.foods.get(i).toSave();
        return text;
    }
    public void afisare (){
        for (int i = 0; i < foods.size(); i++){
            System.out.println(foods.get(i).descriere());
        }
    }
}
