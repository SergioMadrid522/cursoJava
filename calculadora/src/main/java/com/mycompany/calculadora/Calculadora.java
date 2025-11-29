package com.mycompany.calculadora;

import java.util.Scanner; //scanner: metodo a una funcion 

public class Calculadora {

    public static void main(String[] args) {
        int op;
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        /*mandarlo a llamar al scanner 
            al programa y crear objeto*/
        System.out.println("Elija la opciona a hacer:\n"
                + "1.suma\n2. resta\n3. multiplicacion\n4. division");
        op = sc.nextInt();//para leer datos en consola(enteros:int)
        switch (op) {
            case 1:
                System.out.println("numeros a sumar");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("resultado:" + (a + b));
                break;
            case 2:
                System.out.println("numeros a restar");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("resultado:" + (a - b));
                break;
            case 3:
                System.out.println("numeros a multiplicar");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("resultado:" + (a * b));
                break;
            case 4:
                System.out.println("numeros a dividir");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("resultado:" + (a / b));
                break;
            default:
                System.out.println("un numero pendejo ._.");
                break;
        }
    }
}
