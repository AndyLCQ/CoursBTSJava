/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exo4;

/**
 *
 * @author eleveIRIS1
 */
public class PolynomeDegre2
{
    private float a;
    private float b;
    private float c;
    private float discriminant;
    
    public PolynomeDegre2(float a, float b, float c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    public float evaluation(float x)
    {
        return (a*(float)Math.pow(x, 2))+b*x+c;
    }
    public float calculDiscriminant()
    {
        discriminant = (float)Math.pow(b,2)-4*a*c;
        return discriminant;
    }
    public float getDiscriminant(float discriminant)
    {
        return discriminant;
    }
     public float [] calculRacine() 
    {
       float tableauResultat[] = new float[2];
       if(discriminant>0)
       {
            float x1 = (-b-(float)Math.sqrt(discriminant))/2*a;
            float x2 = (-b+(float)Math.sqrt(discriminant))/2*a;
            tableauResultat[0]=x1;
            tableauResultat[1]=x2;
       }
       if(discriminant==0)
       {
           float x0=-b/(2*a);
           tableauResultat[0]=x0;
           tableauResultat[1]=x0;
       }
       return tableauResultat;
    }
    public void affiche()
    {
        System.out.println("P(x)="+a+"x²+"+b+"x+"+c);
    }
   
}
