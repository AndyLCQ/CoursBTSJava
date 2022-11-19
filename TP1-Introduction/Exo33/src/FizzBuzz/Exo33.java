/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FizzBuzz;

/**
 *
 * @author eleveIRIS1
 */
public class Exo33 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int maximum=1000;
        for (int i = 1; i < maximum+1; i++) 
        {
            if (i%5==0) 
            {                
                 if (i%7==0) 
                {
                    System.out.println("Fizzbuzz");
                }
                 else
                 {
                     System.out.println("Fizz");
                 }
            }
            else
            {
                if (i%7==0) 
                 {
                System.out.println("Buzz");
                }
                else 
                {
                    System.out.println(i);
                }
            }
           
            
            
            
            
            
        }
    }
}
