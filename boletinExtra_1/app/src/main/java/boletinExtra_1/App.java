/*Un economista hace un programa que realice cálculos con IVA. La aplicación 
debe solicitar la base imponible y el IVA que se debe aplicar. Muestra por 
pantalla el importe correspondiente, el IVA y el total.*/
 
package boletinExtra_1;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        double baseImponible, iva, total;
        
        System.out.println("Introduce la base imponible: ");
        Scanner objBase = new Scanner(System.in);
        baseImponible = objBase.nextDouble();
        
        System.out.println("Introduce el IVA a aplicar: ");
        iva = objBase.nextDouble();
         
       
        
        iva = (baseImponible * iva) / 100;
        total = baseImponible + iva;
        
        System.out.println("La cantidad total es: "+total+" euros , del cual el IVA es: "+iva+" euros y la base imponible: "+baseImponible+" euros");
    }
}
