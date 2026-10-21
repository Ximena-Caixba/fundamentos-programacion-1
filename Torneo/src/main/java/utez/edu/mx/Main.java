package utez.edu.mx;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double puntos;
    double acumulado=0;
    double promedio;
    int mas=0;
    int menos=0;

    for (int i=1; i<=7; i++){
        System.out.println("Ingresa puntuación de la partida "+i+" :");
        puntos=teclado.nextDouble();
        acumulado=acumulado + puntos;

        if (puntos > 1000){
            mas++;
        }else{
            menos++;
        }

    }

    promedio=acumulado/7;
    System.out.println("Puntos acumulados: " + acumulado);
        System.out.println("Promedio de puntuación: " + promedio);
        System.out.println("Promedio de puntuación: " + promedio);
        System.out.println("Partidas con mas de 1000 puntos: " + mas);
        System.out.println("Partidas con menos de 1000 puntos: " + menos);





    }
}