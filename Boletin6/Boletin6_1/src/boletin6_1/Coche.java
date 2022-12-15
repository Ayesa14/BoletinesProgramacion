package boletin6_1;

public class Coche {
    //declaro atributos
    private int velocidade;
    
    public Coche(){
        velocidade = 0;
    }
    
    //métodos
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    public int getVelocidade(){
        return velocidade;
    }
   
    public void acelerar (int valor){
        velocidade += (int) valor;
        System.out.println("La velocidad tras la aceleración es: " + velocidade);
    }
    
    public void frenar (int menos){
        velocidade -= (int) menos;
        System.out.println("La velocidad tras el frenado es: " + velocidade);
    }
   
}
