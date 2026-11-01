
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc = 1;

        while (opc != 0) {

            System.out.println("Bienvenido al Envio de Paquetes");
            System.out.println("Requisitos ");

            System.out.println("Ingresa número de guía: ");
            int num = teclado.nextInt();

            teclado.nextLine();

            System.out.println("Ingresa Destino: ");
            String destino = teclado.nextLine();

            System.out.println("Ingresa peso del paquete en KG: ");
            double peso = teclado.nextDouble();

            mostrarEtiqueta(num, destino, peso);

            System.out.println("Salir presione 0");
            System.out.println("Continuar presione 1");
            opc = teclado.nextInt();

        }


    }

    static void mostrarEtiqueta(int num, String destino, double peso) {

        System.out.println("Número de guía: " + num);
        System.out.println("Destino: " + destino);
        System.out.println("Peso: " + peso);

    }
}
