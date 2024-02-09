package _10_polymorphism;

import entities.BussinessAccount;

public class Program_1 {

    public static void main(String[] args) {
        BussinessAccount a = new BussinessAccount(26468, "Douglas", 600, 800.00);
        System.out.println(a.getBalance());
        
        a.loan(500.00);

        System.out.println(a.getBalance());
    }
}
