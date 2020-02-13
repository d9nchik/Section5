import java.util.Scanner;

public class exercise49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String data = input.nextLine();

        int vowel = 0;
        int consonants = 0;
        for (int k = 0; k < data.length(); k++) {
            char symbol = data.charAt(k);
            if (symbol == 'A' || symbol == 'E' || symbol == 'I' || symbol == 'O' || symbol == 'U' ||
                    symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                vowel++;
            } else if (symbol!=' ')
                consonants++;
        }

        System.out.println("The number of vowels is " + vowel);
        System.out.println("The number of consonants is " + consonants);
    }
}
