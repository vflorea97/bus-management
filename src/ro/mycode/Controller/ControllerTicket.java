package ro.mycode.Controller;

import ro.mycode.Models.Ticket;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;

public class ControllerTicket {

    private ArrayList<Ticket> tickets;

    public ControllerTicket (){
        tickets = new ArrayList<>();
        this.load();
    }
    public ControllerTicket (String text){
        tickets = new ArrayList<>();
    }
    public void load (){
        try{
            File file = new File("D:\\mycode\\incapsulare\\bus-management\\src\\ro\\mycode\\Data\\Tickets.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String text = scanner.nextLine();
                Ticket ticket = new Ticket(text);
                this.tickets.add(ticket);
            }
            scanner.close();

        }catch (Exception e){

        }
    }
    public void save (){
        try{
            File file = new File("D:\\mycode\\incapsulare\\bus-management\\src\\ro\\mycode\\Data\\Tickets.txt");
            FileWriter writer = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(writer);
            printWriter.print(this.toSave());
            printWriter.close();

        }catch (Exception e){

        }
    }
    public String toSave (){
        String text = "";
        int i;
        for (i = 0; i < tickets.size() - 1; i++){
            text += this.tickets.get(i).toSave() + "\n";
        }
        text += this.tickets.get(i).toSave();
        return text;
    }
    public void afisare (){
        for (int i = 0; i < tickets.size(); i++){
            System.out.println(tickets.get(i).descriere());
        }
    }
    public Ticket getTicketByTicketId (int idTicket){
        for (int i = 0; i < tickets.size(); i++){
            if (tickets.get(i).getIdTicket() == idTicket){
                return tickets.get(i);
            }
        }
        return null;
    }
    public void addTicket (Ticket ticket){
        if (getTicketByTicketId(ticket.getIdTicket()) == null){
            this.tickets.add(ticket);
        }
    }
    public int generareId (){
        if (this.tickets.size() > 0){
            return tickets.get(tickets.size() - 1).getIdTicket() + 1;
        }
        return -1;
    }
}
