package org.example.module_3.Abstraction.Interfaces.example_2;

public class Upi extends bank implements Payment{
    public void pay(int amount) {
        balance -= amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void showBalance() {
        System.out.println("Balance : "+balance);
    }
}
