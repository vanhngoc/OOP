package Week5;

public class Staff extends Person{
    private String school;
    private double pay;

    /**
     * khoi tao constructor.
     * @param name tham so string
     * @param address   tham so String
     * @param school tham so String
     * @param pay tham so double
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public double getPay() {
        return pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    @Override
    public String toString() {
        return "Staff[" + super.toString()
                + ",school=" + school
                + ",pay=" + pay + ']';
    }
}
