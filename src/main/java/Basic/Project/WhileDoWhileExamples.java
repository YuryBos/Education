public class WhileDoWhileExamples {
    public static void main(String[] arg) {
//        getExample1();
        new CoffeeMachine();
    }

    public static void getExample1() {
        String str = "Hello, Java";

        // FOR LOOP
        for (int i = 0; i < 3; i++)
            System.out.println("For loop " + str);

        // WHILE LOOP
        int w = 0;
        while (w < 3) {
            System.out.println("While loop " + str);
            w++;
        }

        // DO-WHILE LOOP
        int q = 0;
        do {
            System.out.println("Do-While loop " + str);
            q++;
        } while (q < 3);
    }
}
