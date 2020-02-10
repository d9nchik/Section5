import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        System.out.print("All smallest factor: ");
        int divisor = 2;
        while (number!=1){
            if(number%divisor==0){
                System.out.print(divisor+" ");
                number/=divisor;
            }
            else
                divisor++;
        }
    }
}
