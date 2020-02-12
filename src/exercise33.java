public class exercise33 {
    public static void main(String[] args) {
        System.out.println("Perfect numbers less than 10 000:");

        for (int k = 1; k < 10_000; k++) {
            int sum = 0;
            for (int j = 1; j < k; j++) {
                if (k % j == 0)
                    sum += j;
            }

            if (sum == k)
                System.out.print(k + " ");
        }
    }
}
