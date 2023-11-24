import java.util.Scanner;

public class CifradoCesar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Frase:");
        String userInput = sc.nextLine().toUpperCase().replace(" ","");
        char sinCifrado[] = userInput.toCharArray();
        System.out.println(sinCifrado);

        System.out.println("Clave:");
        int clave = sc.nextInt();

        for (int i = 0; i < sinCifrado.length; i++) {
            sinCifrado[i] += clave;
            if (sinCifrado[i] > 90) {
                sinCifrado[i] -= 26;
            }
            if (sinCifrado[i] < 65) {
                sinCifrado[i] += 26;
            }
        }

        System.out.println(sinCifrado);
        
    }
}
