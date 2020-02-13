import java.util.Scanner;

public class exercise42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money = 0;
        double salary = 0;

        System.out.print("Enter a commission sought: ");
        final double COMMISSION_SOUGHT = input.nextDouble();

        while (salary < COMMISSION_SOUGHT) {
            money += 0.5;

            if (money <= 5_000) {
                salary = money * 0.94;
            } else if (money <= 10_000) {
                salary = money - (5_000 * 0.06 + (money - 5_000) * 0.08);
            } else
                salary = money - (5_000 * 0.06 + 5_000 * 0.08 + (money - 10_000) * 0.1);
        }

        System.out.println("sales amount = " + money);
    }
}
