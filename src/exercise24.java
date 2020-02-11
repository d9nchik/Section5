public class exercise24 {
    public static void main(String[] args) {
        int up = 1;
        double sum = 0;
        for (int down = 3; down < 100; down++) {
            sum += (double) up / down;
        }

        System.out.println("The result will be " + sum);
    }
}
