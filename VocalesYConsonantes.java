import java.util.Scanner;

public class VocalesYConsonantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra en minúsculas: ");
        String palabra = sc.next();

        int vocales = 0, consonantes = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if ("aeiou".indexOf(c) != -1) {
                vocales++;
            } else {
                consonantes++;
            }
        }

        System.out.println("Número de vocales: " + vocales);
        System.out.println("Número de consonantes: " + consonantes);

        sc.close();
    }
}