import java.util.Scanner;

public class JahreszeitMedhodIf {
    public static void main(String[] args) {
        int sc = 1;
        while (sc >= 1 && sc <= 10000) {
//            System.out.println("Wie ist Monats Zahl? ");
//            Scanner sc1 = new Scanner(System.in);
//            sc = sc1.nextInt();
//            if (sc == 12 || sc == 1 || sc ==2) {
//                System.out.println("Winter");
//            } else if (sc >= 3 && sc <= 5) {
//                System.out.println("Fruling");
//            } else if (sc >= 6 && sc <= 8) {
//                System.out.println("Sommer");
//            } else if (sc >= 9 && sc <= 11) {
//                System.out.println("Herbs");
//            } else {
//                System.out.println("Falshe");
//            }
//            String seson = switch (sc) {
//                case 1, 2, 12 -> "Winter";
//                case 3, 4, 5 -> "Fruling";
//                case 6, 7, 8 -> "Sommer";
//                case 9, 10, 11 -> "Herbs";
//                default -> ("Falshe: " + sc);
//            };
            System.out.println(SwitchCaseExample.getSeason());
        }
    }
}