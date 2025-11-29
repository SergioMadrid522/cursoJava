package listas;

import java.util.Scanner;

public class Listas {

    public static void main(String[] args) { 
        /*array = variable que almacena muchos objetos*/
        
        String[] nombres = {
            //  0       1         2
            "fabian", "pepe", "aguilar", 
            // 3          4       5      6
            "lusiano", "tito", "doble", "p"
        };
        
        System.out.println(nombres[3]); //imprime posicion
        System.out.println(nombres.length); // imprime longitud
        
        int i = 0;
        while(i <= nombres.length - 1){
            System.out.println(nombres[i]);
            i++;
        }
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.print("mete tu nombre:");
        nombre = sc.nextLine();
        System.out.println("tu nombre es: "+ nombre.trim() + ", hola");
        
        
        
    }
}
