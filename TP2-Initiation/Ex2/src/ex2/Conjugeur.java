/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.Scanner;

/**
 *
 * @author eleveIRIS1
 */
public class Conjugeur
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        /*Saisie clavier*/
        Scanner clavier=new Scanner(System.in);
        /*Déclaration des variables*/
        
         String terminaison;
         String radical;
        do
        {
        System.out.println("Entrer votre texte : ");
        String verbe=clavier.next();
        
         terminaison=verbe.substring(verbe.length()-2);
         radical=verbe.substring(0,verbe.length()-2);
         radical=radical.toLowerCase();
         if(!terminaison.equals("er"))
         {
                     System.out.println("Le verbe doit être du premier groupe");
         }
        }while(!terminaison.equals("er"));
         /*Affichage*/
        System.out.println("Je "+radical+"e");
        System.out.println("Tu "+radical+"es");
        System.out.println("Il "+radical+"e");
        System.out.println("Nous "+radical+"ons");
        System.out.println("Vous "+radical+"ez");
        System.out.println("Ils "+radical+"ent");
        
       
        
        
        
        
    }
}
