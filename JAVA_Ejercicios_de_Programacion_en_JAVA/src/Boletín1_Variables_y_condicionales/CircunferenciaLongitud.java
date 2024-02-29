package Boletín1_Variables_y_condicionales;

import java.util.Scanner;

/**
 * Pedir el radio de una circunferencia y calcular su longitud.
 */
public class CircunferenciaLongitud {

    public static void main(String[] args) {
        Scanner Enetrada = new Scanner(System.in);
        double l,r; // longitud y radio

        System.out.print("Introduce el radio de una circunferencia: ");
        r = Enetrada.nextDouble();

        l = 2*Math.PI*r;

        System.out.println("La longitud de una circunferencia de radio " + r + " es:" + l);
    }



}
