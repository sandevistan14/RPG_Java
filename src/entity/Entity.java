package entity;

public class Entity{
   private String name;
   private int posY;
   private int posX;
   private int dommage;
   private int life;
   private int defense;
   
   public Entity(String name, int posY, int posX, int dommage, int life, int defense,
		String[] equipement) {
	super();
	this.name = name;
	this.posY = posY;
	this.posX = posX;
	this.dommage = dommage;
	this.life = life;
	this.defense = defense;
	this.equipement = equipement;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getPosY() {
	return posY;
}

public void setPosY(int posY) {
	this.posY = posY;
}

public int getPosX() {
	return posX;
}

public void setPosX(int posX) {
	this.posX = posX;
}

public int getDommage() {
	return dommage;
}

public void setDommage(int dommage) {
	this.dommage = dommage;
}

public int getLife() {
	return life;
}

public void setLife(int life) {
	this.life = life;
}

public int getDefense() {
	return defense;
}

public void setDefense(int defense) {
	this.defense = defense;
}

public String[] getInventaire() {
	return inventaire;
}

public void setInventaire(String[] inventaire) {
	this.inventaire = inventaire;
}

public String[] getEquipement() {
	return equipement;
}

public void setEquipement(String[] equipement) {
	this.equipement = equipement;
}

private String[] inventaire;
   private String[] equipement;
 
   /** Constructs a Author instance with the given inputs */

}