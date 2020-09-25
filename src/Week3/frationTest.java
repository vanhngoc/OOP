package Week3;
public class frationTest {
    /**
     * JKHAGWUFQHWUIFH.
     * @param args QWTDYUQWTDY
     */
    public static void main(String[] args) {

        Fraction fraction1 = new Fraction(6,0);
        Fraction fraction2 = new Fraction(6,0);

        fraction2.reduce().display();
        fraction1.add(fraction2).display();
        fraction1.subtract(fraction2).display();
        fraction1.multiply(fraction2).display();
        fraction1.divide(fraction2).display();
        boolean equals = fraction1.equals(fraction2);
        System.out.println(equals);
    }
}
