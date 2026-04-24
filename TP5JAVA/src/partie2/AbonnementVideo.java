package partie2;
import partie1.Abonnement;
public class AbonnementVideo extends Abonnement implements Reducible{
	//
	private boolean optionHD;
	private boolean option4K;
	//
	public AbonnementVideo(String nom,double prixBase,int nbProfils,boolean optionHD, boolean option4K) {
		super(nom,prixBase,nbProfils);
		this.optionHD=optionHD;
		this.option4K=option4K;
	}
	//
	public double calculerCoutMensuel() {
		double cout=getPrixBase();
		if(optionHD)
			cout+=10;
		if(option4K)
			cout+=20;
		return cout;
	}
	//
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
	@Override
	public double appliquerReduction(double pourcentage) {
		double coutApresRedu=calculerCoutMensuel()*(pourcentage/100);
		return coutApresRedu;
	}
	@Override
	public boolean estEligibleReduction(double pourcentage) {
		// TODO Auto-generated method stub
		return false;
	}
	
	


}
