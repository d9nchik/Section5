import java.util.Scanner;

public class exercise36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int number = input.nextInt();

        int tempNumber=number;

        int checkSum =0 ;
        for (int k=9;k>0;k--){
            checkSum+=(tempNumber%10)*k;
            tempNumber/=10;
        }

        checkSum%=11;
        System.out.print("The ISBN-10 number is " + number);
        if (checkSum < 10)
            System.out.println(checkSum);
        else
            System.out.println("X");
    }
}
