package ciclos;

public class Ciclos {

    public static void main(String[] args) {
        /*Ciclo FOR*/
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 x " + i + "= " + (i * 2));
        }
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i);

        }
        
        /*Ciclo WHILE*/
        System.out.println("");
        int j = 1;
        while(j <= 10){
            System.out.println(j);
            j++;
        }
        System.out.println("Tabla de multiplicar con ciclo while");
        int k = 10;
        while(k >= 1){
            System.out.println("2x" + k + "= " + (2*k));
            k--;
        }
        /*Ciclo do-while*/
        System.out.println("Ciclo do-while");
        int l = 1;
        do {
            System.out.println(l);
            l++;
        }while(l <= 5);
    }
}
