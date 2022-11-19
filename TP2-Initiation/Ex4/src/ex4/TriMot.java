/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

import java.util.Scanner;

/**
 *
 * @author eleveIRIS1
 */
public class TriMot
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
/*********************Déclaration variables*********************/
        
        Scanner clavier=new Scanner(System.in); /*Objet pour la saisie*/
        String mot[];
        int nombreMot;
        int j=0;
        int i;
        String tampon;
        boolean permutation;
        
/******Saisie Nombre de mot et mot et stockage dans tableau*****/        
        System.out.println("Combien de mot ?");
        nombreMot=clavier.nextInt();
        mot=new String [nombreMot];
        do
        {
        System.out.println("Entrer un mot :");
        mot[j]=clavier.next();
        j++;
        }
        while(j!=nombreMot);
        
        System.out.println("Liste non triée :");
        for(j=0;j<nombreMot; j++)
        {
        System.out.println("mot "+(j+1)+" : "+mot[j]);
        }
        
/*************tri dans l'ordre croissant - tri a bulle*************/
       System.out.println("Liste trié :");
       do
       { 
       permutation=false;
    
        for ( i= 0; i < nombreMot-1; i++)
        {
            
            int retour=mot[i].compareToIgnoreCase(mot[i+1]);
            if (retour>0)
            {
                tampon=mot[i+1];
                mot[i+1]=mot[i];
                mot[i]=tampon;
                permutation=true;
            }
            
  
            
       }
       }while(permutation==true);
        for ( i = 0; i < mot.length; i++)
        {
            System.out.println(mot[i]);
            
        }
        
    }
}
