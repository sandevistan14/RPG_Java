package entity;

public class Entity{
   private char lettre;
   private String name;
   private static int posY;
   private static int posX;
   private int dommage;
   private int life;
   private int defense;
   
   @SuppressWarnings("static-access")
public Entity(char lettre, String name, int posY, int posX, int dommage, int life, int defense) {
	super();
	this.name = name;
	this.posY = posY;
	this.posX = posX;
	this.dommage = dommage;
	this.life = life;
	this.defense = defense;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public static int getPosY() {
	return posY;
}

public static void setPosY(int posY) {
	Entity.posY = posY;
}

public static int getPosX() {
	return posX;
}

public static void setPosX(int posX) {
	Entity.posX = posX;
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

public char getLettre() {
	return lettre;
}

public void setLettre(char lettre) {
	this.lettre = lettre;
}

   /** Constructs a Author instance with the given inputs */

}