import java.util.Scanner;

public class ArbolMatrizInv {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Altura:");
        int h = sc.nextInt();

        for (int i = h; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
