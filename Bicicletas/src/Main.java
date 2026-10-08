import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Bicicleta urbana: $40 por hora");
        System.out.println("2. Bicicleta de montaña: $60 por hora");
        System.out.println("3. Bicicleta eléctrica: $90 por hora");
        System.out.println("Selecciona opción:");

        int opc = teclado.nextInt();

        System.out.println("Ingresa las horas de renta:");
        int horas = teclado.nextInt();

        System.out.println("¿Cuentas con membresía? (true/false)");
        boolean membresia = teclado.nextBoolean();

        double subtotal = 0;
        double descuento = 0;
        double total = 0;

        if (horas > 0) {

            switch (opc) {

                case 1:
                    subtotal = 40 * horas;
                    System.out.println("Tipo de bicicleta: Urbana");
                    break;

                case 2:
                    subtotal = 60 * horas;
                    System.out.println("Tipo de bicicleta: Montaña");
                    break;

                case 3:
                    subtotal = 90 * horas;
                    System.out.println("Tipo de bicicleta: Eléctrica");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

            if (opc >= 1 && opc <= 3) {

                if (membresia) {
                    descuento = subtotal * 0.20;
                }

                total = subtotal - descuento;

                System.out.println("Subtotal: $" + subtotal);
                System.out.println("Descuento: $" + descuento);
                System.out.println("Total a pagar: $" + total);
            }

        } else {
            System.out.println("La cantidad de horas debe ser mayor que cero.");
        }

    }
}