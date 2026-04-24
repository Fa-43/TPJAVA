package partie2;
import partie1.Abonnement;

public class AbbonnementJeux extends Abonnement {
	private int nbJeuxInclus;
	private int heuresJeuParMois;

	public AbbonnementJeux(String nom,double prixBase,int nbProfils,int nbJeuxInclus, int heuresJeuParMois) {
		super(nom,prixBase,nbProfils);
		this.nbJeuxInclus=nbJeuxInclus;
		this.heuresJeuParMois=heuresJeuParMois;
	}
	//
	public  double calculerCoutMensuel() {
		double cout=getPrixBase();
		if(nbJeuxInclus>50)
			cout+=25;
		if(heuresJeuParMois>40)
			cout+=15;
		return cout;	
	}
	//
	public int calculerScoreSatisfaction() {
		int score=40;
		if(nbJeuxInclus>=30)
			score+=30;
		if(heuresJeuParMois>=20)
			score+=20;
		if(getNbProfils()>=2)
			score+=10;
		if(score>100)
			score=100;
		return score;
	}

}
