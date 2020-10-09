

public  class Circle extends Shape {
    final static double Pi = 3.14;
    protected double radius;
    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Pi;
    }

    @Override
    public double getPerimeter() {
        return 2 * Pi * radius;
    }

    @Override
    public String toString() {
        return "Circle["
                + "radius=" + this.radius
                + ",color=" + getColor()
                + ",filled=" + isFilled() + ']';
    }
}
