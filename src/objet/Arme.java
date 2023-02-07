package objet;

public class Arme extends Objet{
	

	int BonusDommage;
	int DrainOfLife;
	boolean IsDistance;
	
	public Arme(String name, String type, int BonusDommage, int DrainOflife, boolean IsDistance) {
		super(name, type);
		BonusDommage = getBonusDommage();
		DrainOfLife = getDrainOfLife();
		IsDistance = getIsDistance();
		// TODO Auto-generated constructor stub
	}

	public int getBonusDommage() {
		return BonusDommage;
	}

	public void setBonusDommage(int bonusDommage) {
		BonusDommage = bonusDommage;
	}

	public int getDrainOfLife() {
		return DrainOfLife;
	}

	public void setDrainOfLife(int drainOfLife) {
		DrainOfLife = drainOfLife;
	}



	public boolean getIsDistance() {
		return IsDistance;
	}

	public void setIsDistance(boolean isDistance) {
		IsDistance = isDistance;
	}

	public static void Main(String[] args){
		
		Arme Epeelongue = new Arme("Epeelongue","lame",20,0,false);
		Arme Arc = new Arme("Arc","Arc",15,0,true);
		Arme Massue = new Arme("Massue","lourd",40,0,false);
		Arme baguette = new Arme("baguette","magie",30,0,true);
		Arme poignard = new Arme("poignard","lame",20,0,false);
	}
}





