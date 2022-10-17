package BankProject;

import java.util.ArrayList;

public class Customer {
    int id;
    String name,lastName;
    public ArrayList<Integer> accountsList = new ArrayList<>();

    public Customer(String name, String lastName, int id){
        this.name=name;
        this.lastName=lastName;
        this.id=id;
    }
    /**Returns full name(First + Last).*/
    public String getName() {
        return name+" "+lastName;
    }
    public int getId(){
        return id;
    }
    public void addAcountID(int id){
        accountsList.add(id);
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%d",name,lastName,id);
    }
}
