package entity; 

public class Monster extends Entity{

	int Xp;

	public Monster(char lettre, String name, int posY, int posX, int dommage, int life, int defense, int xp) {
		super(lettre, name, posY, posX, dommage, life, defense);
		Xp = xp;
	}

	public int getXp() {
		return Xp;
	}

	public void setXp(int xp) {
		Xp = xp;
	}
}
