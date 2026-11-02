import java.util.Scanner;
public class Main {
    public static int calcularMinutos(int porcentajeInicial) {
        int minutos = 0;
        int bateria = porcentajeInicial;

        while (bateria < 100) {
            bateria = bateria + 8;
            minutos++;
        }
        return minutos;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int porcentaje;
        int minutos;
        int opcion = 1;

        while (opcion != 0) {
            System.out.print("Ingresa el porcentaje inicial de bateria: ");
            porcentaje = teclado.nextInt();

            if (porcentaje >= 0 && porcentaje <= 100) {
                minutos = calcularMinutos(porcentaje);

                System.out.println("Bateria inicial: " + porcentaje + "%");
                System.out.println("Minutos necesarios para completar la carga: " + minutos);

            } else {

                System.out.println("Error: El porcentaje debe estar entre 0 y 100.");

            }

            System.out.println("\n¿Deseas realizar otra simulacion?");
            System.out.println("1. Si");
            System.out.println("0. No");
            System.out.print("Selecciona una opcion: ");
            opcion = teclado.nextInt();
        }
    }
}
