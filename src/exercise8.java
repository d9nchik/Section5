import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        String winner, second;
        int winnerScore, secondScore;

        System.out.print("Enter name of student: ");
        winner = input.next();
        System.out.print("Enter his points: ");
        winnerScore = input.nextInt();

        for (int k = 1; k < numberOfStudents; k++) {
            System.out.print("Enter name of student: ");
            second = input.next();
            System.out.print("Enter his points: ");
            secondScore = input.nextInt();
            if (secondScore > winnerScore) {
                winnerScore = secondScore;
                winner = second;
            }
        }

        System.out.print(winner + " is winner with score " + winnerScore);
    }
}
