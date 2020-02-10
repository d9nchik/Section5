import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int number = input.nextInt();

        for (int i = number; i>0; i--){
            for (int j = i; j>0; j--)
                System.out.print(j+" ");

            for (int k=2; k<=i; k++)
                System.out.print(k+" ");

            System.out.print("\n");
        }
    }
}
