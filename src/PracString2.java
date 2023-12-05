import java.util.Scanner;

public class PracString2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String fraseUsuario = sc.nextLine();
        char[] charArray = new char[fraseUsuario.length()];

        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = fraseUsuario.charAt(i);
        }

        for (int i = 0; i < charArray.length; i++) {
            charArray[0] = Character.toUpperCase(charArray[i]);
            if (charArray[i] == ' ') {
                charArray[i+1] = Character.toUpperCase(charArray[i]);
                System.out.print(charArray[i]);
            }
        }

    }
}
