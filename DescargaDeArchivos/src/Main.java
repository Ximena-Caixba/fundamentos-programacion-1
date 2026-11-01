import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa el tamaño del archivo en MB:");
        double tamaño = teclado.nextDouble();

        if (tamaño >= 0) {
            System.out.println("Ingresa la velocidad de descarga en MB por segundo:");
            double velocidad = teclado.nextDouble();

            if (velocidad > 0) {
                double tiempo = calcularTiempo(tamaño, velocidad);
                System.out.println("Tamaño del archivo: " + tamaño + " MB");
                System.out.println("Velocidad de descarga: " + velocidad + " MB/s");
                System.out.println("Tiempo estimado de descarga: " + tiempo + " segundos");

            } else {
                System.out.println("Ingresa números positivos");
            }
        } else {
            System.out.println("Ingresa números positivos.");
        }

    }
    static double calcularTiempo(double tamaño, double velocidad) {
        double tiempo = tamaño / velocidad;
        return tiempo;
    }
}
