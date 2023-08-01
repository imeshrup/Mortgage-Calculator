import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte months_in_year = 12;
        byte percent = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / percent / months_in_year;

        System.out.print("Period (Years): ");
        Byte years = scanner.nextByte();
        int noOfPayments = years * months_in_year;

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, noOfPayments))
                        / (Math.pow(1 + monthlyInterest, noOfPayments) - 1);

        String mortgagedFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgagedFormatted);
    }
}