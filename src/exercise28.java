import java.util.Scanner;

public class exercise28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.println("Enter the first day of the year!");
        System.out.print("1-Monday, 2-Tuesday etc. : ");
        int day = input.nextInt();

        for (int month =0; month<12; month++){
            switch (month){
                case 0:
                    System.out.print("January");
                    break;
                case 1:
                    System.out.print("February");
                    day = (day + 30) % 7 + 1;
                    break;
                case 2:
                    System.out.print("March");
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                        day=(day+28)%7+1;
                    else
                        day=(day+27)%7+1;
                    break;
                case 3:
                    System.out.print("April");
                    day=(day+30)%7+1;
                    break;
                case 4:
                    System.out.print("May");
                    day=(day+29)%7+1;
                    break;
                case 5:
                    System.out.print("June");
                    day=(day+30)%7+1;
                    break;
                case 6:
                    System.out.print("July");
                    day=(day+29)%7+1;
                    break;
                case 7:
                    System.out.print("August");
                    day=(day+30)%7+1;
                    break;
                case 8:
                    System.out.print("September");
                    day=(day+30)%7+1;
                    break;
                case 9:
                    System.out.print("October");
                    day=(day+29)%7+1;
                    break;
                case 10:
                    System.out.print("November");
                    day=(day+30)%7+1;
                    break;
                case 11:
                    System.out.print("December");
                    day=(day+29)%7+1;
                    break;

            }

            System.out.print(" 1, "+year+" is ");
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Month was entered incorrect");
                    System.exit(1);
            }
        }

    }
}
