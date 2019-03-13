/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

/**
 *
 * @author fojomars
 */
public class Boletin17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gato miau = new Gato();
        Papagaio pepito = new Papagaio();
        Mamifero mon = new Mamifero();
        miau.nadar();
        miau.camiñar();
        pepito.camiñar();
        mon.camiñar();
    }
    
}
