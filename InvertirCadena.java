import java.util.Scanner;

public class InvertirCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String texto = sc.nextLine();

        String invertida = new StringBuilder(texto).reverse().toString();

        System.out.println("Cadena invertida: " + invertida);

        sc.close();
    }
}