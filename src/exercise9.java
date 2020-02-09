import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        String looser, secondLooser, temp;
        int looserPoint, secondLooserPoint, tempPoint;

        System.out.print("Enter name of student: ");
        looser = input.next();
        System.out.print("Enter his points: ");
        looserPoint = input.nextInt();

        System.out.print("Enter name of student: ");
        secondLooser = input.next();
        System.out.print("Enter his points: ");
        secondLooserPoint = input.nextInt();

        if (secondLooserPoint < looserPoint) {
            String name = looser;
            int points = looserPoint;

            looser = secondLooser;
            looserPoint = secondLooserPoint;

            secondLooser = name;
            secondLooserPoint = points;
        }

        for (int k = 2; k < numberOfStudents; k++) {
            System.out.print("Enter name of student: ");
            temp = input.next();
            System.out.print("Enter his points: ");
            tempPoint = input.nextInt();

            if (tempPoint < looserPoint) {
                secondLooser = looser;
                secondLooserPoint = looserPoint;

                looserPoint = tempPoint;
                looser = temp;
            } else if (tempPoint < secondLooserPoint) {
                secondLooser = temp;
                secondLooserPoint = tempPoint;
            }
        }

        System.out.println("Looser is " + looser + " with point " + looserPoint);
        System.out.println("Better than looser is " + secondLooser + " with point " + secondLooserPoint);
    }
}
