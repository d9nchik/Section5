public class exercise43 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <=7; i++) {
            for (int k = i; k <= 7; k++) {
                if (k==i)
                    continue;
                System.out.println(i + " " + k);
                counter++;
            }
        }

        System.out.println("The total number of all combinations is " + counter);
    }
}
