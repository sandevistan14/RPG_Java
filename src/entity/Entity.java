package entity;

public class Entity{
   char lettre;
   String name;
   int posY;
   int posX;
   int dommage;
   int life;
   int defense;
   

public Entity(char lettre, String name, int posY, int posX, int dommage, int life, int defense) {
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

public int getPosY() {
	return this.posY;
}

public void setPosY(int posY) {
	this.posY = posY;
}

public int getPosX() {
	return this.posX;
}

public void setPosX(int posX) {
	this.posX = posX;
}

public int getDommage() {
	return this.dommage;
}

public void setDommage(int dommage) {
	this.dommage = dommage;
}

public int getLife() {
	return this.life;
}

public void setLife(int life) {
	this.life = life;
}

public  int getDefense() {
	return this.defense;
}

public  void setDefense(int defense) {
	this.defense = defense;
}

public char getLettre() {
	return this.lettre;
}

public void setLettre(char lettre) {
	this.lettre = lettre;
}

   /** Constructs a Author instance with the given inputs */

}