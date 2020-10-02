package Week5_1;
public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * khoi tao.
     * @param radius truyen vao tham so double
     * @param height truyen vao tham so double
     * @param color truyen vao tham so string
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder[" + super.toString()
                + ",height=" + height + "]";
    }

    @Override
    public double getArea() {
        return 2 * super.getArea() + 2 * PI * getRadius() * getHeight();
    }

    public double getVolume() {
        return height * super.getArea();
    }

}
