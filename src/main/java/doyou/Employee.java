package doyou;

public abstract class Employee extends Customer{
    private final double DISCOUNT 0.10;
    public Employee(String name,Size size){
        super(name,size);
    }

    public double getDISCOUNT() {

        return DISCOUNT;
    }
}
}
