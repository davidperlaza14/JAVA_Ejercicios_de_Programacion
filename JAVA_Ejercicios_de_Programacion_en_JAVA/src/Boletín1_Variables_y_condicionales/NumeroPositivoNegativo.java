package Boletín1_Variables_y_condicionales;

import java.util.Scanner;

/**
 * 5. Pedir un número e indicar si es positivo o negativo.
 */
public class NumeroPositivoNegativo {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int num;

        System.out.print("Introduce un numero: ");
        num = Entrada.nextInt();

        if(num < 0)
            System.out.println("Negativo");
        else
            // suponemos que el 0 es positivo.
            System.out.println("Positivo");
    }
}
