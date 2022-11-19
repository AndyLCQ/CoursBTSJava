/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exo34;

/**
 *
 * @author eleveIRIS1
 */
public class SuiteFibonacci
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       int n=15;
       int fnMoins1=1;
       int fn=1;
       int fnPlus1=0;
       
        for (int i = 2; i < n; i++)
        {
            
            fnPlus1=fn+fnMoins1;
            System.out.println("f"+i+"="+fnPlus1);
            System.out.println("\n");
            fnMoins1=fn;
            fn=fnPlus1;
          
            
        }
          
            
            
        
       
       
    }
}
