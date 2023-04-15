import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalcularDiasEntreFechas {
    public static void main(String[] args) {
        LocalDate fechaInicial = LocalDate.of(2023, 1, 1);
        LocalDate fechaFinal = LocalDate.of(2023, 4, 5);
        long cantidadDias = ChronoUnit.DAYS.between(fechaInicial, fechaFinal);
        System.out.printf("La cantidad de dias entre %s y %s es: %d días", fechaInicial, fechaFinal, cantidadDias);
    }
}
