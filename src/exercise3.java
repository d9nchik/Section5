public class exercise3 {
    public static void main(String[] args) {
        System.out.println("Celsius     Fahrenheit");

        for (int i = 0; i <= 100; i += 2) {
            double fahrenheit = i * 9 / 5.0 + 32;
            System.out.printf("%-3d         %10.1f\n", i, fahrenheit);
        }
    }
}
