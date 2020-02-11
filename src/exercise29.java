import java.util.Scanner;

public class exercise29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.println("Enter the first day of the year!");
        System.out.print("1-Monday, 2-Tuesday etc. : ");
        int day = input.nextInt();

        int daysInmonth = 0;

        for (int month = 0; month < 12; month++) {
            System.out.print("\t\t\t\t\t");


            switch (month) {
                case 0:
                    System.out.print("January");
                    daysInmonth = 31;
                    break;
                case 1:
                    System.out.print("February");
                    day = (daysInmonth+day-1)%7+1;
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                        daysInmonth = 29;
                    else
                        daysInmonth = 28;
                    break;
                case 2:
                    System.out.print("March");
                    day = (daysInmonth+day-1)%7+1;
                    daysInmonth = 31;
                    break;
                case 3:
                    System.out.print("April");
                    day = (daysInmonth+day-1)%7+1;
                    daysInmonth = 30;
                    break;
                case 4:
                    System.out.print("May");
                    day = (daysInmonth+day-1)%7+1;
                    daysInmonth = 29;
                    break;
                case 5:
                    System.out.print("June");
                    day = (daysInmonth+day-1)%7+1;
                    daysInmonth = 30;
                    break;
                case 6:
                    System.out.print("July");
                    day = (daysInmonth+day-1)%7+1;
                    daysInmonth = 31;
                    break;
                case 7:
                    System.out.print("August");
                    day = (daysInmonth+day-1)%7+1;
                    daysInmonth = 31;
                    break;
                case 8:
                    System.out.print("September");
                    day = (daysInmonth+day-1)%7+1;
                    daysInmonth = 30;
                    break;
                case 9:
                    System.out.print("October");
                    day = (daysInmonth+day-1)%7+1;
                    daysInmonth = 31;
                    break;
                case 10:
                    System.out.print("November");
                    day = (daysInmonth+day-1)%7+1;
                    daysInmonth = 30;
                    break;
                case 11:
                    System.out.print("December");
                    day = (daysInmonth+day-1)%7+1;
                    daysInmonth = 31;
                    break;

            }

            System.out.println(" " + year);
            System.out.println("------------------------------------------------------");
            System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat");

            for (int k = day - 1; k > 0; k--) {
                System.out.print("\t\t");
            }

            for (int j = 1; j <= daysInmonth; j++) {
                if ((j + day) % 7 == 1)
                    System.out.printf("%2d\n", j);
                else
                    System.out.printf("%2d\t\t", j);
            }
            System.out.print("\n");


        }
    }
}
