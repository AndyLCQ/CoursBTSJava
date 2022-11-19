/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exo35;

/**
 *
 * @author eleveIRIS1
 */
public class Appreciation
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int note=10;
        
        switch(note)
        {
            case 0:
            case 1:
            case 2:System.out.println("Très insuffisant ! "); break;
            case 3:  
            case 4:
                System.out.println("Insuffisant !"); break;
            case 5:
            case 6:
                System.out.println("Moyen."); break;
            case 7:
            case 8:
                System.out.println("Bien !"); break;
            case 9:
            case 10:
                System.out.println("Très bien !");break;
            default: 
                System.out.println("Erreur de note !");
                
                    
                
        }
    }
}
