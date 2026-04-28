package partie2;
import partie1.Abonnement;
public class AbonnementVideo extends Abonnement implements Reducible{
	//attributs suplémentaire 
	private boolean optionHD;
	private boolean option4K;
	//constructeure pramétré
	public AbonnementVideo(String nom,double prixBase,int nbProfils,boolean optionHD, boolean option4K) {
		super(nom,prixBase,nbProfils);
		this.optionHD=optionHD;
		this.option4K=option4K;
	}
	//definition des methode abstraite
	//methode calculerCoutMensuel()
	public double calculerCoutMensuel() {
		double cout=getPrixBase();
		if(optionHD)
			cout+=10;
		if(option4K)
			cout+=20;
		return cout;
	}
	//methode calculerScoreSatisfaction()
	public int calculerScoreSatisfaction() {
		int score=50;
		if(optionHD)
			score+=10;
		if(option4K)
			score+=20;
		if(getNbProfils()>=4)
			score+=10;
		if(score>=100)
			score=100;
		return score;
	}
	//implementation des methodes de l'interfaces
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
