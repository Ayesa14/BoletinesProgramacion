 /*Programa que saque por pantalla a porcentaxe descontada nunha compra. 
   Introducindo, por teclado, o prezo da tarifa e o prezo pagado.*/
package Boletin3_1;
 
import java.util.Scanner;

public class App {
 

    public static void main(String[] args) {
        float tarifa, precio, desc;
        
        System.out.println("Introduce el precio de la tarifa inicial: ");
        Scanner objTarifa = new Scanner(System.in);
        tarifa = objTarifa.nextFloat();
        
        System.out.println("Introduce el precio pagado: ");
        Scanner objPrecio = new Scanner(System.in);
        precio = objPrecio.nextFloat();
        
        desc = 100 - ((precio * 100)/tarifa);
        System.out.println("El descuento realizado es: "+desc+"%");
        
        
        
        
    }
}
