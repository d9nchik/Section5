import java.util.Scanner;

public class exercise45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int N = 10;

        double meanSum = 0;
        double sumDeviationSquare = 0;

        System.out.print("Enter 10 numbers: ");
        for (int k = 0; k < N; k++) {
            double number = input.nextDouble();

            meanSum += number;
            sumDeviationSquare += Math.pow(number, 2);
        }

        double deviation = Math.sqrt((sumDeviationSquare - Math.pow(meanSum, 2) / N) / (N - 1));
        double mean = meanSum / N;

        System.out.println("The mean is " + mean);
        System.out.printf("The standard deviation is %7.5f", deviation);
    }
}
