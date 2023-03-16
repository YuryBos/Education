package Basic.Project;

import java.util.Scanner;

public class CoffeeMachine {

    private boolean isSwitchOn;
    private Scanner sc;

    public CoffeeMachine() {
        isSwitchOn = true;
        sc = new Scanner(System.in);

        while (isSwitchOn) {
            System.out.print("Введите номер напитка, 1 - эспрессо, 2 - американо, 3 - капучино, 4 - чай: ");

            int drink = sc.nextInt();
            switch (drink) {
                case 1 -> getEspresso();
                case 2 -> getAmericano();
                case 3 -> getCapuccino();
                case 4 -> getTea();
                default -> System.out.println("Wrong button number");
            }
            System.out.println("Your drink is ready");
            getFinalAnswer();
        }
        System.out.println("See you next time");
        sc.close();
    }

    private void getFinalAnswer() {
        System.out.println("Would you to drink another one? true / false");
        isSwitchOn = sc.nextBoolean();
    }

    private void getEspresso() {
        System.out.println("Making an espresso...");
    }

    private void getSomeWater() {
        System.out.println("Adding some water...");
    }

    private void getAmericano() {
        getEspresso();
        getSomeWater();
    }

    private void getSomeMilk() {
        System.out.println("Adding some milk...");
    }

    private void getCapuccino() {
        getEspresso();
        getSomeMilk();
    }

    private void getTea() {
        System.out.println("Choosing a bag of tea...");
        getSomeWater();
    }

    public void sum(int a, int b) {
        System.out.println("Result is " + (a + b));
    }
}
