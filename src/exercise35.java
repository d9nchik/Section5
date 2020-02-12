public class exercise35 {
    public static void main(String[] args) {
        double sum = 0;

        for (int k = 999; k > 0; k--) {
            sum += 1.0 / (Math.sqrt(k + 1) + Math.sqrt(k));
        }

        System.out.println("Sum = " + sum);
    }
}
