public class exercise40 {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;

        for (int k = 0; k < 2_000_000; k++) {
            if ((int) (Math.random() * 2) == 1)
                heads++;
            else
                tails++;
        }

        System.out.println("Heads - " + heads + ", tails - " + tails);
    }
}
