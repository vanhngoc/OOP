package Week3;
import java.util.Scanner;

public class fibonaci {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        fibonaci fibon = new fibonaci();
        int num = scanner.nextInt();
        System.out.println(fibon.fibonaci(num));
    }

    /**
     *
     * @return
     */
    public int fibonaci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return (fibonaci(n - 1) + fibonaci(n - 2));
        }
    }


}
