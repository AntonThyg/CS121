package BankProject;

import BankProject.Account;
import BankProject.Customer;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static HashMap<Integer, Account> accounts = new HashMap<>();
    static HashMap<Integer, Customer> customers = new HashMap<>();

    /**Reads and parses through Accounts.csv*/
    static {
        try {
            Scanner in = new Scanner(new File("src/Accounts.csv"));
            while (in.hasNextLine()) {
                String[] temp = in.nextLine().split(",");
                Account account = new Account(Double.parseDouble(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), Integer.parseInt(temp[3]), temp[4]);
                accounts.put(account.id, account);
            }
            in.close();
        } catch (Exception e) {
            System.out.println("Error reading or parsing src/Accounts.csv");
        }
    }
    /**Reads and parses through Customers.csv*/
    static {
        try{
            Scanner in = new Scanner(new File("src/Customers.csv"));
            while(in.hasNextLine()){
                String[] temp = in.nextLine().split(",");
                Customer customer = new Customer(temp[0],temp[1],Integer.parseInt(temp[2]));
                customers.put(customer.id,customer);
            }
            in.close();
        }catch (Exception e){
            System.out.println("Error reading or parsing src/Accounts.csv");
        }
    }
    public static void main(String[] args) {
        bank();
    }
    /**Annotates newly created accounts and new customers into registry files and updates existing account info*/
    public static void bank(){
        int in1;
        while(true){
            in1=Integer.parseInt(JOptionPane.showInputDialog("Welcome to the bank\n1:Access Account\n2:Create New Account\n3:Exit"));
            if(in1==1){
                access();
            }else if(in1==2){
                create();
            }else {
                exit();
                break;
            }
        }
    }
    public static void access(){
        Customer c=null;
        int in2;
        while(true){
            int id = Integer.parseInt(JOptionPane.showInputDialog("Enter your customer ID"));
            if(customers.containsKey(id)){
                c = customers.get(id);
                break;
            }else{
                JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"Error id not found.\nTry creating a new account.");
            }
        }
        if(!c.equals(null)){
            Account a = view(c.getId());
            int pin;
            while(true){
                pin = Integer.parseInt(JOptionPane.showInputDialog("Enter pin for account "+a.getId()));
                if(a.pin(pin)){
                    in2 = Integer.parseInt(JOptionPane.showInputDialog("1:View Balance\n2:Deposit\n3:Withdraw\n4:Exit"));
                    if (in2 == 1) {
                        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), String.format("Balance of Account %d is $%.2f", a.getId(), a.getBalance()));
                        break;
                    }else if(in2==2){
                        double deposit = Double.parseDouble(JOptionPane.showInputDialog("How much would you like to deposit?"));
                        accounts.get(a.getId()).deposit(deposit);
                    }else if(in2==3){
                        double withdrawal = Double.parseDouble(JOptionPane.showInputDialog("How much would you like to withdraw?"));
                        if(withdrawal<=a.getBalance()){
                            accounts.get(a.getId()).withdraw(withdrawal);
                        }else{
                            System.out.println("Insufficient funds for withdrawal");
                        }
                    }else{
                        break;
                    }
                }else{
                    boolean tryAgain = JOptionPane.showConfirmDialog(null,"Would you like to try again?",  "Inccorrect Pin",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
                    if(!tryAgain){
                        break;
                    }
                }
            }
        }
    }
    public static Account view(int cId){
        String accountList = "";
        for(int i:accounts.keySet()){
            if(accounts.get(i).getOwnerID()==cId){
                accountList+=accounts.get(i).getData()+"\n";
            }
        }
        return accounts.get(Integer.parseInt(JOptionPane.showInputDialog("Pick an account\n"+accountList)));
    }
    public static void create(){
        boolean returning;
        int in2,in3;
        String name,type="";
        int id,pin,owner;
        double balance;
        while(true){
            returning = JOptionPane.showConfirmDialog(null,"Are you a returning customer?","",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
            if(returning){
                while(true) {
                    owner = Integer.parseInt(JOptionPane.showInputDialog("Enter your customer ID"));
                    if(customers.containsKey(owner)){
                        break;
                    }else{
                        owner=Integer.parseInt(JOptionPane.showInputDialog("Unknown owner key, enter again"));
                    }
                }
                balance=Double.parseDouble(JOptionPane.showInputDialog("Enter your initial deposit"));
                in2=Integer.parseInt(JOptionPane.showInputDialog("1:Checking,2:Savings"));
                if(in2==1){
                    type="Checking";
                }else if(in2==2){
                    type="Savings";
                }
                while(true){
                    id=(int)(Math.random()*9999);
                    if(!accounts.containsKey(id)){
                        System.out.println("id is "+id);
                        break;
                    }
                }
                pin = Integer.parseInt(JOptionPane.showInputDialog("Enter 4 digit pin"));
                Account temp = new Account(balance,id,pin,owner,type);
                accounts.put(id,temp);
                break;
            }else{
                name = JOptionPane.showInputDialog("Enter your first and last name");
                while(true){
                    id=(int)(Math.random()*999);
                    if(!customers.containsKey(id)){
                        System.out.println("Customer id: "+id);
                        break;
                    }

                }
                String[] names = name.split(" ");
                Customer c = new Customer(names[0],names[1],id);
                customers.put(id,c);
                in2=Integer.parseInt(JOptionPane.showInputDialog("1:Checking\n2:Savings"));
                balance=Double.parseDouble(JOptionPane.showInputDialog("Initial deposit"));
                if(in2==1){
                    type="Checking";
                }else if(in2==2){
                    while(true) {
                        if (balance >= 100) {
                            type = "Savings";
                            break;
                        }else{
                            balance+=Double.parseDouble(JOptionPane.showInputDialog("Add funds to your initial deposit of "+balance));
                        }
                    }
                }
                pin = Integer.parseInt(JOptionPane.showInputDialog("Create 4 digit pin"));
                while(true){
                    id=(int)(Math.random()*9999);
                    if(!accounts.containsKey(id)){
                        System.out.println("ID is "+id);
                        break;
                    }
                }
                Account a = new Account(balance,id,pin,c.getId(),type);
                accounts.put(id,a);
                break;
            }
        }
    }
    public static void exit(){
        try {
            FileWriter accts = new FileWriter("src/Accounts.csv");
            String write="";
            for (int i : accounts.keySet()) {
                write+=accounts.get(i).toString()+"\n";
            }
            accts.write(write);
        }catch (Exception e){
            System.out.println("Error writing in Accounts.csv");
        }
        try {
            FileWriter cstmrs = new FileWriter("src/Customers.csv");
            String write = "";
            for(int i: customers.keySet()){
                write+=customers.get(i).toString()+"\n";
            }
            cstmrs.write(write);
        }catch (Exception e){
            System.out.println("Error writing Customers.csv");
        }
    }


}
