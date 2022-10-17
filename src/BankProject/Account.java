package BankProject;

import java.util.Scanner;

public class Account {
    double balance;
    int id, pin, owner;
    String type;

    public Account(double balance, int id, int pin, int owner, String type) {
        this.balance = balance;
        this.id = id;
        this.pin = pin;
        this.owner = owner;
        this.type = type;
    }

    /**
     * Returns owner's first and last name (same as Customer.getName()).
     */
    public int getOwnerID() {
        return owner;
    }

    public int getId() {
        return id;
    }

    public boolean pin(int pin) {
        return this.pin == pin;
    }

    public void setPin(int pin) {
        Scanner ask = new Scanner(System.in);
        System.out.println("Enter pin");
        while (true) {
            int pn = ask.nextInt();
            if (this.pin == pn) {
                this.pin = pin;
            }
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double deposit) {
        double interest = 0.02;
        if (this.type.toUpperCase().equals("SAVINGS")) {
            interest *= 2;
        }
        this.balance += deposit;

        if (this.balance >= 10000) {
            this.balance += deposit * (interest + 0.03);
        } else {
            this.balance += deposit * interest;
        }
    }

    public void withdraw(double withdrawal) {
        if(withdrawal<=this.balance){
            this.balance-=withdrawal;
        }
    }

    @Override
    public String toString() {
        return String.format("%.2f,%d,%d,%d,%s",balance,id,pin,owner,type);
    }

    public String getData() {
        return String.format("{ID:%d,type:%s,balance:%.2f", this.id, this.type, this.balance);
    }
}
