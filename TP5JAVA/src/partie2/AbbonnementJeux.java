package partie2;
import partie1.Abonnement;

public class AbbonnementJeux extends Abonnement {
	//attributs suplementaire
	private int nbJeuxInclus;
	private int heuresJeuParMois;
	//constructor
	public AbbonnementJeux(String nom,double prixBase,int nbProfils,int nbJeuxInclus, int heuresJeuParMois) {
		super(nom,prixBase,nbProfils);
		this.nbJeuxInclus=nbJeuxInclus;
		this.heuresJeuParMois=heuresJeuParMois;
	}
	//method  calculerCoutMensuel()
	public  double calculerCoutMensuel() {
		double cout=getPrixBase();
		if(nbJeuxInclus>50)
			cout+=25;
		if(heuresJeuParMois>40)
			cout+=15;
		return cout;	
	}
	//method  calculerScoreSatisfaction()
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
