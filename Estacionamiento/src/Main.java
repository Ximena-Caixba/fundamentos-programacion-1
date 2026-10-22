
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double costo;
        double totalRecaudado = 0;
        double promedio;
        int horas = -1;
        int automoviles = 0;
        int descuentos = 0;

        while (horas != 0) {
            System.out.println("Ingresa horas estacionado: ");
            horas = teclado.nextInt();

            if (horas == 0) {
                break;
            }if (horas < 0) {
                System.out.println("Las horas negativas no son validas.");
            } else {
                costo = horas * 15;

                if (horas > 5) {
                    costo = costo - 10;
                    descuentos++;
                    System.out.println("Descuento de $10 aplicado.");
                }

                System.out.println("El automovil debe pagar: $" + costo);

                automoviles++;
                totalRecaudado = totalRecaudado + costo;
            }
        }
        System.out.println("Automoviles atendidos: " + automoviles);
        System.out.println("Dinero recaudado: $" + totalRecaudado);
        System.out.println("Automoviles con descuento: " + descuentos);

        if (automoviles > 0) {
            promedio = totalRecaudado / automoviles;
            System.out.println("Promedio pagado: $" + promedio);
        } else {
            System.out.println("No se registraron automoviles.");
        }
    }
}
