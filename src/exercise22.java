import java.util.Scanner;

public class exercise22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double balance = input.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double interestRate = input.nextDouble();

        double monthlyInterestRate = interestRate / 1200.0;
        double monthlyPayment = balance * monthlyInterestRate / (1
                - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Total Payment: " + totalPayment+"\n");
        System.out.println("Payment#Interest\tPrincipal\tBalance");

        for (int i = 1; i <= numberOfYears * 12; i++) {
            double interest = monthlyInterestRate * balance;
            double principal = monthlyPayment - interest;

            balance = balance - principal;

            System.out.printf("%2d\t\t%5.2f\t\t%6.2f\t\t%7.2f\n", i, interest, principal, balance);
        }
    }
}
