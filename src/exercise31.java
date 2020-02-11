import java.util.Scanner;

public class exercise31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double percentage = input.nextDouble();
        System.out.print("Enter maturity period (number of months): ");
        int months = input.nextInt();

        System.out.println("Month\tCD Value");
        for (int k=1;k<=months;k++){
            amount+=amount*percentage/1200.0;
            System.out.printf("%2d   \t%8.2f\n", k, amount);
        }
    }
}
