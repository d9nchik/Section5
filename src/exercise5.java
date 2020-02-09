public class exercise5 {
    public static void main(String[] args) {
        System.out.println("Celsius    Fahrenheit    |    Fahrenheit    Celsius");

        for (int x = 0; x <= 100; x += 2) {
            double fahrenheitO = x * 9 / 5.0 + 32;
            int fahrenheitI = (int)(20 + x * 2.5);
            double celsius = (fahrenheitI-32)*5/9.0;

            System.out.printf("%-7d    %10.3f    |    %-10d    %7.3f\n", x, fahrenheitO, fahrenheitI,celsius);
        }
    }
}
