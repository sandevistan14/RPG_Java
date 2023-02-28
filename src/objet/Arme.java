package objet;

public class Arme extends Objet{
	

	int bonusDommage;
	int drainOfLife;
	
	public Arme(String name, String type, int BonusDommage, int DrainOflife) {
		super(name, type);
		bonusDommage = BonusDommage;
		drainOfLife = DrainOflife;
		// TODO Auto-generated constructor stub
	}

	public int getBonusDommage() {
		return bonusDommage;
	}

	public void setBonusDommage(int BonusDommage) {
		bonusDommage = BonusDommage;
	}

	public int getDrainOfLife() {
		return drainOfLife;
	}

	public void setDrainOfLife(int DrainOflife) {
		drainOfLife = DrainOflife;
	}

}





