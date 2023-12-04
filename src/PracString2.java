import java.util.Scanner;

public class PracString2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String fraseUsuario = sc.nextLine();
        char charArray[] = new char[fraseUsuario.length()];

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[0] != ' ' || charArray[i+1] != ' ') {
                charArray[i] == charArray[i].toUpperCase();
            }
        }

    }
}
