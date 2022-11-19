/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exo3;

/**
 *
 * @author eleveIRIS1
 */
public class TestPolynome
{
	public static void main(String[] args) { 
            
         PolynomeDegre1 polynomeDegre1 = new PolynomeDegre1(5, -3); 
         polynomeDegre1.affiche();
         System.out.println("Evalutaion :"+polynomeDegre1.evaluation(2));
          polynomeDegre1 = new PolynomeDegre1(0, 8);
         polynomeDegre1.affiche();
         float racine=polynomeDegre1.calculRacine();
         if(racine==Float.POSITIVE_INFINITY||racine==Float.NEGATIVE_INFINITY)
         {
                System.out.println("Il n'y a pas de racine !");
         }
         else
         {
             System.out.println("Racine :"+racine);
         }
          polynomeDegre1 = new PolynomeDegre1(12, 4);
         polynomeDegre1.affiche();
         racine=polynomeDegre1.calculRacine();
         if(racine==Float.POSITIVE_INFINITY||racine==Float.NEGATIVE_INFINITY)
         {
                System.out.println("Il n'y a pas de racine !");
         }
         else
         {
             System.out.println("Racine :"+racine);
         }
   
            
           
        }
}
