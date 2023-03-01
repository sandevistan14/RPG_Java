//package
package jdr;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
// Game Made By sandevistan14
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
	
	
	public static void GameTrun() throws InterruptedException, IOException {	

		//*****************************************************************************
		//**************************     Initialization     ***************************
		//*****************************************************************************
		//map
		 char[][] mapentity = null;mapentity = Map.MapEntity(mapentity);
		 char[][] map = null;map = Map.Map(map);
		 char[][] mapmonster = null;mapmonster = Map.MapMonster(mapmonster);
		 
		 //level system
		 int xp = 0;
		 int xpfight = 0;
		 int xpreq = 40;
		 int level = 1;
		 
		 //Commun objet
		 Objet[] CommunLoot = Objet.CommunItem();
		 
		//rare objet
		 Objet[] RareLoot = Objet.RareItem();
		 
		 //epic objet
		 Objet[] EpicLoot = Objet.EpicItem();
		 
		 //legendary objet
		 Objet[] LegendaryLoot = Objet.LegendaryItem();
		 
		 //weapon
		 Arme[] InvArme = new Arme[2];
		 Arme[] EqiArme = new Arme[1];
		 
		 //Armor
		 boot[] EqiBoot = new boot[1];
		 Helmet[] EqiHelmet = new Helmet[1];
		 ChestPlate[] EqiChestPlate = new ChestPlate[1];
		 Legging[] EqiLegging = new Legging[1];
			
		//Artefact
		 Artefact[] InvArtefact = new Artefact[3];
		
		//Potion
		 Potion[] InvPotion = new Potion[5];
		
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


		 ArrayList<Monster> TabMonster = Monster.CreateMonster(mapmonster);
				 
		 Hero Hero1 = new Hero('P',"",28,15,0,0,0,0,0,0,0);
		 
		 //inventory
		 inventaire inventory = new inventaire(null, 0, null, 0, null, 0);
		 
		//Flee
		 Hero1.setReturnX(Hero1.getPosX());
		 Hero1.setReturnY(Hero1.getPosY());

	        Hero.SetHeroClass(Hero1);//Set Hero Class
	                
	        Text.text_intro(); //Introduction text
	        
	        // check if Helmet is null or not and if it's null send empty
	     	for(int i = 0;i < EqiHelmet.length; i += 1) {if (Objects.isNull(EqiHelmet[i])) {EqiHelmet[i] = new Helmet("vide", "vide","\u001B[37m", 0, 0, 0); }}
	     			
	     	// check if Boot is null or not and if it's null send empty
			for(int i = 0;i < EqiBoot.length; i += 1) {if (Objects.isNull(EqiBoot[i])) {EqiBoot[i] = new boot("vide", "vide","\u001B[37m", 0, 0, 0); }}
			
			// check if ChestPlate is null or not and if it's null send empty
			for(int i = 0;i < EqiChestPlate.length; i += 1) {if (Objects.isNull(EqiChestPlate[i])) {EqiChestPlate[i] = new ChestPlate("vide", "vide","\u001B[37m", 0, 0, 0); }}
			
			// check if Legging is null or not and if it's null send empty
			for(int i = 0;i < EqiLegging.length; i += 1) {if (Objects.isNull(EqiLegging[i])) {EqiLegging[i] = new Legging("vide", "vide","\u001B[37m", 0, 0, 0); }}
	    	
			// check if EqiArme is null or not and if it's null send empty
			for(int i = 0;i < EqiArme.length; i += 1) {if (Objects.isNull(EqiArme[i])) {EqiArme[i] = new Arme("vide", "vide","\u001B[37m", 0, 0); }}
	    	
			// check if Arme is null or not and if it's null send empty
			for(int i = 0;i < InvArme.length; i += 1) {if (Objects.isNull(InvArme[i])) {InvArme[i] = new Arme("vide", "vide","\u001B[37m", 0, 0); }}
			
			// check if Artefact is null or not and if it's null send empty
			for(int i = 0;i < InvArtefact.length; i += 1) {if (Objects.isNull(InvArtefact[i])) {InvArtefact[i] = new Artefact("vide", "vide","\u001B[37m", "vide", 0); }}
			
			// check if Potion is null or not and if it's null send empty
			for(int i = 0;i < InvPotion.length; i += 1) {if (Objects.isNull(InvPotion[i])) {InvPotion[i] = new Potion("vide", "vide","\u001B[37m", 0); }}
			
//*****************************************************************************
//******************************     WHILE     ********************************
//*****************************************************************************
		 while (true){	
			 
			 //clear screen doesn't work
			 System.out.print(AsciiArt.ANSI_SCREENRESET);
			 System.out.flush();  
			 
			//*****************************************************************************
			//*****************************     FINISH     ********************************
			//*****************************************************************************
			 if(map[Hero1.getPosY()][Hero1.getPosX()-1] == 'E') {
				 AsciiArt.DanceFortnite();
				 Text.WIN();
				 break;
			 }
			 
			//*****************************************************************************
			//******************************     CHEST     ********************************
			//*****************************************************************************
			 
			 if(map[Hero1.getPosY()][Hero1.getPosX()-1] == 'C') {
				 if((Map.checkSurroundings(Hero1, mapmonster))) {
					 System.out.println("Vous ouvrez le coffre et gagnez 5xp");
					 xpfight = 5;
					 map[Hero1.getPosY()][Hero1.getPosX()-1] = '.';
				 }
				 else {
					 System.out.println("You can't open the chest there is an enemie around");
				 }
			 }
			 else if(map[Hero1.getPosY()][Hero1.getPosX()-1] == 'G') {
				 if((Map.checkSurroundings(Hero1, mapmonster))) {
					 System.out.println("You open a Giga coffre and earn 8xp");
					 xpfight = 8;
					 map[Hero1.getPosY()][Hero1.getPosX()-1] = '.';
				 }
				 else {
					 System.out.println("You can't open the chest there is an enemie around");
				 }
			 }
				 
	//*****************************************************************************
	//******************************     FIGHT     ********************************
	//*****************************************************************************
			 
			 if (MonsterInForest < 11 && map[Hero1.getPosY()][Hero1.getPosX()-1] == 'F') {
				 double rand = Math.random()*100;
				 if(rand >= 80) {
					 xpfight = -50;
					 xpfight = Fight.fight(Hero1, TabMonsterForest[MonsterInForest], xpfight, mapmonster, InvArme, EqiArme, EqiBoot, EqiHelmet, EqiChestPlate, EqiLegging, InvArtefact, InvPotion);
					 MonsterInForest += 1;
				 }
			 }
			 for(int i = 0;i < TabMonster.size(); i += 1) {
				 if(TabMonster.get(i).getPosX() == Hero1.getPosX()-1 && TabMonster.get(i).getPosY() == Hero1.getPosY()) {
					 xpfight = Fight.fight(Hero1, TabMonster.get(i), xpfight, mapmonster, InvArme, EqiArme, EqiBoot, EqiHelmet, EqiChestPlate, EqiLegging, InvArtefact, InvPotion);
					 if(xpfight == 0) {
						 mapentity[Hero1.getPosY()][Hero1.getPosX() - 1] = ' ';
						 Hero1.setPosX(Hero1.getReturnX());
						 Hero1.setPosY(Hero1.getReturnY());
						 mapentity[Hero1.getPosY()][Hero1.getPosX() - 1] = 'P';
						 break;
					 }
				 }
			 }
			 Objet dropp;
			 dropp = Objet.drop(CommunLoot);
			 double rand2 = Math.random()*100;
			 if(rand2 > 70) {
				 dropp = Objet.drop(RareLoot);
			 }
			 
			 if(xpfight == -69) {
				 break;
			 }
			 
			 if(xpfight > 0) {
				 if(xpfight >70 || xpfight == 8) {
					 System.out.print("\n");
					 double rand3 = Math.random()*100;
					 if(rand3 > 70) {
						 dropp = Objet.drop(LegendaryLoot);
					 }
					 else {
						 dropp = Objet.drop(EpicLoot);	
					 }
				 }

				if(xpfight == 5) {
			        System.out.print("\n");
			        System.out.print(AsciiArt.ANSI_YELLOW + "You found an item into the chest : " + AsciiArt.ANSI_RESET + dropp.getRarity() + dropp.getName() + AsciiArt.ANSI_RESET);
			        System.out.print("\n");
				}
				else if(xpfight == 8) {
			        System.out.print("\n");
			        System.out.print(AsciiArt.ANSI_YELLOW + "You found an item into the rare chest : "+ AsciiArt.ANSI_RESET + dropp.getRarity() +  dropp.getName() + AsciiArt.ANSI_RESET);
			        System.out.print("\n");
				}
				else {
			        System.out.print("\n");
			        System.out.print(AsciiArt.ANSI_YELLOW + "it look like the monster drop an item : "+ AsciiArt.ANSI_RESET + dropp.getRarity() +  dropp.getName() + AsciiArt.ANSI_RESET);
			        System.out.print("\n");
				}
		        Thread.sleep(3000);
				int breaker = 0;
		        while(true) {
					@SuppressWarnings("resource")
					Scanner scan = new Scanner(System.in);
			        System.out.print("\n");
			        System.out.print("What do you want to do ?");
			        System.out.print("\n- Equip(1) \n- Put into the inventory(2) \n- Ignor(will delet the object)(3)");
			        System.out.print("\n");
			        String strdrop = scan.nextLine();
			        if(strdrop.equalsIgnoreCase("Ignor") || strdrop.equalsIgnoreCase("3")) {
			        	break;
			        }
			        else if(strdrop.equalsIgnoreCase("Put into the inventory") || (strdrop.equalsIgnoreCase("2"))) {
			        	if(dropp.getType().equalsIgnoreCase("Arme")) {
				        	InvArme = (Arme[]) inventaire.AddIntoInv(InvArme,dropp);
				        	break;
			        	}
			        	else if(dropp.getType().equalsIgnoreCase("Potion")) {
			        		InvPotion = (Potion[]) inventaire.AddIntoInv(InvPotion,dropp);
			        		break;
			        	}
			        	else if(dropp.getType().equalsIgnoreCase("Artefact")) {
				        	InvArtefact = (Artefact[]) inventaire.AddIntoInv(InvArtefact,dropp);
				        	break;
			        	}
			        	else {
					        System.out.println("You can't put this object into your inventory");
			        	}
			        }
			        else if(strdrop.equalsIgnoreCase("Equip")|| (strdrop.equalsIgnoreCase("1"))) {
			        	while(true) {
				        	if(dropp.getType().equalsIgnoreCase("Arme")) {
				        		if ((EqiArme[0].getName() == "vide")){
				        			System.out.println("You equip " + dropp.getName());
				        			EqiArme[0] = (Arme) dropp;
				        			break;
				        		}
				        		else {
					        			EqiArme = (Arme[]) inventaire.EquipObjet(EqiArme,dropp,0);
					        			break;
				        		}
				        	}
				        	else if(dropp.getType().equalsIgnoreCase("Boot")) {
				        		if ((EqiBoot[0].getName() == "vide")){
				        			System.out.println("You equip " + dropp.getName());
				        			EqiBoot[0] = (boot) dropp;
				        			break;
				        		}
				        		else {					        		
					        			EqiBoot = (boot[]) inventaire.EquipObjet(EqiBoot,dropp,0);
					        			break;
				        		}
				        	}
				        	else if(dropp.getType().equalsIgnoreCase("ChestPlate")) {
				        		if ((EqiChestPlate[0].getName() == "vide")){
				        			System.out.println("You equip " + dropp.getName());
				        			EqiChestPlate[0] = (ChestPlate) dropp;
				        			break;
				        		}
				        		else {
					        			EqiChestPlate = (ChestPlate[]) inventaire.EquipObjet(EqiChestPlate,dropp,0);
					        			break;
				        		}
				        	}
				        	else if(dropp.getType().equalsIgnoreCase("Helmet")) {
				        		if ((EqiHelmet[0].getName() == "vide")){
				        			System.out.println("You equip " + dropp.getName());
				        			EqiHelmet[0] = (Helmet) dropp;
				        			break;
				        		}
				        		else {
					        			EqiHelmet = (Helmet[]) inventaire.EquipObjet(EqiHelmet,dropp,0);
					        			break;
				        		}
				        	}
				        	else if(dropp.getType().equalsIgnoreCase("Legging")) {
				        		if ((EqiLegging[0].getName() == "vide")){
				        			System.out.println("You equip " + dropp.getName());
				        			EqiLegging[0] = (Legging) dropp;
				        			break;
				        		}
				        		else {
					        			EqiLegging = (Legging[]) inventaire.EquipObjet(EqiLegging,dropp,0);
					        			break;
				        		}
				        	}
				        	else {
				        		System.out.println("You can't equip this");
				        		breaker = 1;
				        		break;
				        	}
			        	}
			        	if (breaker == 0) {	break;}
			        }
		        }
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
				 Hero1.setLife(Hero1.getLife()+10);
				 Hero1.setMaxHP(Hero1.getMaxHP()+10);
				 Hero1.setDommage(Hero1.getDommage()+5);
				 Hero1.setDefense(Hero1.getDefense()+5);
				 System.out.print("\n");
				 System.out.print("\n");
				 System.out.print(AsciiArt.ANSI_YELLOW + "Congrats level UP ! Your now level :");
				 System.out.print(level);
				 System.out.print("\n");
				 System.out.print("+10 HP, +10 MaxHp , +10 Dommage, +5 Defense");
				 System.out.print("\n" + AsciiArt.ANSI_RESET);
				 Thread.sleep(4000);//sleep
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

	        if (action.equalsIgnoreCase("leave")){
	        	System.out.println("end of game");
	        	break;
	        }
	        
	        
	    	//*****************************************************************************
	    	//**************************     INVENTORY     ********************************
	    	//*****************************************************************************	

	        else if (action.equalsIgnoreCase("inventory")){
	        		inventaire.OpenInventory(Hero1, InvArme,EqiArme, EqiBoot, EqiHelmet, EqiChestPlate, EqiLegging, InvArtefact, InvPotion);
	        }
	        
	        
	        
	    	//*****************************************************************************
	    	//*******************************     MAP     *********************************
	    	//*****************************************************************************	

	        else if (action.equalsIgnoreCase("map info")){
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