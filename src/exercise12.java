public class exercise12 {
    public static void main(String[] args) {
        int n = 1;
        while (Math.pow(n, 3) <= 12_000) {
            n++;
        }

        System.out.println("n = " + n);
    }
}
