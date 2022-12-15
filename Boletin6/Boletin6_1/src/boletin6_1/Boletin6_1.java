package boletin6_1;

import java.util.Scanner;

public class Boletin6_1 {

   
    public static void main(String[] args) {
        Scanner coche = new Scanner(System.in);
        int velocidade, valor, menos;
        
    //instanciamos objeto coche sin parámetros 
    Coche coche1 = new Coche();    
   
    coche1.setVelocidade(500);
    
    System.out.println("Ingrese el valor de aceleración: ");
    valor = coche.nextInt();
    coche1.acelerar(valor);
    
    System.out.println("Ingrese el valor de frenado: ");
    menos = coche.nextInt();
    coche1.frenar(menos);
    }
    
   
}
