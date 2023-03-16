public class AC {
    public static void main(String[] args) {
        Calc calc = new Calc(2,3);
        System.out.println(calc.sum());
    }
}

class Calc extends AbsCalc {

    private int a, b;
    public Calc(int a, int b) {

        super(a, b);

        this.a = a;
        this.b = b;
    }

    @Override
    int sum() {
        return a + b;
    }
}

abstract class AbsCalc {

    private int a, b;

    AbsCalc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    abstract int sum();

    public int subtract() {
        return a - b;
    }

    private int multiply() {
        return a * b;
    }

    protected int divide() {
        return a / b;
    }

    abstract class InnerClass {

    }
}