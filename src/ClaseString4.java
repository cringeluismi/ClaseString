import java.util.Arrays;
import java.util.Scanner;

public class ClaseString4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contA=0, contE=0, contI=0, contO=0, contU =0;

        String frase = sc.nextLine();
        char fraseChar[] = (frase.toUpperCase()).toCharArray();

        for (int i = 0; i < fraseChar.length; i++) {
            if (fraseChar[i] == 'A') {
                contA++;
            }
            if (fraseChar[i] == 'E') {
                contE++;
            }
            if (fraseChar[i] == 'I') {
                contI++;
            }
            if (fraseChar[i] == 'O') {
                contO++;
            }
            if (fraseChar[i] == 'U') {
                contU++;
            }

        }

        System.out.println("Letras A: " + contA);
        System.out.println("Letras E: " + contE);
        System.out.println("Letras I: " + contI);
        System.out.println("Letras O: " + contO);
        System.out.println("Letras U: " + contU);

    }
}
