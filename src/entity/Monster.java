package entity; 

public class Monster extends Entity{

	public Monster(char lettre,String name, int posY, int posX, int dommage, int life, int defense) {
		super(lettre, name, posY, posX, dommage, life, defense);
	}

//	public class Slime extends Monster {
//
//
//		public Slime(char lettre,String name, int posY, int posX, int dommage, int life, int defense) {
//			super(lettre, name, posY, posX, dommage, life, defense);
//			Entity.lettre = 'S';
//			Entity.name = "Slime";
//			Entity.dommage = 10;
//			Entity.life = 40;
//			Entity.defense = 0;
//		}
//	}
//	
//	public class Dragon extends Monster{
//
//		public Dragon(char lettre,String name, int posY, int posX, int dommage, int life, int defense) {
//			super(lettre, name, posY, posX, dommage, life, defense);
//			Entity.lettre = 'D';
//			Entity.name = "Dragon";
//			Entity.dommage = 40;
//			Entity.life = 200;
//			Entity.defense = 50;
//		}
//		
//	}
//	
//	public class Gobelin extends Monster{
//
//		public Gobelin(char lettre,String name, int posY, int posX, int dommage, int life, int defense) {
//			super(lettre, name, posY, posX, dommage, life, defense);
//			Entity.lettre = 'G';
//			Entity.name = "Gobelin";
//			Entity.dommage = 20;
//			Entity.life = 800;
//			Entity.defense = 20;
//		}
//		
//	}
	
}