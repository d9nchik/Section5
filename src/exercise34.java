import java.util.Scanner;

public class exercise34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userWin = 0;
        int computerWin = 0;

        do {
            int computerChoice = (int) (Math.random() * 3);

            System.out.print("scissor (0), rock (1), paper (2): ");
            int userChoice = input.nextInt();

            System.out.print("The computer is ");

            whatSign(computerChoice);

            System.out.print(". You are ");

            whatSign(userChoice);

            if (computerChoice == userChoice) {
                System.out.println(" too. It is draw");
                computerWin++;
                userWin++;
            } else if (computerChoice == 0 && userChoice == 2
                    || computerChoice == 1 && userChoice == 0
                    || computerChoice == 2 && userChoice == 1) {
                System.out.println(". You loose");
                computerWin++;
            } else {
                System.out.println(". You won");
                userWin++;
            }
        } while (Math.abs(computerWin - userWin) < 3);

        if (computerWin > userWin) {
            System.out.print("You loose");
        } else
            System.out.print("You win");

        System.out.println(" with score " + userWin + ":" + computerWin);

    }

    private static void whatSign(int userChoice) {
        switch (userChoice) {
            case 0:
                System.out.print("scissor");
                break;
            case 1:
                System.out.print("rock");
                break;
            case 2:
                System.out.print("paper");
                break;
            default:
                System.out.println("/nData is incorrect!");
        }
    }
}
