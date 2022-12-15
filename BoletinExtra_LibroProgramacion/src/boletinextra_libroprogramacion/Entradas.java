package boletinextra_libroprogramacion;

import javax.swing.JOptionPane;

public class Entradas {
    
    public void venderEntradas(){
     
        long aforo = Long.parseLong(JOptionPane.showInputDialog("Ingrese el aforo máximo"));
        float entradasPrecio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio de la entrada"));
        int entradasVendidas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de entradas vendidas"));
        
        if (entradasVendidas <= (0.2 * aforo)){
            System.out.println("Se cancela el concierto");
        }
        else if (entradasVendidas <= (0.5 * aforo)){
            entradasPrecio = (float) (entradasPrecio - 0.25 * entradasPrecio);
            System.out.println("Se realiza un 25% de descuento sobre el precio de la entrada. El nuevo precio por entrada es "+entradasPrecio);
        }    
        else {
            System.out.println("Que disfrute del concierto");
        }          
            
    }
}
            
         
         
         


         

         

