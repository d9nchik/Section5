public class exercise15 {
    public static void main(String[] args) {
        for (char x = '!'; x<='~'; x++){
            if((x-'!'+1) %10!=0){
                System.out.print(x+ " ");
            }
            else
                System.out.println(x);
        }
    }
}
