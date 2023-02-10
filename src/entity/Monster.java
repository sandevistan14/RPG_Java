package entity; 

public class Monster extends Entity{

	public Monster(char lettre,String name, int posY, int posX, int dommage, int life, int defense) {
		super(lettre, name, posY, posX, dommage, life, defense);
		// TODO Auto-generated constructor stub
	}

	public class Slime extends Monster {

		public Slime(char lettre,String name, int posY, int posX, int dommage, int life, int defense, String[] equipement) {
			super(lettre, name, posY, posX, dommage, life, defense);
			// TODO Auto-generated constructor stub
		}
	}
	
	public class Dragon extends Monster{

		public Dragon(char lettre,String name, int posY, int posX, int dommage, int life, int defense) {
			super(lettre, name, posY, posX, dommage, life, defense);
			// TODO Auto-generated constructor stub
		}
		
	}
	
	public class Gobelin extends Monster{

		public Gobelin(char lettre,String name, int posY, int posX, int dommage, int life, int defense) {
			super(lettre, name, posY, posX, dommage, life, defense);
			// TODO Auto-generated constructor stub
		}
		
	}
	
}