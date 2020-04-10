import java.util.Scanner;

public class exercise44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        byte decimal = input.nextByte();

        System.out.print("The 8 bits are ");
        for (byte i = 7; i >=0  ; i--) {
            System.out.print((byte)((byte) 1 & (decimal>>i)));
        }
    }
}
