import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number one: ");
        int n1 = input.nextInt();
        System.out.print("Enter number two: ");
        int n2 = input.nextInt();

        int d = Math.min(n1, n2);

        while (d > 1) {
            if (n1 % d == 0 && n2 % d == 0)
                break;
            else
                d--;
        }

    }
}
