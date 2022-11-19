/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exo4;

/**
 *
 * @author eleveIRIS1
 */
public class TestPolynome
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       PolynomeDegre2 polynomeDegre2= new PolynomeDegre2(1, 2, 1);
       polynomeDegre2.affiche();
       float delta=polynomeDegre2.calculDiscriminant();
       System.out.println("DELTA = "+delta);
       if(delta>0)
       {
           float [] solutions=polynomeDegre2.calculRacine();
           System.out.println("Deux solutions : "+solutions[0]+" "+solutions[1]);
       }
       if(delta==0)
       {
           float [] solutions=polynomeDegre2.calculRacine();
           System.out.println("Une solution : "+solutions[0]);
       }
       if (delta <0)
       {
           System.out.println("Pas de solutions !");
       }
    }
}
