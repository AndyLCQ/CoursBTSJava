/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TPWifiBot;


import java.io.IOException;

import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author prof
 */
public class WifiBot {
   
    private Socket socketRobot = null;
    private PrintStream streamOutRobot;
    

    private char[] commandeWifiBot = new char [2];

//--------------- METHODE CONNEXION AU ROBOT --------------------
    public void connexionRobot()
    {
        try 
        {
            int port = 15000;
            String host = "192.168.0.132";
            socketRobot = new Socket(host, port);
            streamOutRobot = new PrintStream(socketRobot.getOutputStream());
            System.out.println("Connexion avec WifiBot reussie ");
        }
        catch (UnknownHostException ex) {
            System.out.println("Impossible de joindre l'adresse IP du robot ");
        }
        catch (IOException ex) {
           System.out.println("Erreur Entrées/Sorties connexion :" +ex.getMessage());
        }
    }
    //--------------- METHODE DECONNEXION DU ROBOT ---------------------
    public void deconnexionRobot() {
        try{
            streamOutRobot.close();
            socketRobot.close();
        }catch(Exception e1){
        System.out.println("Erreur à  la deconnexion : "+e1.getMessage()) ;}
    }
      //--------------------------------------------------------------------
    private void envoyerCommandeWifiBot (byte commandeMG, byte commandeMD)
    {
         commandeWifiBot[0] =(char)commandeMG;
         commandeWifiBot[1]= (char)commandeMD;
        streamOutRobot.print(commandeWifiBot);
    }
        
}
