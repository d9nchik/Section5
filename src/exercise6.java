public class exercise6 {
    public static void main(String[] args) {
        System.out.println("Ping    Square meter    |    Square meter    Ping");

        for (int x = 10; x <= 80; x += 5) {
            double sqMeterO = x * 3.305;
            int sqMeterI = x + 20;
            double ping = sqMeterI / 3.305;

            System.out.printf("%-4d    %12.3f    |    %-12d  %6.3f\n", x, sqMeterO, sqMeterI, ping);
        }
    }
}
