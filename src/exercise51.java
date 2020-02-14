import java.util.Scanner;

public class exercise51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String first = input.nextLine();
        System.out.print("Enter the second string: ");
        String second = input.nextLine();

        int prefix = 0;
        while (true) {
            if (first.charAt(prefix) == second.charAt(prefix))
                prefix++;
            else
                break;
        }



        if (prefix == 0) {
            System.out.println(first + " and " + second + " have no common prefix");
        } else{
            String out = first.substring(0, prefix);
            System.out.println("The common prefix is " + out);
        }

    }
}
