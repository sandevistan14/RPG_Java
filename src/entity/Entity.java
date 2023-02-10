package entity;

public class Entity{
   static char lettre;
   static String name;
   static int posY;
   static int posX;
   static int dommage;
   static int life;
   static int defense;
   
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
	Entity.name = name;
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
	Entity.dommage = dommage;
}

public int getLife() {
	return life;
}

public void setLife(int life) {
	Entity.life = life;
}

public int getDefense() {
	return defense;
}

public void setDefense(int defense) {
	Entity.defense = defense;
}

public char getLettre() {
	return lettre;
}

public void setLettre(char lettre) {
	Entity.lettre = lettre;
}

   /** Constructs a Author instance with the given inputs */

}