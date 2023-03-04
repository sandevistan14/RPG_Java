package entity;

import java.util.ArrayList;

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
	
	public static ArrayList<Monster> CreateMonster(char[][] mapmonster) {
		ArrayList<Monster> Monstre = new ArrayList<Monster>();
		 for(int y = 0;y < mapmonster.length; y += 1) {
			 for(int x = 0;x < mapmonster[y].length; x += 1) {
				 if(mapmonster[y][x] == 'S') {
					 Monstre.add(new Monster('S', "Slime", y, x, 10, 40, 0,10,0));
				 }
				 else if (mapmonster[y][x] == 'W') {
					 Monstre.add(new Monster('W', "Wolf", y, x, 20, 80, 10,20,40));
				 }
				 else if (mapmonster[y][x] == 'D') {
					 Monstre.add(new Monster('D', "Dragon1", y, x, 50, 250, 50,100,0));
				 }
				 else if(mapmonster[y][x] == 'M') {
					 Monstre.add(new Monster('M', "Mother of dead", y, x, 100, 1000, 200,999999,0));
				 }
				 else if(mapmonster[y][x] == 'K') {
					 Monstre.add(new Monster('K', "King of DRagon", y, x, 100, 500, 300,999999,0));
				 }
			 }
		}
		return Monstre;
	}
	
	public static Monster[] MonsterForest() {
		Monster[] TabMonsterForest = new Monster[11];
		int MonsterInForest = 0;
		TabMonsterForest[0] = new Monster('W', "WolfF1", 0, 0, 20, 80, 0,20,40);
		TabMonsterForest[1] = new Monster('S', "SlimeF1", 0, 0, 10, 40, 0,10,10);
		TabMonsterForest[2] = new Monster('W', "WolfF2", 0, 0, 20, 80, 0,20,40);
		TabMonsterForest[3] = new Monster('S', "SlimeF2", 0, 0, 10, 40, 0,10,10);
		TabMonsterForest[4] = new Monster('W', "WolfF3", 0, 0, 20, 80, 0,20,40);
		TabMonsterForest[5] = new Monster('W', "WolfF4", 0, 0, 20, 80, 0,20,40);
		TabMonsterForest[6] = new Monster('W', "WolfF5", 0, 0, 20, 80, 0,20,40);
		TabMonsterForest[7] = new Monster('W', "WolfF6", 0, 0, 20, 80, 0,20,40);
		TabMonsterForest[8] = new Monster('W', "WolfF7", 0, 0, 20, 80, 0,20,40);
		TabMonsterForest[9] = new Monster('W', "WolfF8", 0, 0, 20, 80, 0,20,40);
		TabMonsterForest[10] = new Monster('D', "Dragon1", 0, 0, 40, 200, 50,100,0);
		return TabMonsterForest;
	}
}

