public class exercise4 {
    public static void main(String[] args) {
        System.out.println("Inches     Centimeters");

        for (int i = 1; i <= 10; i++) {
            double centimeters = i * 2.54;
            System.out.printf("%-3d         %11.2f\n", i, centimeters);
        }
    }
}
