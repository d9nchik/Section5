public class exercise18 {
    public static void main(String[] args) {
        System.out.println("Pattern A");
        for (int k=1; k<=6;k++){
            for (int i =0; i<k;i++)
                System.out.print("* ");
            System.out.print("\n");
        }

        System.out.println("Pattern B");
        for (int k=1; k<=6;k++){
            for (int i =6-k; i>=0;i--)
                System.out.print("* ");
            System.out.print("\n");
        }

        System.out.println("Pattern C");
        for (int k=1; k<=6;k++){
            for (int i =6-k; i>=0;i--)
                System.out.print("  ");
            for (int i =0; i<k;i++)
                System.out.print("* ");
            System.out.print("\n");
        }

        System.out.println("Pattern D");
        for (int k=1; k<=6;k++){
            for (int i =0; i<k;i++)
                System.out.print("  ");
            for (int i =6-k; i>=0;i--)
                System.out.print("* ");
            System.out.print("\n");
        }
    }
}
