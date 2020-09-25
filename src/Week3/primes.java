package Week3;
import java.util.Scanner;

public class primes {
    /**
     * in số nguyên tố.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        primes prime = new primes();

        int num = scanner.nextInt();
        prime.primes(num);
    }

    /**
     *  kiểm tra số nguyên tố.
     * @param num truyền vào số nguyên num
     * @return trả về đúng nếu là số nguyên tố
     */
    public boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * in ra các số nguyên tố từ 1 đến n.
     * @param n truyen vao so nguyen n
     */
    public void primes(int n) {
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
