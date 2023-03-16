public class SimpleMathOperations {

    public double sum(double a, double b) {
        return a + b;
    }

    public void sumVoid(double a, double b) {
        System.out.println("Sum (from void method): " + (a + b));
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double divideOst(double a, double b) {
        return a % b;
    }
}
