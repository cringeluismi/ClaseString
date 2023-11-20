public class ClaseString1 {
    public static void main(String[] args) {

        String frase = "Me llamo Luismi";
        String fraseDiv[] = frase.split(" ");

        for (int i = 0; i < fraseDiv.length; i++) {
            System.out.println(fraseDiv[i]);
        }

    }
}
