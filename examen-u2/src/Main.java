import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int paquetes = 0;
        int costo=0;
        int rechazados=0;
        int fragil=0;
        int peso;
        int mayor=0;
        int actual=0;
        do{
            System.out.println("Ingresa peso del paquete en KG: ");
            peso = teclado.nextInt();
            if(peso==0) break;
            if (peso > 0) {
                paquetes = paquetes + 1;
            } else if (peso <= 0) {
                System.out.println("Ingrese peso positivo");
            } else {
                System.out.println("Datos no correctos");
            }

            System.out.println("Tipo de envio:" +
                    "  1.Local" +
                    "  2.Nacional" +
                    "  3.Expres");
            int opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    if (peso>0 && peso<=12) {
                        System.out.println("Aceptado");
                        costo=30 + 8 * peso;
                    }else{
                        rechazados++;
                    }
                    break;
                case 2:
                    if (peso>12 && peso<=20){
                        System.out.println("Aceptado");
                        costo=50 + 12 * peso;
                    }else{
                        rechazados++;
                    }
                    break;
                case 3:
                    if (peso>0 && peso<=5) {
                        System.out.println("Aceptado");
                        costo = 80 + 20 * peso;
                    }else{
                        rechazados++;
                    }
                    break;
                default:
                    System.out.println("Opcion no valida o paquete rechazado");
                    break;
            }
            actual=costo;
            if (actual>mayor){
                System.out.println("Importe mayor: "  +actual );
                mayor=actual;
            }

            System.out.println("El paquete es fragil?: " +
                    "1.Si" +
                    "2.No");
            int opc2=teclado.nextInt();

            switch (opc2){
                case 1:
                    System.out.println("Se cobra $25 más");
                    costo=costo+25;
                    fragil++;
                    break;

                case 2:
                    System.out.println("Costo queda igual");
                    break;

                default:
                    System.out.println("opcion no valida");
                    break;
            }

            System.out.println("-----------------------");
            System.out.println("Datos:" );
            System.out.println("Tipo de envio: " + opc);
            System.out.println("Peso: " + peso);
            System.out.println("Total: " + costo);

        }

        while (peso!=0);

        System.out.println("Total de paquetes aceptados: "+ paquetes);
        System.out.println("Total de paquetes rechazados: "+ rechazados);
        System.out.println("Total dinero recaudado: "+ costo);
        System.out.println("Mayor: "+ mayor);

    }
}
