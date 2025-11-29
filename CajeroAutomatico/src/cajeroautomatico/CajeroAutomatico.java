package cajeroautomatico;
import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner res = new Scanner(System.in);
        
        double mount;
        String response;
        
        System.out.println("Bienvenido, que desea hacer?");
        System.out.println("1. Retirar dinero\n2. Retirar con tarjeta");
        int option = sc.nextInt();
        
        switch(option){
            case 1:
                    System.out.print("Coloque el numero de tarjeta: ");
                    int cardNumber = sc.nextInt();
                    System.out.println("Retirardo efectivo...");
                    System.out.print("Desea imprimir el comprobante (si | no)? ");
                    response = res.nextLine();
                    
                    if(response.toLowerCase().equals("si")){
                        System.out.println("No olvide recoger su comprobante," +
                                " que tenga un buen dia");
                    } else {
                        System.out.println("Ten un buen dia");
                    }
                break;
            case 2:
                System.out.print("Ingrese la tarjeta en el cajero " +
                        "(monto de la tarjeta): ");
                double card = sc.nextDouble();
                System.out.print("Cuanto dinero desea retirar? ");
                mount = sc.nextDouble();
                if(mount > card) {
                    System.out.println("El monto a retirar no debe de ser mayor" + 
                            " al monto de la tarjeta.");
                } else {
                    System.out.println("\nEl monto a retirar es de $" + (mount));
                    System.out.print("Esta seguro que desea retirar esta cantidad (si | no)? ");
                    response = res.nextLine();
                    
                    if(response.toLowerCase().equals("si")){
                        System.out.println("\nMonto nuevo disponible $" + (card - mount));
                        System.out.println("No olvide recojer su dinero," +
                                " que tenga un buen dia");
                    } else {
                        System.out.println("Se ha cancelado con exito");
                    } 
                }
                break;
        }
    }
}
