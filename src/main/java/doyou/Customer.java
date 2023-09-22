package doyou;

import java.sql.SQLOutput;

public abstract class Customer extends Person{
    public Customer(String name, Size size) {
        super(name, size);
    }
    public void printCustomername(){
        System.out.println("Customer Name: " +getName());
    }

    @Override
    public String toString() {
        return "Customer{}";
    }
}
