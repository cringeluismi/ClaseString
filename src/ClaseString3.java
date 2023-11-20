import java.util.Arrays;
import java.util.Scanner;

public class ClaseString3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre = sc.nextLine();
        String apellido1 = sc.nextLine();
        String apellido2 = sc.nextLine();

        String username = nombre.substring(0,3) + apellido1.substring(0,3) + apellido2.substring(0,3);

        System.out.println(username.toUpperCase());



    }
}
