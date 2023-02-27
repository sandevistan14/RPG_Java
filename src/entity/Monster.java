package entity; 

public class Monster extends Entity{

	int Xp;

	public Monster(char lettre, String name, int posY, int posX, int dommage, int life, int defense, int xp, int speed) {
		super(lettre, name, posY, posX, dommage, life, defense, speed);
		Xp = xp;
	}

	public int getXp() {
		return Xp;
	}

	public void setXp(int xp) {
		Xp = xp;
	}
}
