public class CircleSquareVoid {
    // Square = PI * (d / 2)^2

    private double result;

    public CircleSquareVoid(double diameter) {
        getResult(diameter);
    }

    private void divide(double d) {
        result = d / 2;
        System.out.println("Result (divide) = " + result);
    }

    private void power() {
        result = Math.pow(result, 2);
        System.out.println("Result (power) = " + result);
    }

    private void multiply() {
        result = Math.PI * result;
        System.out.println("Result (multiple) = " + result);
    }

    public void getResult(double d) {
        divide(d);
        power();
        multiply();

        System.out.println("Circle square " +
                "(void methods) is " + result);
    }
}
