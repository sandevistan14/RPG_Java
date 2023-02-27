//package
package jdr;

import java.util.Objects;
//import
import java.util.Scanner;
import Armor.ChestPlate;
import Armor.Helmet;
import Armor.Legging;
import Armor.boot;
import entity.inventaire;
import entity.Entity;
import entity.Hero;
import entity.Monster;
import objet.Arme;
import objet.Potion;
import objet.Artefact;
import objet.Objet;


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
		 
		 //objet
		 Objet[] Inv = new Objet[11];
			 Inv[0] = new Arme("Epeelongue","Arme",20,0);
			 Inv[1] = new Arme("Arc","Arme",15,0);
			 Inv[2] = new Arme("Massue","Arme",40,0);
			 Inv[3] = new Arme("baguette","Arme",30,0);
			 Inv[4] = new Arme("poignard","Arme",30,15);
			 Inv[5] = new Artefact("talissement de fortification","Artefact","Dommage",20);
			 Inv[6] = new Potion("Potion de soin","Potion",40);
			 Inv[7] = new boot("StandarBoot","Boot",5, 2, 0);
			 Inv[8] = new Helmet("StandarHelmet", "Helmet", 5, 2, 0);
			 Inv[9] = new ChestPlate("StandarChestPlate","ChestPlate", 5, 2, 0);
			 Inv[10] = new Legging("StandarLegging", "Legging", 5, 2, 0);
			 
		 //weapon
		 Objet[] InvArme = new Arme[2];
		 Arme[] EqiArme = new Arme[1];
		 
		 //Armor
		 boot[] EqiBoot = new boot[1];
		 Helmet[] EqiHelmet = new Helmet[1];
		 ChestPlate[] EqiChestPlate = new ChestPlate[1];
		 Legging[] EqiLegging = new Legging[1];
			
		//Artefact
		 Objet[] InvArtefact = new Artefact[3];
		
		//Potion
		 Objet[] InvPotion = new Potion[5];
		
			Monster[] TabMonsterForest = new Monster[5];
				int MonsterInForest = 0;
				TabMonsterForest[0] = new Monster('W', "WolfF1", 0, 0, 20, 80, 0,20,40);
				TabMonsterForest[1] = new Monster('S', "SlimeF1", 0, 0, 10, 40, 0,10,10);
				TabMonsterForest[2] = new Monster('W', "WolfF2", 0, 0, 20, 80, 0,20,40);
				TabMonsterForest[3] = new Monster('S', "SlimeF2", 0, 0, 10, 40, 0,10,10);
				TabMonsterForest[4] = new Monster('W', "WolfF3", 0, 0, 20, 80, 0,20,40);

			 
		 Monster[] TabMonster = new Monster[4];
			 TabMonster[0] = new Monster('S', "Slime1", 26, 15, 10, 40, 0,10,0);
			 TabMonster[1] = new Monster('D', "Dragon1", 21, 15, 40, 200, 50,100,30);
			 TabMonster[2] = new Monster('M', "Mother of dead", 20, 15, 100, 1000, 200,999999,0);
			 TabMonster[3] = new Monster('W', "Wolf", 27, 15, 20, 80, 10,20,40);
			 
		 Hero Hero1 = new Hero('P',"",28,15,0,0,0,0,0,0);
		 
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
		 

	        Hero.SetHeroClass(Hero1);//Set Hero Class
	                
	        Text.text_intro(); //Introduction text
	        
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
			 else if(xpfight > 0) {
				Objet dropp = Objet.drop(Inv);
		        System.out.print("\n");
		        System.out.print(AsciiArt.ANSI_YELLOW + "il s'emblerait que le monstre est drop un objet : "+  dropp.getName() + AsciiArt.ANSI_RESET);
		        System.out.print("\n");
		        Thread.sleep(3000);
		        while(true) {
					Scanner scan = new Scanner(System.in);
			        System.out.print("\n");
			        System.out.print("What do you want to do ?");
			        System.out.print("\n- Equip \n- Put into the inventory \n- Ignor(will delet the object)");
			        System.out.print("\n");
			        String strdrop = scan.nextLine();
			        if(strdrop.equals("Ignor")) {
			        	break;
			        }
			        else if(strdrop.equals("Put into the inventory")) {
			        	if(dropp.getType().equals("Arme")) {
			        		int[] tabint;
				        	InvArme = inventaire.AddIntoInv(InvArme,dropp);
				        	break;
			        	}
			        	else if(dropp.getType().equals("Potion")) {
			        		InvPotion = inventaire.AddIntoInv(InvPotion,dropp);
			        		break;
			        	}
			        	else if(dropp.getType().equals("Artefact")) {
				        	InvArtefact = inventaire.AddIntoInv(InvArtefact,dropp);
				        	break;
			        	}
			        	else {
					        System.out.println("You can't put this object into your inventory");
			        	}
			        }
			        
			        else if(strdrop.equals("Equip")) {
			        	while(true) {
				        	if(dropp.getType().equals("Arme")) {
				        		if (Objects.isNull(EqiArme[0])){
				        			System.out.println("You equip " + dropp.getName());
				        			EqiArme[0] = (Arme) dropp;
				        			break;
				        		}
				        		else {
					        		System.out.println("Are you sur to extchange "+ EqiArme[0].getName() +" with " + dropp.getName());
					        		String streqip = scan.nextLine();
					        		
					        		if(streqip.equals("Yes")) {
					        			EqiArme = (Arme[]) inventaire.EquipObjet(EqiArme,dropp,0);
					        			break;
					        		}
					        		else if(streqip.equals("Yes")) {
					        			break;
					        		}
						        	else {
						        		System.out.println("You can't equip this");
						        		break;
						        	}
				        		}
				        	}
				        	if(dropp.getType().equals("Boot")) {
				        		if (Objects.isNull(EqiBoot[0])){
				        			System.out.println("You equip " + dropp.getName());
				        			EqiBoot[0] = (boot) dropp;
				        			break;
				        		}
				        		else {
					        		System.out.println("Are you sur to extchange "+ EqiBoot[0].getName() +" with " + dropp.getName());
					        		String streqip = scan.nextLine();
					        		
					        		if(streqip.equals("Yes")) {
					        			EqiBoot = (boot[]) inventaire.EquipObjet(EqiBoot,dropp,0);
					        			break;
					        		}
					        		else if(streqip.equals("Yes")) {
					        			break;
					        		}
						        	else {
						        		System.out.println("You can't equip this");
						        		break;
						        	}
				        		}
				        	}
				        	if(dropp.getType().equals("ChestPlate")) {
				        		if (Objects.isNull(EqiChestPlate[0])){
				        			System.out.println("You equip " + dropp.getName());
				        			EqiChestPlate[0] = (ChestPlate) dropp;
				        			break;
				        		}
				        		else {
					        		System.out.println("Are you sur to extchange "+ EqiChestPlate[0].getName() +" with " + dropp.getName());
					        		String streqip = scan.nextLine();
					        		
					        		if(streqip.equals("Yes")) {
					        			EqiChestPlate = (ChestPlate[]) inventaire.EquipObjet(EqiChestPlate,dropp,0);
					        			break;
					        		}
					        		else if(streqip.equals("Yes")) {
					        			break;
					        		}
						        	else {
						        		System.out.println("You can't equip this");
						        		break;
						        	}
				        		}
				        	}
				        	if(dropp.getType().equals("Helmet")) {
				        		if (Objects.isNull(EqiHelmet[0])){
				        			System.out.println("You equip " + dropp.getName());
				        			EqiHelmet[0] = (Helmet) dropp;
				        			break;
				        		}
				        		else {
					        		System.out.println("Are you sur to extchange "+ EqiHelmet[0].getName() +" with " + dropp.getName());
					        		String streqip = scan.nextLine();
					        		
					        		if(streqip.equals("Yes")) {
					        			EqiHelmet = (Helmet[]) inventaire.EquipObjet(EqiArme,dropp,0);
					        			break;
					        		}
					        		else if(streqip.equals("Yes")) {
					        			break;
					        		}
						        	else {
						        		System.out.println("You can't equip this");
						        		break;
						        	}
				        		}
				        	}
				        	if(dropp.getType().equals("Legging")) {
				        		if (Objects.isNull(EqiLegging[0])){
				        			System.out.println("You equip " + dropp.getName());
				        			EqiLegging[0] = (Legging) dropp;
				        			break;
				        		}
				        		else {
					        		System.out.println("Are you sur to extchange "+ EqiLegging[0].getName() +" with " + dropp.getName());
					        		String streqip = scan.nextLine();
					        		
					        		if(streqip.equals("Yes")) {
					        			EqiLegging = (Legging[]) inventaire.EquipObjet(EqiLegging,dropp,0);
					        			break;
					        		}
					        		else if(streqip.equals("Yes")) {
					        			break;
					        		}
						        	else {
						        		System.out.println("You can't equip this");
						        		break;
						        	}
				        		}
				        	}
				  
				        		
				        	
			        	}
			        	break;
			        }
		        }
		        
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
			 
			Map.PrintMap(map, mapentity, mapmonster);
		 
	//*****************************************************************************
	//******************************     INPUT     ********************************
	//*****************************************************************************
			String action = Text.ActionList();
	        
	        
	//*****************************************************************************
	//*****************************     OUTPUT     ********************************
	//*****************************************************************************	
	        
	    	//*****************************************************************************
	    	//*****************************     LEAVE     *********************************
	    	//*****************************************************************************	

	        if (action.equals("leave")){
	        	System.out.println("fin de la partie");
	        	break;
	        }
	        
	        
	    	//*****************************************************************************
	    	//**************************     INVENTORY     ********************************
	    	//*****************************************************************************	

	        if (action.equals("inventory")){
	        		inventory.OpenInventory(InvArme,EqiArme,InvArtefact,InvPotion);
	        }
	        
	        
	        
	    	//*****************************************************************************
	    	//*******************************     MAP     *********************************
	    	//*****************************************************************************	

	        if (action.equals("map info")){
	        	System.out.println("/ = fin de carte");
	        	System.out.println("White = Wall");
	        	System.out.println("Green = forest");
	        	System.out.println("P = personnage");
	        	System.out.println("S = Slime (Monstre)");
	        }
	        
			//*****************************************************************************
	    	//******************************     MOOVE     ********************************
	    	//*****************************************************************************
	        mapentity = Move.MoveHero(mapentity, map, action, Hero1);
			
	 	}// end while
		 
	}// =end main

}//end Main