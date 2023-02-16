package objet;

public class Potion extends Objet{
	int Heal;
	
	public Potion(String name, String type, int heal) {
		super(name, type);
		Heal = heal;
	}

	public int getHeal() {
		return Heal;
	}

	public void setHeal(int heal) {
		Heal = heal;
	}

	
}

