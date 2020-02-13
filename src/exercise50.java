import java.util.Scanner;

public class exercise50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        input.nextLine();

        int k =1;

        for (;k<4;k++){
            for (int j=1;  j<10; j++){
                if (j!=9 && j!=8)
                    System.out.printf("%d*%d=%2d  ", j,k,(k*j));
                else
                    System.out.printf("%d*%d=%2d\n", j,k,(k*j));
            }
        }

        while (k<7){
            int j =1;
            while (j<10){
                if (j!=9 && j!=8)
                    System.out.printf("%d*%d=%2d  ", j,k,(k*j));
                else
                    System.out.printf("%d*%d=%2d\n", j,k,(k*j));
                j++;
            }
            k++;
        }

        do {
            int j =1;
            do {
                if (j!=9 && j!=8)
                    System.out.printf("%d*%d=%2d  ", j,k,(k*j));
                else
                    System.out.printf("%d*%d=%2d\n", j,k,(k*j));
                j++;
            }while (j<10);
            k++;
        }while (k<10);
    }
}
