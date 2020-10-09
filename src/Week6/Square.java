

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
        return super.getWidth();
    }
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public String toString() {
        return "Square[" + "side=" + this.getSide()
                + ",color=" + super.getColor()
                + ",filled=" + super.isFilled() + "]";
    }
}
