package Week6;

public class Square extends Rectangle{
    public Square() {}
    public Square(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    public Square(double side, String color, boolean filled) {
        super.setColor(color);
        super.setFilled(filled);
        super.setLength(side);
        super.setWidth(side);
    }
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    public double getSide() {
        return super.width;
    }
    @Override
    public void setWidth(double side) {
        super.width = side;
        super.length = side;
    }
    @Override
    public void setLength(double side) {
        super.length = side;
        super.width = side;
    }
    @Override
    public double getArea() {
        return width * width;
    }

    @Override
    public double getPerimeter() {
        return width * 4;
    }

    @Override
    public String toString() {
        return "Square[" + "side=" + this.getSide()
                + ", color=" + super.getColor()
                + ", filled=" + super.isFilled() + "]";
    }
}
