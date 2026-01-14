import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input voltage
        System.out.print("Enter voltage (in volts): ");
        double voltage = sc.nextDouble();

        // Input current
        System.out.print("Enter current (in amperes): ");
        double current = sc.nextDouble();

        // Calculate power
        double power = voltage * current;

        // Output
        System.out.println("Power consumption = " + power + " Watts");

        sc.close();
    }
}
