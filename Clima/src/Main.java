import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime la temperatura en grados C");
        int grados = teclado.nextInt();

        if (grados < 10){
            System.out.println("Frio extremo");

        } else if (grados > 10 && grados < 21) {
            System.out.println("Clima fresco");

        } else if (grados > 20 && grados < 30) {
            System.out.println("Clima agradable");

        }else if (grados > 30) {
            System.out.println("Calor extremo");

        }
    }
}