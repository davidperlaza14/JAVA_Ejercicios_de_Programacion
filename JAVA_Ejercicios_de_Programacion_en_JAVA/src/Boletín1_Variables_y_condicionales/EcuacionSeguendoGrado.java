package Boletín1_Variables_y_condicionales;

import java.util.Scanner;

/**
 * Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen,
 * debe indicarlo.
 */
public class EcuacionSeguendoGrado {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        Double a,b,c; // coeficientes ax^2+bx+c=0
        Double x1,x2,d; // soluciones y determinante

        System.out.print("Introduzca primer coeficiente (a): ");
        a = Entrada.nextDouble();
        System.out.print("Introduzca segundo coeficiente (b): ");
        b = Entrada.nextDouble();
        System.out.print("Introduzca tercer coeficiente (c): ");
        c = Entrada.nextDouble();

        // calculamos el determinante
        d=((b*b)-4*a*c);
        if(d<0){
            System.out.println("No existen  reales");        }
        else {
            // queda confirmar que a sea distinto de 0.
            // si a=0 nos encontramos una división por cero.
            x1 = (-b+Math.sqrt(d))/(2*a);
            x2= (-b-Math.sqrt(d))/(2*a);
            System.out.println("Solucion: " + x1);
            System.out.println("Solucion: " + x2);
        }
    }
}
