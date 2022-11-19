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
   private  Scanner clavier =null;
      WifiBot  wifiBot=null; 
      
     public Ihm()
     {
       clavier = new Scanner(System.in);  
       wifiBot= new WifiBot(); 
     }
     
    public void lancer()
    {
        
        do
        {
            saisirChoix();
            traiteChoix();
        }while(!choix.equals("q"));
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
       
        choix=clavier.next();
        
    }
    private void traiteChoix()
    {
     
        

        float durée;
        switch(choix)
        {
            case "a" :
                System.out.println("Saisir la durée en seconde :");
                durée=clavier.nextFloat();
                
                wifiBot.avancer(Vitesse.V4, durée);
                System.out.println("Le robot a avancer à une vitesse "+Vitesse.V4+" pendant "+durée+" seconde(s)");
                break;
            case "r" :
                System.out.println("Saisir la durée en seconde  :");
                durée=clavier.nextFloat();
                wifiBot.reculerSansDetecteurs(Vitesse.V4, durée);
                System.out.println("Le robot a reculer à une vitesse "+Vitesse.V4+" pendant "+durée+" seconde(s)");
                break;
            case "rd" :
                System.out.println("Saisir la durée en seconde :");
                durée=clavier.nextFloat();
                wifiBot.reculerAvecDetecteurs(Vitesse.V4, durée);
                System.out.println("Le robot a reculer avec detecteurs à une vitesse "+Vitesse.V4+" pendant "+durée+" seconde(s)");
                break;
            case "g" :
                wifiBot.tournerQuartGauche();
                System.out.println("Le robot a tourner à gauche");
                break;
            case "d" :
                wifiBot.tournerQuartDroit();
                System.out.println("Le robot a tourner à droite");
                break;
            case "s" :
                wifiBot.arreter();
                System.out.println("Le robot s'est arrêté");
                break;
            case "c" :
                System.out.println("Saisir nbUnite  :");
                byte nbUnite = clavier.nextByte();
                wifiBot.carré(nbUnite);
                System.out.println("Le robot a formé un carré de "+nbUnite+" unités");
                break;
            case "u" :
                wifiBot.avancer1Unité();
                System.out.println("Le robot a avancer de une unité");
                break;
            case "q" :
                System.out.println("Le programme se ferme !");
//                wifiBot.deconnexionRobot();
                break;
            default : 
                System.out.println("Erreur de saisie !");
                break;
        }
    }
}
