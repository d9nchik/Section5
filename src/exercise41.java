import java.util.Scanner;

public class exercise41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter numbers:");
        int userNumber = -1;
        int maxNumber = -1;
        int occurrence = 0;
        do {
            if (userNumber == maxNumber)
                occurrence++;
            else if (userNumber > maxNumber) {
                occurrence = 1;
                maxNumber = userNumber;
            }
            userNumber = input.nextInt();
        } while (userNumber != 0);

        System.out.println("The largest number is " + maxNumber);
        System.out.println("The occurrence count of the largest number is " + occurrence);
    }
}
