/*  Codifica un programa que, pida os valores de a,b,c , e resolva unha ecuación
de segundo grao */
package boletinextra1_3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class BoletinExtra1_3 {

    public static void main(String[] args) {
        double a , b, c, x, xMenos;
        
        System.out.println("Introduce el valor de a: ");
        Scanner objEcuacion = new Scanner(System.in);
        a = objEcuacion.nextDouble();
        
        System.out.println("Introduce el valor de b: ");
        b = objEcuacion.nextDouble();
        
        System.out.println("Introduce el valor de c: ");
        c = objEcuacion.nextDouble();
        
        x = ((-b) + Math.sqrt(Math.pow(b, 2) - (4* a * c))) / (2 * a);
        xMenos = ((-b) - Math.sqrt(Math.pow(b, 2) - (4* a * c))) / (2 * a);
        
        DecimalFormat df = new DecimalFormat();
        System.out.println("El primer valor de x es: "+df.format(x));
        System.out.println("El segundo valor de x es: "+df.format(xMenos));
    }
    
}
