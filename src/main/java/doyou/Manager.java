package doyou;

public class Manager extends Employee{
private final double DISCOUNT = 0.15;
    public Manager(String name, Size size) {
        super(name, size);
    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }
}
