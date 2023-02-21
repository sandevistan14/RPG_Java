package objet;

public class Artefact extends Objet{
	String BonusName;
	int Bonus;
	public Artefact(String name, String type, String bonusName, int bonus) {
		super(name, type);
		BonusName = bonusName;
		Bonus = bonus;
	}
	public String getBonusName() {
		return BonusName;
	}
	public void setBonusName(String bonusName) {
		BonusName = bonusName;
	}
	public int getBonus() {
		return Bonus;
	}
	public void setBonus(int bonus) {
		Bonus = bonus;
	}


}


