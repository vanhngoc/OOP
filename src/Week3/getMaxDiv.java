package Week3;
import java.util.Scanner;

public class getMaxDiv {
    /**
     * hàm main
     * in ra ước chung lớn nhất của a và b
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getMaxDiv getDiv = new getMaxDiv();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(getDiv.gcd(a, b));
    }

    /**
     * tim uoc chung lon nhat cua 2 so.
     *
     * @param a truyen vao so nguyen a
     * @param b truyen vao so nguyen b
     * @return tra ve uoc chung lon nhat cua 2 so a va b
     */
    public int gcd(int a, int b) {
        if (a * b == 0)
            return a + b;
        if (a > b)
            return gcd(a - b, b);
        else
            return gcd(a, b - a);
    }
}
