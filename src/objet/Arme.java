package objet;

public class Arme extends Objet{
	

	int BonusDommage;
	int DrainOfLife;
	
	public Arme(String name, String type, int BonusDommage, int DrainOflife) {
		super(name, type);
		BonusDommage = getBonusDommage();
		DrainOfLife = getDrainOfLife();
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

}





