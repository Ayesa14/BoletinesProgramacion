package boletin6_2;

public class Satelite {
    private double meridiano, paralelo, distanciaTerra;
    
    public Satelite(){
        meridiano = 0;
        paralelo = 0;
        distanciaTerra= 0;
        //meridiano = paralelo = distanciaTerra = 0->coge los valores de derecha a izq
    }
    
    public Satelite (double m, double p, double d){
        meridiano = m;
        paralelo = p;
        distanciaTerra = d;
        
    }
    public void verPosicion() {
        System.out.println("o satelite atopase no paralelo "+paralelo+" meridiano "+meridiano+" a unha distancia da terra "+distanciaTerra);
    }
}

