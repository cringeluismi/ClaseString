import java.util.Scanner;

public class PracString2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String fraseUsuario = sc.nextLine();
        String[] fraseDividida = fraseUsuario.split(" ");

        for (int i = 0; i < fraseDividida.length; i++) {
            char primeraLetra = Character.toUpperCase(fraseDividida[i].charAt(0));
            fraseDividida[i] = primeraLetra + fraseDividida[i].substring(1);
        }

        String fraseFinal = String.join(" ", fraseDividida);
        System.out.println(fraseFinal);

    }
}