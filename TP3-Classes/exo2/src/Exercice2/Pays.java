//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Pays.java
//  @ Date : 12/03/2013
//  @ Author : 
//
//



package Exercice2;


public class Pays {
	private String nomPays;
	private int année;
	private float PNB;
        
	public  Pays(String unNomPays, int unPNB, int uneAnnée) {
	this.nomPays=unNomPays;
        this.PNB=unPNB;
        this.année=uneAnnée;
	}
	
	public float tauxCroissance(float PNBAnnéeSuivante) {
        
        return ((PNBAnnéeSuivante-PNB)/PNB)*100;
	
	}
	
	public void affiche() {
	System.out.println("Pays "+nomPays+" : PNB de "+PNB+" $ pour l'année "+année);

	}

    
}
