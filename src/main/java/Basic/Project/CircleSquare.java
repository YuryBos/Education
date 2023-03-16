public class CircleSquare {
    // Square = PI * (d / 2)^2

    public CircleSquare(double d) {
//        double temp1 = divide(d);
//        double temp2 = power(temp1);
//        double temp3 = multiply(temp2);

        double temp3 = multiply(power(divide(d)));
        System.out.println("Circle square is " + temp3);
    }

    private double divide(double d) {
        return d / 2;
    }

    private double power(double x) {
        return Math.pow(x, 2);
    }

    private double multiply(double w) {
        return Math.PI * w;
    }

//    public double getResult(double d) {
    // 1
//        return multiply(power(divide(d)));

    // 2
//        double temp1 = divide(d);
//        double temp2 = power(temp1);
//        double temp3 = multiply(temp2);
//
//        return temp3;
//    }

}
