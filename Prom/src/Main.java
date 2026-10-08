
import java.util.Scanner;

public class Prom{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el promedio del alumno: ");
        int promedio =teclado.nextInt();

        System.out.print("Ingresa el porcentaje de asistencia: ");
        int asistencia = teclado.nextInt();

        if (promedio < 7) {
            System.out.println("Reprobado por calificación");
        } else if (promedio >7 && asistencia < 80) {
            System.out.println("Reprobado por faltas");
        } else {
            System.out.println("Aprobado regular");
        }
    }
}