import java.util.Scanner;

public class exercise30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount: ");
        double money = input.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double interestRate = input.nextDouble();
        System.out.print("Enter number of months: ");
        int months = input.nextInt();

        double sum = 0;
        double monthRate = interestRate / 1200.0;

        for (int k = 0; k < months; k++) {
            sum = (money + sum) * (1 + monthRate);
        }

        System.out.println("You will save $" + sum);
    }
}
