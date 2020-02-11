public class exercise27 {
    public static void main(String[] args) {
        int leapYearCounter = 0;
        for (int year = 2014; year <= 2114; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                leapYearCounter++;
                if (leapYearCounter % 10 != 0)
                    System.out.print(year + " ");
                else
                    System.out.println(year);
            }
        }

        System.out.println("\nFrom 2014 to 2114 inclusive: " + leapYearCounter + " leap years");
    }
}
