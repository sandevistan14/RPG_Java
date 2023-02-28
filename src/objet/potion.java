package objet;

public class Potion extends Objet{
	int Heal;
	
	public Potion(String name, String type,String Rarity, int heal) {
		super(name, type, Rarity);
		Heal = heal;
	}

	public int getHeal() {
		return Heal;
	}

	public void setHeal(int heal) {
		Heal = heal;
	}

	@Override
	public String toString() {
		return "Potion [Heal=" + Heal + "]";
	}

	
}

