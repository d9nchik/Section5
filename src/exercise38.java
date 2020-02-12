import java.util.Scanner;

public class exercise38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        int showNumber = number;

        StringBuilder output = new StringBuilder();

        do {
            int adding = number%8;
            output.append(adding);
            number-=adding;
            number/=8;
        } while (number != 0);

        output.reverse();

        System.out.println(showNumber + " = " + output);
    }
}
