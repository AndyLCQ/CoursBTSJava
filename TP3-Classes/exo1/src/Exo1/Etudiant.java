/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exo1;

/**
 *
 * @author eleveIRIS1
 */
public class Etudiant 
{
       private String nom, prenom;
       private int numero;
// constructeur
        public Etudiant(String unNom, String unPrenom, int unNumero) 
        {
            nom = unNom;
            prenom = unPrenom;
            numero = unNumero;
        }

        public String getNom() 
        {
            return nom; // accesseur
        }
        public int getNumero() 
        {
            return numero; // accesseur
        }
        public void changerNumero(int unNumero)
        { 
            numero = unNumero; // modificateur
        }
        public void changerNom(String nom)
        {
            this.nom=nom;
        }
        public void changerPrenom(String prenom)
        {
            this.prenom=prenom;
        }
        public String getPrenom()
        {
            return prenom;
        }
}