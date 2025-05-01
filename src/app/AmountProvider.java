package app;
import java.util.Scanner;


public class AmountProvider {
    public double getAmount() {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter purchase amount, USD: ");
        return scanner.nextDouble();

    }
}
