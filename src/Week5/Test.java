package Week5;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0,"red");
        Cylinder cylinder = new Cylinder(5.0, 4.0);
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.toString());

    }
}
