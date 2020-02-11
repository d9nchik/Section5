public class exercise23 {
    public static void main(String[] args) {
        int n = 50_000;

        double sum1 = 0;
        for (int k = n; k > 0; k--) {
            sum1 += 1.0 / k;
        }

        double sum2 = 0;

        for (int j = 1; j <= n; j++)
            sum2 += 1.0 / j;

        System.out.println("From right to left: " + sum1);
        System.out.println("From left to right: " + sum2);
    }
}
