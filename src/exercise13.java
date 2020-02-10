public class exercise13 {
    public static void main(String[] args) {
        int number = 1;

        while (number * number < 12_000) {
            number++;
        }
        number--;
        System.out.println("n = " + number);
    }
}
