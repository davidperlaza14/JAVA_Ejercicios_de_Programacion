package Boletín1_Variables_y_condicionales;

import java.util.Scanner;

/**
 * Pedir el radio de un círculo y calcular su área. A=PI*r^2.
 */
public class RadioCirculoArea {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        double a,r; // area y radio

        System.out.print("Introduce el radio de un circulo:");
        r = Entrada.nextInt();

        a = Math.PI*(r*r); // para elevar al cuadrado otra opción es: Math.pow (r, 2)
        System.out.println("El area de una circunferencia de radio " + r + " es: " + a);



    }
}
