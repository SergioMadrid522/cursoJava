
package genero;

/**
 *
 * @author edgar
 */
public class Genero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*estableciendo una 
       variable ya sea F o M checar si es masculino o 
       femenino pero si no es ninguno de los dos que diga eres puto o q 
         */
        char persona = 'h';

        if (persona == 'F') {
            System.out.println("femenino");
        } else if (persona == 'M' || persona == 'H' || persona == 'h') {
            System.out.println("masculino");
        } else {
            System.out.println("eres puto o que");
        }
    }
    
}
