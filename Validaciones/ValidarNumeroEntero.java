import java.util.Scanner;

public class ValidarNumeroEntero {
    public static void main(String[] args) {
        int numero = pedirNumeroEntero();
        System.out.println("El número ingresado es: " + numero);
    }

    public static int pedirNumeroEntero() {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número entero: ");
            while (!scanner.hasNextInt()) {  // Verifica si la entrada no es un número entero válido
                System.out.print("Entrada inválida.\nIngrese un número entero válido: ");
                scanner.next();  // Descarta la entrada no válida
            }
            numero = scanner.nextInt();  // Asigna el número entero válido a la variable "numero"
        } while (numero < 0);  // Continúa solicitando un número hasta que sea mayor o igual a cero

        return numero;
    }
}
