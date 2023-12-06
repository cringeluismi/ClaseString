import java.util.Scanner;

public class PracString4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Frase: ");
        String fraseUsuario = sc.nextLine();
        System.out.print("Número de veces movido a la derecha: ");
        int numVeces = sc.nextInt();

        System.out.println( "\"" + fraseUsuario + "\" movido " + numVeces + " veces:");

        for (int i = 0; i < numVeces; i++) {
            // Obtener el último caracter de la cadena
            char ultimoCaracter = fraseUsuario.charAt(fraseUsuario.length() - 1);

            // Construir una nueva cadena desplazando el último caracter al principio
            fraseUsuario = ultimoCaracter + fraseUsuario.substring(0, fraseUsuario.length() - 1);
        }

        System.out.println(fraseUsuario);

    }
}
