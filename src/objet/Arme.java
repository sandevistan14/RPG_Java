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
		
		Arme épeelongue = new Arme("épeelongue","épee",20,0,false);
	
	}
}
