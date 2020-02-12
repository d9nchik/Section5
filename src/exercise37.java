import java.util.Scanner;

public class exercise37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        int showNumber = number;

        StringBuilder output = new StringBuilder();

        do {
            if (number % 2 == 1) {
                number--;
                output.append('1');
                number /= 2;
            } else {
                number /= 2;
                output.append('0');
            }
        } while (number != 0);

        output.reverse();

        System.out.println(showNumber + " = " + output);
    }
}
