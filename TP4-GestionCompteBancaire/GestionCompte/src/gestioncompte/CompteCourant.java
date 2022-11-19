//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : CompteCourant.java
//  @ Date : 26/03/2013
//  @ Author : 
//
//




public class CompteCourant {
	private int numeroCompteBancaire;
	public float solde;
	public CompteCourant(int numeroCompteBancaire, float solde)
        {
            this.numeroCompteBancaire=numeroCompteBancaire;
            this.solde=solde;
	}
	
	public String toString() 
        {
            return "Compte courant numéro :"+numeroCompteBancaire+", solde : "+solde+" euros";
	}
	
	public void crediter(float montantCredite)
        {
           solde=solde+montantCredite;
            System.out.println("On crédite "+montantCredite+" euros au compte "+numeroCompteBancaire);
	}
	
	public void debiter(float montantDebite)
        {
            if(solde>=montantDebite)
            {
                solde=solde-montantDebite;
                System.out.println("On retire"+montantDebite+ "euros au compte "+numeroCompteBancaire);
            }
            if(solde<montantDebite && solde>0)
            {
                solde=0;
                System.out.println("On retire"+solde+ "euros au compte "+numeroCompteBancaire+"Puisque vous n'avez pas "+montantDebite+" € sur le compte !");
            }
	}
        
}