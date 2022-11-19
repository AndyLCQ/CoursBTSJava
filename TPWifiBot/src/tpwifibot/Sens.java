/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tpwifibot;

/**
 *
 * @author eleveIRIS1
 */
public enum Sens
{
    SENS_AV((byte)64), SENS_AR((byte)0);
    private byte sens;
    private Sens(byte sens)
    {
         this.sens=sens;
    }
    public byte toByte()
    {
        return sens;
    }
}
