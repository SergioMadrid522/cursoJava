package com.mycompany.cajeroautomatico;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class CajeroAutomatico {

    public static void main(String[] args) {
        int dinero = 500;
        int op;

        Scanner sc = new Scanner(System.in);

        System.out.println("bienvenido, que de sea hacer?\n"
                + "1. retirar dinero sin tarjeta\n2. retirar con tarjeta");

        op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("$" + dinero);
                System.out.println("colocar 5-16 digitos de tarjeta");
                String opt = sc.next(); //"sc.next" lee una cadena de texto

                if (opt.length() < 5 || opt.length() > 16) {/*el ".length" es para el numero de caracteres permitidos*/
                    System.out.println("Número inválido. Debe tener entre 5 y 16 "
                            + "dígitos.");
                    break;
                }

                System.out.println("retirando efectivo...");
                System.out.println("no olvide retirar su efectivo");
                System.out.println("¿desea imprimir comprobante?(si/no)");
                String op2 = sc.next(); // Para leer codigo string es .nextLine()

                if (op2.equals("si")) {
                    System.out.println("recoja su recibo");
                } else if (op2.equals("no")) {
                    System.out.println("tenga un buen dia");
                }

                break;

            case 2:
                System.out.println("ingresar tarjeta");
                System.out.println("$" + dinero);
                System.out.println("cuanto dinero desea retirar:");
                op = sc.nextInt();

                if (op >= 1 && op <= 500) {
                    System.out.println("el monto a retirar es de: $" + op);
                } else {
                    System.out.println("se ha cancelado con éxito");
                }
                break;
        }

    }
}
