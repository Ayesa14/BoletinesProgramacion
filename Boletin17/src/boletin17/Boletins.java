package boletin17;

import javax.swing.JOptionPane;

public class Boletins {
    
    private float nota;
    
    public float globalBoletins (){
        float porcentaje = Float.parseFloat(JOptionPane.showInputDialog("Introduce el porcentaje de boletines completados:\n(Solamente el número, sin el símbolo %)"));
        
        if (porcentaje>=90){
            nota=2f;
        }
        
            else if ((porcentaje>=70)&&(porcentaje<90)){
                nota=1f;
             }
             
                 else {
                    nota=0f;
                 }
    
    float notaGlobal = nota;
    return notaGlobal;
}
}