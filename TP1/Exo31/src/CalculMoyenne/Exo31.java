/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculMoyenne;

/**
 *
 * @author eleveIRIS1
 */
public class Exo31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float tab[]={5.5f,10.5f,15,19.5f};
        float moyenne=0, somme=0;
        
        for (int i = 0; i < tab.length; i++) {
            somme = tab[i]+somme;
            
        }
        moyenne=somme/tab.length;
        
        System.out.println("La moyenne est "+moyenne);
        
        
    }
}
