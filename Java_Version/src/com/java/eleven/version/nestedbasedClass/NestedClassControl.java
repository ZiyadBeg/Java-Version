package com.java.eleven.version.nestedbasedClass;

public class NestedClassControl {

}

class Bank {
    private int balance = 1000;
    static int access$000(Bank b) {
        return b.balance;
    }

    class ATM {
        void showBalance() {
            System.out.println(Bank.access$000(Bank.this));
        }
    }
}


