public class exercise7 {
    public static void main(String[] args) {

        double dollars = 10_000;

        for (int x = 0; x < 10; x++) {
            dollars *= 1.06;
            System.out.println("In " + (x + 1) + " year loan will be $" + (int) (dollars * 100 + 0.5) / 100.0);
        }
        System.out.println("Worth of tuition is " + (int) ((dollars - 10_000) * 100) / 100.0);
    }
}
