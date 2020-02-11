public class exercise26 {
    public static void main(String[] args) {
        double e = 1;
        double item = 1;

        for (int k = 1; k <= 100_000; k++) {
            item /= k;
            e += item;
        }

        System.out.println("e = " + e);
    }
}
