package partie2;
import partie1.Abonnement;

public class AbounnementMusique extends Abonnement  implements Reducible {
	private int nbPlaylists;
	private boolean optionOffline;
	//
	public AbounnementMusique(String nom,double prixBase,int nbProfils,int nbPlaylists, boolean optionOffline) {
		super(nom,prixBase,nbProfils);
		this.nbPlaylists=nbPlaylists;
		this.optionOffline=optionOffline;
	}
	//
	public  double calculerCoutMensuel() {
		double cout=getPrixBase();
		if(optionOffline)
			cout+=15;
		return cout;	
	}
	//
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
	@Override
	public double appliquerReduction(double pourcentage) {
		double coutApresRedu=calculerCoutMensuel()*(pourcentage/100);
		return coutApresRedu;
	}
	@Override
	public boolean estEligibleReduction(double pourcentage) {
		return false;
	}
}
