public class OperatorsExample {
    public static void main(String[] args) {

//        System.out.println("a > b: " + (a > b));
//        System.out.println("a < b: " + (a < b));
//        System.out.println("a >= b: " + (a >= b));
//        System.out.println("a <= b: " + (a <= b));
//        System.out.println("a == b: " + (a == b));
//        System.out.println("a != b: " + (a != b));

//        boolean one = a < b;
//        System.out.println(one);
//
//        boolean two = a <= b;
//        System.out.println(two);
        int a = 10;
        int b = 20;

        // (cond1 && cond2) -> true if cond1=true, cond2=true; else - false
        if ((a > b) && (a <= b)) {
            System.out.println("&&, оба условия верные");
        } else {
            System.out.println("&&, оба условия неверные, либо одно из условий неверное");
        }

        // (cond1 || cond2) - > true if cond1=true or cond2=true; else - false
        if ((a > b) || (a <= b)) {
            System.out.println("||, одно из условий верное");
        } else {
            System.out.println("||, оба условия неверные");
        }

        // NOT (!)
        System.out.println((a < b));
        System.out.println(!(a < b));

        // mix of logic operators
        //   (true   &&   true   &&   true)   ||  false
        if (((a < b) && (a <= b) && !(a > b)) || (a > b)) {
            System.out.println("first way");
        } else {
            System.out.println("second way");
        }

    }
}
