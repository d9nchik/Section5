public class exercise39 {
    public static void main(String[] args) {
        double money = 0;
        double salary = 0;

        while (salary < 30_000) {
            money += 0.5;

            if (money <= 5_000) {
                salary = money * 0.94;
            } else if (money <= 10_000) {
                salary = money - (5_000 * 0.06 + (money - 5_000) * 0.08);
            } else
                salary = money - (5_000 * 0.06 + 5_000 * 0.08 + (money - 10_000) * 0.1);
        }

        System.out.println("sales amount = " + money);
    }
}
