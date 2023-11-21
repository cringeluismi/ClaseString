import java.util.Scanner;

public class ClaseString5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String fraseIni = sc.nextLine();
        String fraseLow = fraseIni.toLowerCase();
        String fraseReplace = fraseLow.replace(" ","");

        //Comprobar que la frase está en minúsculas y sin espacios
        System.out.println(fraseReplace);

        boolean palin = true;
        for (int i = 0; i < fraseReplace.length(); i++) {
            if (fraseReplace.charAt(i) != fraseReplace.charAt(fraseReplace.length()-i-1)) {
                palin = false;
            }
        }

        System.out.println(palin);


        //char fraseOriginal[] = fraseReplace.toCharArray();
        //char fraseCopia

    }
}
