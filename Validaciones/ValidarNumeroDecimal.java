import java.util.Scanner;

public class ValidarNumeroDecimal {
    public static void main(String[] args) {
        double numero = pedirNumeroDecimal();
        System.out.println("El número ingresado es: " + numero);
    }

    public static double pedirNumeroDecimal() {
        Scanner scanner = new Scanner(System.in);
        double numero;

        do {
            System.out.print("Ingrese un número decimal: ");
            while (!scanner.hasNextDouble()) {  // Verifica si la entrada no es un número decimal válido
                System.out.print("Entrada inválida.\nIngrese un número decimal válido: ");
                scanner.next();  // Descarta la entrada no válida
            }
            numero = scanner.nextDouble();  // Asigna el número decimal válido a la variable "numero"
        } while (numero < 0);  // Continúa solicitando un número hasta que sea mayor o igual a cero

        return numero;
    }
}
