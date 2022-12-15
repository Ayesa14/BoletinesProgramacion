package com.aye.bol13;

import com.aye.personal.Personal;

/**
 *
 * @author marcosfa
 */
public class Aplicacion {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Personal alum = new Personal("627773849","marcosf.a@icloud.com");
        Academica ac1 = new Academica ("Luciano Melano",9.5,alum);
        
        System.out.println( alum.toString());
        System.out.println(ac1.toString());
        System.out.println("nombre: " + ac1.getNome());
    }
}