import java.util.Scanner;

public class exercise48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String data = input.nextLine();

        for (int k = 1; k < data.length(); k += 2) {
            if (data.charAt(k) != ' ')
                System.out.print(data.charAt(k));
        }
    }
}
