
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa tarifa por hora");
        double tarifa = teclado.nextDouble();

        if (tarifa > 0) {
            System.out.println("Ingresa cantidad de horas de uso: ");
            int horas = teclado.nextInt();

            if (horas > 0) {
                double total = calcularRenta(tarifa, horas);
                mostrarComprobante(total);
            } else {
                System.out.println("Ingresa números positivos");
            }

        } else {
            System.out.println("Ingresa números positivos");
        }
    }

    static double calcularRenta(double tarifa, int horas) {
        double total = tarifa * horas;
        return total;
    }

    static void mostrarComprobante(double total) {
        System.out.println("Total: " + total);
    }
}
