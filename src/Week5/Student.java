package Week5;

public class Student extends Person{
    private String program;
    private int year;
    private double fee;

    /**
     * Khoi tao constructor.
     * @param name ke thua lop Person
     * @param address ke thua lop Person
     * @param program truyen vao tham so kieu String
     * @param year truyen vao tham so kieu int
     * @param fee truyen vao tham so kieu double
     */
    public Student(String name, String address, String program,
                   int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Student[" + super.toString()
                + ",program=" + program
                + ",year=" + year
                +",fee=" + fee + ']';
    }
}
