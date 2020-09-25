package Week3;
public class Fraction {
    private int numerator;
    private int denominator;

    /**
     * ham khoi tao thuoc tinh.
     *
     * @param numerator   tu so
     * @param denominator mau so
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            this.denominator = 1;
        } else {
            this.denominator = denominator;
        }
    }

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    /**
     * tra ve gia tri tu so.
     *
     * @return tra ve tu so
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Ham seter tu so.
     *
     * @param num dua vao so nguyen Num
     */
    public void setNumerator(int num) {
        this.numerator = num;
    }

    /**
     * tra ve mau so.
     *
     * @return tra ve mau so
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * sette mau so.
     *
     * @param denominator dau vao so nguyen den
     */
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            return;
        }
        this.denominator = denominator;
    }

    public void display() {
        if (this.denominator == 1) {
            System.out.println(this.numerator);
        } else
            System.out.println(this.numerator + "/" + this.denominator);
    }
    /**
     * ham tim uoc chung lon nhat.
     *
     * @param a dau vao tham so aa
     * @param b dau vao so nguyen b
     * @return tra ve phan ucln
     */
    public int gcd(int a, int b) {
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }
        if (a * b == 0) {
            return a + b;
        }
        if (a > b) {
            return gcd(a - b, b);
        } else {
            return gcd(a, b - a);
        }
    }

    /**
     * rut gon phan so.
     *
     * @return tra ve phan so da rut gon
     */
    public Fraction reduce() {
        int numerator = this.numerator;
        int denominator = this.denominator;

        int maxDiv = gcd(this.numerator, this.denominator);
        if (maxDiv == 0) {
            maxDiv = 1;
        }
        this.numerator = this.numerator / maxDiv;
        this.denominator = this.denominator / maxDiv;
        return this;
    }

    /**
     * ham cong phan so.
     *
     * @param fracA dau vao 1 phan so
     * @return tong 2 phan so
     */
    public Fraction add(Fraction fracA) {
        this.numerator = this.numerator * fracA.getDenominator()
                            + this.denominator * fracA.getNumerator();
        this.denominator = this.denominator * fracA.getDenominator();

        return this;
    }

    /**
     * ham tru phan so.
     *
     * @param fracA dau vao 1 phan so
     * @return hieu 2 phan so
     */
    public Fraction subtract(Fraction fracA) {
        this.numerator = this.numerator * fracA.getDenominator()
                            - this.denominator * fracA.getNumerator();
        this.denominator = this.denominator * fracA.getDenominator();

        return this;
    }

    /**
     * Nhan 2 phan so.
     *
     * @param fraction dau vao 1 phan so kieu Fraction
     * @return tra ve tich 2 phan so
     */
    public Fraction multiply(Fraction fraction) {
        this.numerator = this.numerator * fraction.numerator;
        this.denominator = this.denominator * fraction.denominator;
        return this;
    }

    /**
     * Ham chia 2 phan so.
     *
     * @param fraction dau vao phan so kieu Fraction
     * @return tra ve thuong 2 phan so
     */
    public Fraction divide(Fraction fraction) {
        if (fraction.equals(new Fraction(0, 1))) {
            return this;
        }
        this.numerator = this.numerator * fraction.getDenominator();
        this.denominator = this.denominator * fraction.getNumerator();

        return this;
    }

    /**
     * ham kiem tra 2 phan so bawng nhau.
     *
     * @param obj dau vao 1 doi tuong
     * @return tra ve dung hoac sai
     */
    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            Fraction other = (Fraction) obj;
            reduce();
            other.reduce();
            return this.numerator == other.numerator && this.denominator == other.denominator;
        }
        return false;
    }
}



