/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tpwifibot;

import java.util.Scanner;

/**
 *
 * @author eleveIRIS1
 */
public class Ihm
{
    private String choix;
    public void lancer()
    {
        WifiBot  wifiBot= new WifiBot();
        do
        {
            saisirChoix();
            traiteChoix();
        }while(choix.equals('q'));
    }
    private void saisirChoix()
    {
        System.out.println("'a' pour avancer" );
        System.out.println("'r' pour pour reculer" );
        System.out.println("'rd' pour avancer avec détecteurs" );
        System.out.println("'g' pour un quart de tour gauche" );
        System.out.println("'d' pour un quart de tour Droit" );
        System.out.println("'s' pour stopper" );
        System.out.println("'c' pour un carré" );
        System.out.println("'u' pour un avancer d'une unité" );
        System.out.println("'q' pour quitter" );
        Scanner clavier = new Scanner(System.in);
        choix=clavier.nextLine();
        
    }
    private void traiteChoix()
    {
        switch(choix)
        {
            case "a" :
                WifiBot.
                
        }
    }
}
