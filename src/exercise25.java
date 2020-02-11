public class exercise25 {
    public static void main(String[] args) {
        double pi = 0;

        for (int i = 1; i <= 1_000_000; i++) {
            if (i % 2 == 0)
                pi -= 1.0 / (2 * i - 1);
            else
                pi += 1.0 / (2 * i - 1);
        }
        pi *= 4;

        System.out.println("PI = " + pi);
    }
}
