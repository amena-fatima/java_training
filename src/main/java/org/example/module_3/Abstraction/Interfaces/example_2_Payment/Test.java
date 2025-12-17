package org.example.module_3.Abstraction.Interfaces.example_2_Payment;

public class Test {
    public static void main(String[] args) {
        Payment o1 = new CreditCard();
        o1.deposit(200);
        Payment o2 = new Upi();
        o2.pay(30);

        o1.showBalance();
        o2.showBalance();
    }
}
