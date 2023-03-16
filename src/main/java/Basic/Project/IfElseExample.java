public class IfElseExample {
    public static void main(String[] args) {

        // 1. if construction
        boolean isFreeTime = true;
        if (isFreeTime == true) {
            System.out.println("1. Go to the lunch");
        }

        // 2. if-else construction
        boolean isWeatherNice = true;
        if (isWeatherNice)
            System.out.println("2. Go to the boat");
        else
            System.out.println("2. Go to the restaurant");

        // 3. nested-if
        boolean isWeatherGood = true;
        boolean isFreeTimeWeHave = true;

        if (isWeatherGood) {
            System.out.println("3. Go to the outside of city");
            if (isFreeTimeWeHave)
                System.out.println("3. Play with a horse");
        }

        // 4. if-else-if ladder
        boolean isWeatherBad = false;
        boolean isWeatherPerfect = false;

        if (isWeatherBad) {
            System.out.println("4. Stay at home");
            System.out.println("4. Watch a TV");
        }
        else if (isWeatherPerfect)
            System.out.println("4. Buy tickets and go to the market in another city");
        else
            System.out.println("4. Stay at home, meet your friends there");

        // 5.
        int a = 10;
        int b = 20;

        if (((a < b) && (a <= b) && !(a > b))) {
            System.out.println("5. first way");
        } else {
            System.out.println("5. second way");
        }

        if (a < b) {
            if (a >= b) {
                if (!(a > b)) {
                    System.out.println("5. first way");
                } else {
                    System.out.println("5.1. second way");
                }
            } else {
                System.out.println("5.2. second way");
            }
        } else {
            System.out.println("5.3. second way");
        }

        // 6. ternary operator
        int q = 100;
        int w = 33;

        // classic way (if-else)
        if (q < w) System.out.println("6. q < w");
        else System.out.println("6. q > w");

        // 6.1 ternary operator
        System.out.println(q < w ? "6.1 q < w" : "6.1 q > w");



        System.out.println("Final string");
    }
}
