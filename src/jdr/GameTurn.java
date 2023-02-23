//package
package jdr;

//import
import java.util.Scanner;
import Armor.ChestPlate;
import Armor.Helmet;
import Armor.Legging;
import Armor.boot;
import entity.inventaire;
import entity.Hero;
import entity.Monster;
import objet.Arme;
import objet.Potion;
import objet.Artefact;

public class GameTurn{
	
	public static void GameTrun() throws InterruptedException {	
		 
		//*****************************************************************************
		//**************************     Initialization     ***************************
		//*****************************************************************************
		//map
		 char[][] mapentity = null;mapentity = Map.MapEntity(mapentity);
		 char[][] map = null;map = Map.Map(map);
		 char[][] mapmonster = null;mapmonster = Map.MapMonster(mapmonster);
		
		 //boolean
		 boolean IsClass = false;
		 
		 //level system
		 int xp = 0;
		 int xpfight = 0;
		 int xpreq = 40;
		 int level = 1;
		 
		 //object
		 Object[] Inv = new Object[11];
			 Inv[0] = new Arme("Epeelongue","lame",20,0);
			 Inv[1] = new Arme("Arc","Arc",15,0);
			 Inv[2] = new Arme("Massue","lourd",40,0);
			 Inv[3] = new Arme("baguette","magie",30,0);
			 Inv[4] = new Arme("poignard","lame",30,15);
			 Inv[5] = new Artefact("talissement de fortification","artefact","Dommage",20);
			 Inv[6] = new Potion("Potion de soin","Soin",40);
			 Inv[7] = new boot("StandarBoot","Boot",5, 2, 0);
			 Inv[8] = new Helmet("StandarHelmet", "Helmet", 5, 2, 0);
			 Inv[9] = new ChestPlate("StandarChestPlate","ChestPlate", 5, 2, 0);
			 Inv[10] = new Legging("StandarLegging", "Legging", 5, 2, 0);
			 
		 //weapon
		 Arme[] InvArme = new Arme[2];
		 Arme[] EqiArme = new Arme[1];
			
		//Artefact
		Artefact[] InvArtefact = new Artefact[3];
		Artefact[] EquiArtefact = new Artefact[1];
		
		//Potion
		Potion[] InvPotion = new Potion[5];
		
			Monster[] TabMonsterForest = new Monster[5];
				int MonsterInForest = 0;
				TabMonsterForest[0] = new Monster('W', "WolfF1", 0, 0, 20, 80, 0,20);
				TabMonsterForest[1] = new Monster('S', "SlimeF1", 0, 0, 10, 40, 0,10);
				TabMonsterForest[2] = new Monster('W', "WolfF2", 0, 0, 20, 80, 0,20);
				TabMonsterForest[3] = new Monster('S', "SlimeF2", 0, 0, 10, 40, 0,10);
				TabMonsterForest[4] = new Monster('W', "WolfF3", 0, 0, 20, 80, 0,20);

			 
		 Monster[] TabMonster = new Monster[4];
			 TabMonster[0] = new Monster('S', "Slime1", 26, 15, 10, 40, 0,10);
			 TabMonster[1] = new Monster('D', "Dragon1", 21, 15, 40, 200, 50,100);
			 TabMonster[2] = new Monster('M', "Mother of dead", 20, 15, 100, 1000, 200,999999);
			 TabMonster[3] = new Monster('W', "Wolf", 27, 15, 20, 80, 10,20);
			 
		 Hero Hero1 = new Hero('P',"",28,15,0,0,0);
		 
		 //inventory
		 inventaire inventory = new inventaire(null, 0, null, 0, null, 0);
		 
		//Flee
		 int ReturnX = Hero1.getPosX();
		 int ReturnY = Hero1.getPosY();
		 
		//*****************************************************************************
		//****************************     Difficulty     *****************************
		//*****************************************************************************	
		 	boolean DIfficulty = false;
		 	boolean godmod = false;
	        while (DIfficulty == false) {
	        	
				Scanner scan4 = new Scanner(System.in);
		        System.out.print("\n");
		        System.out.print("choisisez le niveau de difficulté : ");
		        System.out.print("\n");
		        System.out.print("- godmod (more than easy)");
		        System.out.print("\n");
		        System.out.print("- Easy");
		        System.out.print("\n");
		        System.out.print("- Normal");
		        System.out.print("\n");
		        System.out.print("- Hard");
		        System.out.print("\n");
		        String Diff = scan4.nextLine();
		        
		        if (Diff.equals("godmod")) {
		        	godmod = true;
		        	DIfficulty = true;
		        }
		        else if (Diff.equals("Easy")) {
		        	DIfficulty = true;
		        }
		        else if (Diff.equals("Normal")) {
		        	DIfficulty = true;
		        }
		        else if (Diff.equals("Hard")) {
		        	DIfficulty = true;
		        }
		        
	        }
		 
		 
//*****************************************************************************
//*******************************     Hero     ********************************
//*****************************************************************************	
	        while (IsClass == false) {
				Scanner scan = new Scanner(System.in);
		        System.out.print("\n");
		        System.out.print("choisisez votre classe : ");
		        System.out.print("\n");
		        System.out.println("- Paladins");
		        System.out.println("- Archer");
		        System.out.println("- Chevalier");
		        System.out.println("- Mage");
		        System.out.println("- Assassin");
		        System.out.print("\n");
		        System.out.println("if you want more information on the class tape 'NameClass info'");
		        System.out.print("\n");
		        String classs = scan.nextLine();
		        
		        if (classs.equals("Paladins")){
		        	Hero1.setName("Paladins");
		        	Hero1.setDommage(20);
		        	Hero1.setLife(120);
		        	Hero1.setDefense(50);
		        	IsClass = true;}
		        
		        if (classs.equals("Paladins info")){System.out.println("Dommage : 20, LifePoint : 120 defence : 50, good at sword and user of heal magic");}
		        
		        if (classs.equals("Archer")){
		        	Hero1.setName("Archer");
		        	Hero1.setDommage(40);
		        	Hero1.setLife(80);
		        	Hero1.setDefense(20);
		        	IsClass = true;}
		        
		        if (classs.equals("Archer info")){System.out.println("Dommage : 20, LifePoint : 120 defence : 50, powerfull user of magic");}
		        
		        if (classs.equals("Chevalier")){
		        	Hero1.setName("Chevalier");
		        	Hero1.setDommage(30);
		        	Hero1.setLife(100);
		        	Hero1.setDefense(40);
		        	IsClass = true;}
		        
		        if (classs.equals("Chevalier info")){System.out.println("0,0,30,100,40");}
		        
		        if (classs.equals("Mage")){
		        	Hero1.setName("Mage");
		        	Hero1.setDommage(40);
		        	Hero1.setLife(70);
		        	Hero1.setDefense(0);
		        	IsClass = true;}
		        if (classs.equals("Mage info")){System.out.println("Dommage : 40, LifePoint : 70 defence : 0, powerfull user of magic");}
		        
		        if (classs.equals("Assassin")){
		        	Hero1.setName("Assassin");
		        	Hero1.setDommage(50);
		        	Hero1.setLife(80);
		        	Hero1.setDefense(0);
		        	IsClass = true;}
		        if (classs.equals("Assassin info")){System.out.println("0,0,50,80,0");}
	        } 
	        
	        
//*****************************************************************************
//**************************     Introduction     *****************************
//*****************************************************************************        
	        
	        System.out.print("\n");
	        System.out.print("Bienvenue au monde de blablablabla");
	        System.out.print("\n");
	        
//*****************************************************************************
//******************************     WHILE     ********************************
//*****************************************************************************
		 while (true){

	//*****************************************************************************
	//******************************     FIGHT     ********************************
	//*****************************************************************************
			 if (MonsterInForest < 6 && map[Hero1.getPosY()][Hero1.getPosX()-1] == 'F') {
				 double rand = Math.random()*100;
				 if(rand >= 80) {
					 xpfight = -50;
					 xpfight = Fight.fight(Hero1,TabMonsterForest[MonsterInForest], xpfight ,mapmonster);
					 MonsterInForest += 1;
				 }
			 }
			 for(int i = 0;i < TabMonster.length; i += 1) {
				 if(TabMonster[i].getPosX() == Hero1.getPosX() && TabMonster[i].getPosY() == Hero1.getPosY()) {
					 xpfight = Fight.fight(Hero1,TabMonster[i], xpfight ,mapmonster);
					 if(xpfight == 0) {
						 mapentity[Hero1.getPosY()][Hero1.getPosX() - 1] = ' ';
						 Hero1.setPosX(ReturnX);
						 Hero1.setPosY(ReturnY);
						 mapentity[Hero1.getPosY()][Hero1.getPosX() - 1] = 'P';
						 break;
					 }
				 }
			 }
			 if(xpfight == -69) {
				 break;
			 }
			 if(godmod == true) {
				 xpfight = 223999;
				 godmod = false;
			 }
			 xp += xpfight;
			 xpfight = 0;

			 
	//*****************************************************************************
	//******************************     LEVEL     ********************************
	//*****************************************************************************
			 
			 while(xp >= xpreq) {
				 xp -= xpreq;
				 xpreq += 10;
				 level += 1;
				 Hero1.setLife(Hero1.getLife()+20);
				 Hero1.setDommage(Hero1.getDommage()+10);
				 Hero1.setDefense(Hero1.getDefense()+5);
				 System.out.print("\n");
				 System.out.print("\n");
				 System.out.print("Congrats level UP ! Your now level :");
				 System.out.print(level);
				 System.out.print("\n");
				 System.out.print("+20 HP, +10 Dommage, +5 Defense");
				 System.out.print("\n");
				 
			 }
			 
			 
	//*****************************************************************************
	//****************************     MAPCONST     *******************************
	//*****************************************************************************	
			 
			 for(int i = 0;i < map.length; i += 1) {
				 for(int k = 0;k < map[i].length; k += 1) {
					 if(mapentity[i][k] == 'P' && map[i][k] == 'F') {
						 System.out.print(AsciiArt.ANSI_GREENBACKGROUND + mapentity[i][k] + AsciiArt.ANSI_RESET);
					 }
					 else if (mapentity[i][k] != ' ' && mapentity[i][k] != '/') {
						 System.out.print(AsciiArt.ANSI_YELLOW + mapentity[i][k] + AsciiArt.ANSI_RESET);
					 }
					 else if(mapmonster[i][k] != ' ' && mapmonster[i][k] != '/' ) {
						 System.out.print( AsciiArt.ANSI_REDBACKGROUND  + mapmonster[i][k] + AsciiArt.ANSI_RESET);
					 }
					 else {
						 if (mapentity[i][k] == '/') {
								 System.out.print(AsciiArt.ANSI_PURPLEBACKGROUND + AsciiArt.ANSI_PURPLE + map[i][k] + AsciiArt.ANSI_RESET);
						 }
						 else if(map[i][k] == 'F') {
							 System.out.print(AsciiArt.ANSI_GREEN  + AsciiArt.ANSI_GREENBACKGROUND + map[i][k] + AsciiArt.ANSI_RESET);
						 }
						 else if(map[i][k] == 'X'){
							 System.out.print(AsciiArt.ANSI_WHITEBACKGROUND +  map[i][k] + AsciiArt.ANSI_RESET);
						 }
						 else{
							 System.out.print(map[i][k]);
						 }
					 }
				 }
				 System.out.print("\n");
			 }
		 
	//*****************************************************************************
	//******************************     INPUT     ********************************
	//*****************************************************************************
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
	        System.out.print("\n");
	        System.out.println("quel action voulez vous faire :");
	        System.out.println("- move");
	        System.out.println("- inventory");
	        System.out.println("- leave (for leave the game)");
	        System.out.println("- show map");
	        System.out.println("- map info");
	        System.out.println("- constant map on/off(map will be show after at each command");
	        String str = sc.nextLine();
	        
	//*****************************************************************************
	//*****************************     OUTPUT     ********************************
	//*****************************************************************************	
	        
	    	//*****************************************************************************
	    	//*****************************     LEAVE     *********************************
	    	//*****************************************************************************	

	        if (str.equals("leave")){
	        	System.out.println("fin de la partie");
	        	break;
	        }
	        
	        
	    	//*****************************************************************************
	    	//**************************     INVENTORY     ********************************
	    	//*****************************************************************************	

	        if (str.equals("inventory")){
	        	while(true) {
	        		inventory.OpenInventory(InvArme,InvArtefact,InvPotion);
	    			Scanner sc9 = new Scanner(System.in);
	    	        System.out.print("\n");
	    	        System.out.println("quel action voulez vous faire :");
	    	        System.out.println("leave");
	    	        System.out.print("\n");
	    	        String str9 = sc9.nextLine();
	    	        if(str9.equals("equip")) {
	    	        	
	    	        }
	    	        if(str9.equals("leave")) {
	    	        	break;
	    	        }
	        	}
	        }
	        
	        
	        
	    	//*****************************************************************************
	    	//*******************************     MAP     *********************************
	    	//*****************************************************************************	

	        if (str.equals("map info")){
	        	System.out.println("/ = fin de carte");
	        	System.out.println("X = mur");
	        	System.out.println("P = personnage");
	        	System.out.println("S = Slime (Monstre)");
	        }

	    	//*****************************************************************************
	    	//******************************     MOOVE     ********************************
	    	//*****************************************************************************
	        	
		    	//*****************************************************************************
		    	//********************************     UP     *********************************
		    	//*****************************************************************************
	        if((str.equals("Up") || str.equals("uP") || str.equals("up") || str.equals("UP"))
	        	|| (str.equals("Down") || str.equals("down") || str.equals("DOWN") || str.equals("DOwn"))
	        	|| (str.equals("Right") || str.equals("right") || str.equals("RIGHT") || str.equals("RIght"))
	        	|| (str.equals("Left") || str.equals("left") || str.equals("LEFT") || str.equals("LEft"))
	        	||  (str.equals("move"))){
	        	
	        		ReturnX = Hero1.getPosX();
	        		ReturnY = Hero1.getPosY();
	        	
	        	if (str.equals("Up") || str.equals("uP") || str.equals("up") || str.equals("UP"))  {
	        		if (map[Hero1.getPosY()-1][Hero1.getPosX()-1] == 'X' || map[Hero1.getPosY()-1][Hero1.getPosX()-1] == '/') {
	        			System.out.print("\n");
	        			System.out.print("A wall block your way");
	        			System.out.print("\n");}
	        		else {
		        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = ' ';
		        		Hero1.setPosY(Hero1.getPosY() - 1 );
		        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = 'P';}
	        	}
	        	
		    	//*****************************************************************************
		    	//*******************************     DOWN     ********************************
		    	//*****************************************************************************
	        	if (str.equals("Down") || str.equals("down") || str.equals("DOWN") || str.equals("DOwn")) {
	        		if (map[Hero1.getPosY()+1][Hero1.getPosX()-1] == 'X' || map[Hero1.getPosY()+1][Hero1.getPosX()-1] == '/') {
	        			System.out.print("\n");
	        			System.out.print("A wall block your way");
	        			System.out.print("\n");}
	        		else {
	        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = ' ';
	        		Hero1.setPosY(Hero1.getPosY() + 1 );
	        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = 'P';}
	        		
	        	}
	        	
	        	
		    	//*****************************************************************************
		    	//******************************     RIGHT     ********************************
		    	//*****************************************************************************
	        	if (str.equals("Right") || str.equals("right") || str.equals("RIGHT") || str.equals("RIght")) {
	        		if (map[Hero1.getPosY()][Hero1.getPosX()] == 'X' || map[Hero1.getPosY()][Hero1.getPosX()] == '/') {
	        			System.out.print("\n");
	        			System.out.print("A wall block your way");
	        			System.out.print("\n");}
	        		else {
	        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = ' ';
	        		Hero1.setPosX(Hero1.getPosX() + 1 );
	        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = 'P';}
	        	}
	        	
	        	
		    	//*****************************************************************************
		    	//*******************************     LEFT     ********************************
		    	//*****************************************************************************
	        	if (str.equals("Left") || str.equals("left") || str.equals("LEFT") || str.equals("LEft") ) {
	        		if (map[Hero1.getPosY()][Hero1.getPosX()-2] == 'X' || map[Hero1.getPosY()][Hero1.getPosX()-2] == '/') {
	        			System.out.print("\n");
	        			System.out.print("A wall block your way");
	        			System.out.print("\n");}
	        		else {
	        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = ' ';
	        		Hero1.setPosX(Hero1.getPosX() - 1 );
	        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = 'P';}
	        	}
	        	
		    	//*****************************************************************************
		    	//******************************     ELSE     *********************************
		    	//*****************************************************************************
				if (str.equals("move")) {
		        	System.out.println("Where do you want to go ?");
		        	System.out.println("Up");
		        	System.out.println("Down");
		        	System.out.println("Right");
		        	System.out.println("Left");
		        	System.out.println("cancel (return to menu of choose)");
					Scanner sc3 = new Scanner(System.in);
			        String str3 = sc.nextLine();
			        
		        	if (str3.equals("cancel")){break;}
		        	if (str.equals("cancel")){break;}
		        	
			    	//*****************************************************************************
			    	//********************************     UP     *********************************
			    	//*****************************************************************************
		        	if (str3.equals("Up") || str3.equals("uP") || str3.equals("up") || str3.equals("UP"))  {
		        		if (map[Hero1.getPosY()-1][Hero1.getPosX()-1] == 'X' || map[Hero1.getPosY()-1][Hero1.getPosX()-1] == '/') {
		        			System.out.print("\n");
		        			System.out.print("A wall block your way");
		        			System.out.print("\n");}
		        		else {
			        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = ' ';
			        		Hero1.setPosY(Hero1.getPosY() - 1 );
			        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = 'P';}
		        	}
		        	
			    	//*****************************************************************************
			    	//*******************************     DOWN     ********************************
			    	//*****************************************************************************
		        	if (str3.equals("Down") || str3.equals("down") || str3.equals("DOWN") || str3.equals("DOwn")) {
		        		if (map[Hero1.getPosY()+1][Hero1.getPosX()-1] == 'X' || map[Hero1.getPosY()+1][Hero1.getPosX()-1] == '/') {
		        			System.out.print("\n");
		        			System.out.print("A wall block your way");
		        			System.out.print("\n");}
		        		else {
			        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = ' ';
			        		Hero1.setPosY(Hero1.getPosY() + 1 );
			        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = 'P';}
		        	}
		        	
			    	//*****************************************************************************
			    	//******************************     RIGHT     ********************************
			    	//*****************************************************************************
		        	if (str3.equals("Right") || str3.equals("right") || str3.equals("RIGHT") || str3.equals("RIght")) {
		        		if (map[Hero1.getPosY()][Hero1.getPosX()] == 'X' || map[Hero1.getPosY()][Hero1.getPosX()] == '/') {
		        			System.out.print("\n");
		        			System.out.print("A wall block your way");
		        			System.out.print("\n");}
			        		else {
			        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = ' ';
			        		Hero1.setPosX(Hero1.getPosX() + 1 );
			        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = 'P';}
		        	}
		        	
			    	//*****************************************************************************
			    	//*******************************     LEFT     ********************************
			    	//*****************************************************************************
		        	if (str3.equals("Left") || str3.equals("left") || str3.equals("LEFT") || str3.equals("LEft") ) {
		        		if (map[Hero1.getPosY()][Hero1.getPosX()-2] == 'X' || map[Hero1.getPosY()][Hero1.getPosX()-2] == '/') {
		        			System.out.print("\n");
		        			System.out.print("A wall block your way");
		        			System.out.print("\n");}
		        		else {
			        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = ' ';
			        		Hero1.setPosX(Hero1.getPosX() - 1 );
			        		mapentity[Hero1.getPosY()][Hero1.getPosX()-1] = 'P';}
		        	}
		        	
				}//end if move
				
	        }//end of if all move
			
	 	}// end while
		 
	}// =end main

}//end Main
