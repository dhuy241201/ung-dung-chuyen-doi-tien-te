import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input money value: ");

        double USD = scanner.nextDouble();
        double VND = 23000.0 * USD;

        System.out.printf("%.0f USD = %.0f VND",USD,VND);
    }
}
