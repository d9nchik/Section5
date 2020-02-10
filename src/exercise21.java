import java.util.Scanner;

public class exercise21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();

        System.out.println("Interest Rate    Monthly Payment    Total Payment");

        for (double monthlyInterestRate = 5; monthlyInterestRate < 10.1; monthlyInterestRate += 0.25) {

            double monthlyPayment = loanAmount * monthlyInterestRate / 1200.0 / (1
                    - 1 / Math.pow(1 + monthlyInterestRate / 1200.0, numberOfYears * 12));
            double totalPayment = monthlyPayment * numberOfYears * 12;
            System.out.printf("%-6.3f%%               %6.2f           %8.2f\n", monthlyInterestRate, monthlyPayment, totalPayment);
        }
    }
}
