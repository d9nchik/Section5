import java.util.Scanner;

public class exercise46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String data = input.nextLine();

        System.out.print("The reversed string is ");
        for (int k = data.length() - 1; k >= 0; k--) {
            System.out.print(data.charAt(k));
        }
    }
}
