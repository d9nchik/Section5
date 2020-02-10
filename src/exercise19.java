public class exercise19 {
    public static void main(String[] args) {
        for (int i = 0; i<8; i++){
            for (int k =7-i;k>0; k--)
                System.out.print("      ");
            for (int j =0; j<i+1;j++)
                System.out.printf("%6d", (int)Math.pow(3, j));

            for (int l =i; l>0;l--){
                System.out.printf("%6d", (int)Math.pow(3, l));
            }
            System.out.print("\n");
        }
    }
}
