package doyou;

public class Student extends Customer{
    private long studentID;
    private final double DISCOUNT = .5;

    public Student(String name, Size size, long studentID) {
        super(name, size);
        this.studentID = studentID;
    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }
}
