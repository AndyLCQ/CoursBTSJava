/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.util.Scanner;

/**
 *
 * @author eleveIRIS1
 */
public class LireEtTrier
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
/*********************Déclaration variables*********************/
        /*Objet pour la saisie*/
        Scanner clavier=new Scanner(System.in);
        

        int tableauEntier []; //Déclaration tableau
        tableauEntier=new int [3]; //Création tableau
        int entier=0; //Variable pour la saisie clavier
        int i=0; //compteur
        int j; //Compteur
        boolean permutation;
        int tampon;
        
/*************Saisie entier et stockage dans tableau*************/       
          
        
             j = 0;
            
            do
            {
                 System.out.println("Entrer un entier");
                 entier=clavier.nextInt();
                 j++;
            
                tableauEntier[j]=entier;
              }while(tableauEntier[j]!=0 && j!=tableauEntier.length);
           
               
            
        
            System.out.println("Tableau d'entier :");
            for (j = 0; j < tableauEntier.length; j++)
           {
               System.out.println(tableauEntier[j]);
            }
        
/*************tri dans l'ordre croissant - tri a bulle*************/
       System.out.println("Tableau d'entier trié :");
       do
       { 
       permutation=false;
    
        for ( i= 0; i < tableauEntier.length-1; i++)
        {
            if(tableauEntier[i] > tableauEntier[i+1])
            {
                tampon=tableauEntier[i+1];
                tableauEntier[i+1]=tableauEntier[i];
                tableauEntier[i]=tampon;
                permutation=true;
            }
            
       }
       }while(permutation==true);
        for ( i = 0; i < tableauEntier.length; i++)
        {
            System.out.println(tableauEntier[i]);
            
        }
    }// }while(entier!=0 || i==tableauEntier.length);
}
// }while(entier!=0 || i==tableauEntier.length);