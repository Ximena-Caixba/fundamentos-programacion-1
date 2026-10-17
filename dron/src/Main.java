import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
   Scanner teclado = new Scanner(System.in);

   int bateria;
   int minuto=1;

   System.out.println("Ingresa porcentaje de bateria: ");
   bateria = teclado.nextInt();

   while (bateria >= 7){
       bateria = bateria - 7;

       System.out.println("Minuto " + minuto + " -> "
               + bateria + "%");
       minuto++;
   }
   System.out.println("El dron ya no puede volar por baja bateria");
    }
}