package Boletín1_Variables_y_condicionales;

import java.util.Scanner;

/**
 * Pedir dos números y decir si son iguales o no.
 */
public class NumerosIguales {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int n1,n2;

        System.out.print("Introduce un numero: ");
        n1 = Entrada.nextInt();
        System.out.print("Introduce otro numero: ");
        n2 = Entrada.nextInt();

        if (n1 == n2)
            System.out.println("Son iguales");
        else
            System.out.println("No son iguales");
    }
}
