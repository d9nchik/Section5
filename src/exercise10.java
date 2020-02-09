public class exercise10 {
    public static void main(String[] args) {

        int counter = 0;

        for (int k=100; k<=1000; k++){
            if(k%12==0){
                counter++;
                if (counter!=10){
                    System.out.print(k+" ");
                }
                else {
                    counter=0;
                    System.out.println(k+"\n");
                }
            }
        }
    }
}
