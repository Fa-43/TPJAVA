package partie2;
import partie1.Abonnement;

public class AbounnementMusique extends Abonnement  implements Reducible {
	//attributs suplementaire
	private int nbPlaylists;
	private boolean optionOffline;
	//constructeur paramétré
	public AbounnementMusique(String nom,double prixBase,int nbProfils,int nbPlaylists, boolean optionOffline) {
		super(nom,prixBase,nbProfils);
		this.nbPlaylists=nbPlaylists;
		this.optionOffline=optionOffline;
	}
	//definition des methodes abstraite
	//method calculerCoutMensuel()
	public  double calculerCoutMensuel() {
		double cout=getPrixBase();
		if(optionOffline)
			cout+=15;
		return cout;	
	}
	//method calculerScoreSatisfaction()
	public int calculerScoreSatisfaction() {
		int score=50;
		if(nbPlaylists>=20)
			score+=20;
		if(optionOffline)
			score+=20;
		if(getNbProfils()>1)
			score+=10;	
		if(score>=100)
			score=100;
		return score;
		
	}
	//implementation des methodes de l'interface
	@Override
	public boolean estEligibleReduction(double pourcentage) {
		return  (pourcentage>=0 && pourcentage<=30);
	}
	
	@Override
	public double appliquerReduction(double pourcentage) {
		if (estEligibleReduction(pourcentage)) {
			double coutApresRedu=calculerCoutMensuel()*(1-pourcentage/100);
		    return coutApresRedu;
		}
		else 
			return calculerCoutMensuel();
			
	
	}
}
