package UTEZ.EDU.MX;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Piso 1" +
                "Piso 2" +
                "Piso 3" +
                "Piso 4" +
                "Piso 5" +
                "Piso 6" +
                "Piso 7" +
                "piso 8" +
                "piso 9" +
                "piso 10");


        System.out.println("En que piso estas? ");
        int pisoactual = teclado.nextInt();

        System.out.println("A que piso deseas ir? ");
        int pisodestino = teclado.nextInt();

        if (pisoactual <= 0 || pisodestino <= 0) {
            System.out.println("no se admite 0");
        } else if (pisoactual == pisodestino) {
            System.out.println("No se admite el mismo piso");
        } else {
            if (pisoactual > pisodestino) {
                while (pisodestino <= pisoactual) {
                    System.out.println("" + pisoactual);
                    pisoactual--;
                }
            } else {
                while (pisodestino >= pisoactual) {
                    System.out.println("" + pisoactual);
                    pisoactual++;
                }
            }
        }
    }
}