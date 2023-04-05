import java.util.Scanner;

public class CalcularDiasEntreFechas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la fecha inicial en formato dd/mm/aaaa: ");
        String fechaInicialStr = sc.nextLine();
        int diaInicial = Integer.parseInt(fechaInicialStr.substring(0, 2));
        int mesInicial = Integer.parseInt(fechaInicialStr.substring(3, 5));
        int anioInicial = Integer.parseInt(fechaInicialStr.substring(6, 10));

        System.out.print("Ingrese la fecha final en formato dd/mm/aaaa: ");
        String fechaFinalStr = sc.nextLine();
        int diaFinal = Integer.parseInt(fechaFinalStr.substring(0, 2));
        int mesFinal = Integer.parseInt(fechaFinalStr.substring(3, 5));
        int anioFinal = Integer.parseInt(fechaFinalStr.substring(6, 10));

        int cantidadDias = 0;
        // Calcular la cantidad de días entre las dos fechas
        while (diaInicial != diaFinal || mesInicial != mesFinal || anioInicial != anioFinal) {
            cantidadDias++;
            diaInicial++;
            if (diaInicial > diasEnMes(mesInicial, anioInicial)) {
                diaInicial = 1;
                mesInicial++;
                if (mesInicial > 12) {
                    mesInicial = 1;
                    anioInicial++;
                }
            }
        }

        System.out.printf("La cantidad de días entre %s y %s es: %d días", fechaInicialStr, fechaFinalStr, cantidadDias);
        
        sc.close();
    }

    // Método para obtener la cantidad de días en un mes y año dados
    private static int diasEnMes(int mes, int anio) {
        switch (mes) {
            case 2:
                return (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
}
