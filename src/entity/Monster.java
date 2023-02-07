package entity; 

public class Monster extends Entity{

	public Monster(String name, int posY, int posX, int dommage, int life, int defense, String[] equipement) {
		super(name, posY, posX, dommage, life, defense, equipement);
		// TODO Auto-generated constructor stub
	}

	public class Slime extends Monster {

		public Slime(String name, int posY, int posX, int dommage, int life, int defense, String[] equipement) {
			super(name, posY, posX, dommage, life, defense, equipement);
			// TODO Auto-generated constructor stub
		}
	}
	
	public class Dragon extends Monster{

		public Dragon(String name, int posY, int posX, int dommage, int life, int defense, String[] equipement) {
			super(name, posY, posX, dommage, life, defense, equipement);
			// TODO Auto-generated constructor stub
		}
		
	}
	
	public class Gobelin extends Monster{

		public Gobelin(String name, int posY, int posX, int dommage, int life, int defense, String[] equipement) {
			super(name, posY, posX, dommage, life, defense, equipement);
			// TODO Auto-generated constructor stub
		}
		
	}
	
}