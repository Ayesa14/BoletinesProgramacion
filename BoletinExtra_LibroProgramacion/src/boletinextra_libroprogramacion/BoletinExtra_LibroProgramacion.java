/*
Escribir un programa que calcule el dinero recaudado en un concierto. La aplicacion solicitará el aforo máximo del local, el precio por entrada(suponemos 
que todas las entradas tienen el mismo precio) y el número de entradas vendidas. 
Hay que tener en cuenta que si el número de entradas vendidas no supera el 20% del aforo del local, se cancela el concierto.
Si el número de entradas vendidas no supèra el 50% del aforo del local, se realiza una rebaja del 25% del precio de la entrada.
 */
package boletinextra_libroprogramacion;

public class BoletinExtra_LibroProgramacion {

    
    public static void main(String[] args) {
        Entradas obj = new Entradas();
        
        obj.venderEntradas();
    }
    
}
