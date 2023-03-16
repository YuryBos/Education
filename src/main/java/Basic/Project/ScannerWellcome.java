import java.util.Scanner;

public class ScannerWellcome {
    public void workingOnScanner() {
        Scanner sc = new Scanner(System.in);

        // 1
        System.out.print("Enter pls actual date day: ");
        byte day = sc.nextByte();

        // 2
        System.out.print("Enter pls your name: ");
        String name = sc.next();

        sc.close();

        System.out.println("Hello, " + name + ". You entered day as: " + day);

        byte week = (byte)(day / 7);
        byte ostatok = (byte)(day % 7);

        System.out.println("Weeks: " + week + ", ostatok: " + ostatok);
    }
}
