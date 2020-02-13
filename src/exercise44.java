import java.util.Scanner;

public class exercise44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        byte decimal = input.nextByte();

        String s1 = String.format("%8s", Integer.toBinaryString(decimal & 0xFF)).replace(' ', '0');
        System.out.println(s1);
    }
}
