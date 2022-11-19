/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exo3;

/**
 *
 * @author eleveIRIS1
 */
public class PolynomeDegre1
{

    private float a;
    private float b;
    
    public PolynomeDegre1(float a,float b)
    {
        this.a=a;
        this.b=b;
    }
    
    public float evaluation(float x)
    {
        return a*x+b;
    }
    
    public float calculRacine()
    {
        return -b/a;
    }
    
    public void affiche()
    {
        
        if(b<0)
        {
            if(a==0)
            {
                System.out.println("Le polynome est : "+b);
            }
            else
            {
                System.out.println("Le polynome est : "+a+"x "+b);
            }
        }
        if (b>0)
        {
            if(a==0)
            {
                System.out.println("Le polynome est : "+b);
            }
            else
            {
                System.out.println("Le polynome est :"+a+"x +"+b);
            }
        }
        
        
        
    }

}

