/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tpwifibot;

/**
 *
 * @author eleveIRIS1
 */
public enum Vitesse
{
   V0((byte)0), V1((byte)10),V2((byte)20), V3((byte)30), V4((byte)37), V5((byte)50), V6((byte)60);
   
   private byte vitesse;
   private Vitesse ( byte vitesse)
   {
       this.vitesse=vitesse;
   }
   public byte toByte()
   {
       return vitesse;
   }
}
