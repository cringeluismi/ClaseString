import java.util.Scanner;

public class PracString1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userInput = sc.nextLine().toUpperCase();
        char charArray[] = new char[userInput.length()];

        // Asignar valores
        for (int i = 0; i < charArray.length ; i++) {
            charArray[i] = userInput.charAt(i);
        }

        int contPalabras = 0, contVocales = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != ' ') {
                if (charArray[i] == 'A' || charArray[i] == 'E' || charArray[i] == 'I' || charArray[i] == 'O' || charArray[i] == 'U' && contVocales < 3) {
                    contVocales++;
                } else if (contVocales>=3){
                    contPalabras++;
                    contVocales = 0;
                }

            }

        }

        System.out.println(contPalabras);

    }
}