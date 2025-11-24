package primerospasos; //paquete
import java.util.Scanner; // Buena practica, importar solo lo que ocuparemos
import java.util.*;


public class PrimerosPasos {
    /*
    class = clase
    tipos:
        public = publica
        private = privada
        protected = protegida/restringida
     */
    public static void main(String[] args) {
        /*  
        tipos de datos
            int    = entero
            double = valores con decimal (generalmente se usa este)
            float  = valores con decimal 
            char   = caracter
            String = cadena de texto
            boolean (true / false) = estado (verdadero / falso)
         */
        // declaracion de variables
        int dedos = 5;
        char sexo = 'M'; // Masculino
        // imprimir en consola
        System.out.println("Hello world");
        System.out.println(dedos);
        System.out.println(sexo + "asculino");
        
        /*int manos;
        
        
        
        System.out.println("tenemos " + manos + " manos");
        sc.close();*/
        Scanner sc = new Scanner(System.in); //Mandar a llamar el método scanner y crear objeto(variable)
        System.out.println("Elija a opcion a hacer:"
                + "\n1. suma\n2. resta\n3. multiplicacion\n4. division"); // El \n sirve para dar un salto de linea (un enter
        
        System.out.println("\n\n\ncuantos manos tenemos?");
        int manos = sc.nextInt();
        
        switch(manos) {
            case 1:
                System.out.println("tenemos " + manos + " eres amorfo");
                break;
            case 2:
                System.out.println("persona normal");
            default:
                System.out.println("que pedo we q eres?");
        }
    }
}
