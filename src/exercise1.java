import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter your score: ");
        int score = input.nextInt();
        while (score != -1) {
            System.out.print("You ");
            if (score < 60)
                System.out.println("don`t ");
            System.out.println("pass the exam.\n");

            System.out.print("Enter your score: ");
            score = input.nextInt();
        }
        System.out.println("No numbers are entered except 0");
    }
}
