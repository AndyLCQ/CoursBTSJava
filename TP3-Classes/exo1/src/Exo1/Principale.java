/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exo1;

/**
 *
 * @author eleveIRIS1
 */


public class Principale
{

public static void main(String args[]) 
{
    Etudiant e;
    e = new Etudiant("Dupont", "Jacques", 0);
    System.out.println(e.getNom()+ " " + e.getNumero());
    e.changerNom("Durand");
    e.changerNumero(12);
    System.out.println(e.getNom()+ " " + e.getNumero());
    e.changerPrenom("Jules");
    System.out.println(e.getNom()+" "+e.getPrenom() + " " + e.getNumero());
}
}
