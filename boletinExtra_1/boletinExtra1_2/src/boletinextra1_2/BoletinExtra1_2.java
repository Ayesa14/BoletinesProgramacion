/* Dado o seguinte polinomio de de segundo grao :
Y = a X² + bX + c 
Crea un programa que pida os coeficientes a, b, c , e o valor de x e calcule o 
valor de Y */
package boletinextra1_2;

import java.util.Scanner;

public class BoletinExtra1_2 {

    public static void main(String[] args) {
        double a, b, c, X, Y;
        
        System.out.println("Introduce el coeficiente de a: ");
        Scanner objPolinom = new Scanner(System.in);
        a = objPolinom.nextDouble();
    
        System.out.println("Introduce el coeficiente de b: ");
        b = objPolinom.nextDouble();
        
        System.out.println("Introduce el coeficiente de c: ");
        c = objPolinom.nextDouble();
        
        System.out.println("Introduce el coeficiente de x: ");
        X = objPolinom.nextDouble();
        
        Y = a * Math.pow(X, 2) + b*X + c; 
        
        System.out.println("El resultado del polinomio de segundo grado es: "+Y);
       
    }
    
}
