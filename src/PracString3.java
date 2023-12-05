import java.util.Scanner;

public class PracString3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Frase: ");
        String fraseUsuario = sc.nextLine();
        System.out.print("Letra a sustituir: ");
        String primeraLetra = sc.nextLine();
        System.out.print("Letra que la va a sustituir: ");
        String segundaLetra = sc.nextLine();

        System.out.println(fraseUsuario.replace(primeraLetra,segundaLetra));

    }
}
