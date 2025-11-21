package temperatura;

/**
 *
 * @author edgar
 */
public class Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*crea un programa donde, cheque lo siguiente estableciendo una temperatura 
       por ejemplo 40 o 50 o 10 o 0:
       SI la temperatura es mayor a 30 grados diga caliente,
       PERO SI esta en el rango de 15 y 29 grados diga ta chilo pa ir a la playa pai
       
       PERO SI NO cumple con ninguna de las dos que diga: ta frio patron
       //< menor    
       //>mayor
         */
        double temperatura = 25.7;

        if (temperatura >= 30) {
            System.out.println("ta hot");
        } else if (temperatura >= 15 && temperatura <= 29) {
            System.out.println("ta chilo pa ir a la playa pai");
        } else {
            System.out.println("ta frio patron");
        }

    }

}
