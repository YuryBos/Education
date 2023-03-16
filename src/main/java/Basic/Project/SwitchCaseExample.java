package Basic.Project;

public class SwitchCaseExample {

    public static void main(String[] args) {
//        int dayOfWeek = 1;
//
//        switch (dayOfWeek) {
//            case 1 -> System.out.println("MO");
//            case 2 -> System.out.println("TU");
//            case 3 -> System.out.println("WD");
//            case 4 -> System.out.println("TH");
//            case 5 -> System.out.println("FR");
//            case 6 -> System.out.println("SA");
//            case 7 -> System.out.println("SU");
//            default -> System.out.println("Something wrong");
//        }
        int month = 10;
        int second = 20;
//        switch (month) {
//            case 1, 2, 12:
//                System.out.println("Winter");
//                break;
//
//            case 3,4,5:
//                System.out.println("Spring");
//                break;
//
//            case 6,7,8:
//                System.out.println("Summer");
//                break;
//
//            case 9,10,11:
//                System.out.println("Autumn");
//                break;
//
//            default:
//                System.out.println("Something wrong");
//        }
        System.out.println(getSeason(month));
    }

    public static String getSeason(int argument) {

        return switch (argument) {
            case 1,2,12 -> "Winter";
            case 3,4,5 -> "Spring";
            case 6,7,8 -> "Summer";
            case 9,10,11 -> "Autumn";
            default -> "Something wrong";
        };

    }
}
