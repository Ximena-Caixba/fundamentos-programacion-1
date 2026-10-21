import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc = 0;
        int puntos = 100;

        do {
            System.out.println("Ingresa una opcion");
            System.out.println("1. Ganar 20 puntos");
            System.out.println("2. Gastar 15 puntos");
            System.out.println("3. Consultar puntos");
            System.out.println("4. Salir");
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Se te suman 20 puntos");
                    puntos += 20;
                    break;
                case 2:
                    if (puntos >= 15) {
                        System.out.println("Al gastar, se descuentan 15 puntos.");
                        puntos -= 15;
                    } else {
                        System.out.println("No puedes gastar, tienes menos de 15 puntos.");
                    }
                    break;
                case 3:
                    System.out.println("Tus puntos son: " + puntos);
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opc != 4);
        System.out.println("Puntos restantes: " + puntos);
    }
}





