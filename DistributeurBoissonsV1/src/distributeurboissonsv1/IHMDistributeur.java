package distributeurboissonsv1;


import java.util.Scanner;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : IHMDistributeur.java
//  @ Date : 14/05/2013
//  @ Author : 
//
//




public class IHMDistributeur {
	private Scanner clavier = new Scanner(System.in);
	public void afficheMenu() 
        {
            System.out.println("Faites votre sélection :");
            System.out.println(" 1- Ajouter de l'argent");
            System.out.println(" 2- Prendre une boisson");
            System.out.println(" 3- Annuler");
            System.out.println(" 4- Etat du compteur et de la caisse");
            System.out.println(" 5- Quitter");
	}
	
	public void selectionnerChoix(DistributeurDeBoissons distributeurDeBoissons) 
        {
            byte choix;
            distributeurDeBoissons.setPrixProduit(0.5f);
            do
            {
                afficheMenu();
               choix = clavier.nextByte();
            switch(choix)
            {
                case 1: 
                    System.out.println("Entrer la somme à entrer");
                    float sommeArgent=clavier.nextFloat();
                    distributeurDeBoissons.ajouterArgent(sommeArgent);
                    break;
                case 2:
                    Validation conditionsChoix = distributeurDeBoissons.validerChoix();
                    
                          
                    switch(conditionsChoix)
                    {
                        case  VALIDATION_OK : 
                            distributeurDeBoissons.preparerProduit();
                            break;
                    
                        case ARGENT_INSUFISANT :
                            float money=distributeurDeBoissons.monnaie() ;
                            System.out.println("Ajouter "+Math.abs(money)+" €.");
                             break;
                    
                        case PLUS_DE_GOBELET :
                            System.out.println("Il n'y a plus de de gobelet !");
                            distributeurDeBoissons.annuler();
                            break;
            }
                    break;
                case 3:
                    float rendu= distributeurDeBoissons.annuler();
                    System.out.println("Monnaie rendue: "+rendu+" €");
                    break;
                case 4 :
                    System.out.println(distributeurDeBoissons.etat());
                    
                    break;
                case 5 : 
                    System.out.println("Au revoir !");
                    break;
                    
            }
          }while(choix!=5);   
           
	}
              
}
