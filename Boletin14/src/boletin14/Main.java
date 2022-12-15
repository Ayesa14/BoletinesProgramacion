package boletin14;
import com.aye.partes.Cpu;
import com.aye.partes.Monitor;
import com.aye.partes.Teclado;

public class Main {

    public static void main(String[] args) {
        
        
       Monitor objMo = new Monitor (12.2f);
     
       Ordenador objPc = new Ordenador (1890.5f, objMo, new Teclado ("Newskill"), new Cpu (480));
       
        System.out.println(objPc.toString());

        System.out.println("Precio = "+objPc.getPrecio());
       
        System.out.println("Marca = "+objPc.getTe());
       
        System.out.println("Velocidad = "+objPc.getPro());
        
       
       
       
      
       
        
        
       
    }
    
}
