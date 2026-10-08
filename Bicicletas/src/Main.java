import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Bicicleta urbana: $40 por hora");
        System.out.println("2. Bicicleta de montaña: $60 por hora");
        System.out.println("3. Bicicleta eléctrica: $90 por hora");
        System.out.print("Selecciona opción: ");
        int opc = teclado.nextInt();

        if (opc >= 1 && opc <= 3) {

            System.out.print("Ingresa las horas de renta: ");
            int horas = teclado.nextInt();

            if (horas > 0) {

                System.out.println("¿Cuentas con membresia?");
                System.out.println("1. Sí");
                System.out.println("2. No");
                System.out.print("Selecciona opción: ");
                int tieneMembresia = teclado.nextInt();

                double subtotal = 0;
                String tipoBici = "";

                switch (opc) {
                    case 1:
                        subtotal = 40 * horas;
                        tipoBici = "Bicicleta urbana";
                        break;
                    case 2:
                        subtotal = 60 * horas;
                        tipoBici = "Bicicleta de montaña";
                        break;
                    case 3:
                        subtotal = 90 * horas;
                        tipoBici = "Bicicleta eléctrica";
                        break;
                }

                double pagofinal = subtotal;

                if (tieneMembresia == 1) {
                    pagofinal = subtotal * 0.80;
                    System.out.println("Descuento 20%");
                } else {
                    System.out.println("Sin descuento");
                }

                System.out.println("Tipo de bicicleta: " + tipoBici);
                System.out.println("Subtotal: $" + subtotal);
                System.out.println("Total a pagar: $" + pagofinal);

            } else {
                System.out.println("Las horas deben ser mayores que cero");
            }

        } else {
            System.out.println("Opción no válida");
        }
    }
}
