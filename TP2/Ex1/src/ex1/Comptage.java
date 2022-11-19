/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.Scanner;

/**
 *
 * @author eleveIRIS1
 */
public class Comptage
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        char lettre;
        int nba=0, nbe=0, nbi=0, nbo=0, nbu=0, nby=0;
        /*Saisie clavier*/
        Scanner clavier=new Scanner(System.in);
        System.out.println("Entrer votre texte : ");
        String texte=clavier.nextLine();
        
        texte=texte.toLowerCase();
        for (int i = 0; i < texte.length(); i++)
        {
            lettre=texte.charAt(i);    
            
            switch(lettre)
            {
                case 'a':
                    nba++;break;
                case 'e':
                    nbe++;break;
                case 'i':
                    nbi++;break;
                case 'o':
                    nbo++;break;
                case 'u':
                    nbu++;break;
                case 'y':
                    nby++;break;
                    
                   
            }
        }
        System.out.println(nba+" fois la lettre a");
        System.out.println(nbe+" fois la lettre e");
        System.out.println(nbi+" fois la lettre i");
        System.out.println(nbo+" fois la lettre o");
        System.out.println(nbu+" fois la lettre u");
        System.out.println(nby+" fois la lettre y");
        
        
        
        
    }
}
