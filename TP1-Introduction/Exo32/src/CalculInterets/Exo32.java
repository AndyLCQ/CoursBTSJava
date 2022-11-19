/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculInterets;

/**
 *
 * @author eleveIRIS1
 */
public class Exo32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float sommeArgent=10000;
        int annee=1;
        float interet=1.045f;
        
        for (int i = 0; i < annee; i++) {
            sommeArgent=interet*sommeArgent;
            
        }
        System.out.println("Dans "+annee+" ans tu auras "+sommeArgent+" F");
       
    }
}
