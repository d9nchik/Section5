import java.util.Scanner;

public class exercise47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String number = input.nextLine();

        if (number.length() < 12) {
            System.out.println(number + " is an invalid input");
            System.exit(1);
        }
        int sum = 0;
        for (int k = 0; k < 12; k++) {
            if (k % 2 == 0)
                sum += 3 * (number.charAt(k) - '0');
            else
                sum += number.charAt(k) - '0';
        }
        int checksum = 10 - (sum) % 10;
        if (checksum == 10)
            checksum = 0;
        System.out.println("The ISBN-13 number is " + number + checksum);
    }
}
