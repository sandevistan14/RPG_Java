//package
package jdr;

import java.io.IOException;
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
		 
		 //objet
		 Objet[] CommunLoot = new Objet[12];
		 CommunLoot[0] = new Arme("Epeelongue","Arme",20,1);
		 CommunLoot[1] = new Arme("Arc","Arme",15,1);
		 CommunLoot[2] = new Arme("Massue","Arme",25,1);
		 CommunLoot[3] = new Arme("baguette","Arme",20,1);
		 CommunLoot[4] = new Arme("poignard","Arme",15,5);
		 CommunLoot[5] = new Artefact("talissement de fortification","Artefact","Dommage",20);
		 CommunLoot[6] = new Potion("Petite Potion de soin","Potion",20);
		 CommunLoot[7] = new Potion("Moyenne Potion de soin","Potion",40);
		 CommunLoot[8] = new boot("StandarBoot","Boot",0, 10, 0);
		 CommunLoot[9] = new Helmet("StandarHelmet", "Helmet", 0, 10, 0);
		 CommunLoot[10] = new ChestPlate("StandarChestPlate","ChestPlate", 0, 20, 0);
		 CommunLoot[11] = new Legging("StandarLegging", "Legging", 0, 10, 0);
		 
		//objet
		 Objet[] RareLoot = new Objet[1];
		 RareLoot[0] = new Arme("Epee du vide","Arme",40,5);
			 
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
				TabMonsterForest[10] = new Monster('D', "Dragon1", 21, 15, 40, 200, 50,100,30);



			 
		 Monster[] TabMonster = new Monster[4];
			 TabMonster[0] = new Monster('S', "Slime1", 26, 15, 10, 40, 0,10,0);
			 TabMonster[1] = new Monster('D', "Dragon1", 21, 15, 40, 200, 50,100,30);
			 TabMonster[2] = new Monster('M', "Mother of dead", 20, 15, 100, 1000, 200,999999,0);
			 TabMonster[3] = new Monster('W', "Wolf", 27, 15, 20, 80, 10,20,40);
			 
		 Hero Hero1 = new Hero('P',"",28,15,0,0,0,0,0,0,0);
		 
		 //inventory
		 inventaire inventory = new inventaire(null, 0, null, 0, null, 0);
		 
		//Flee
		 Hero1.setReturnX(Hero1.getPosX());
		 Hero1.setReturnY(Hero1.getPosY());

	        Hero.SetHeroClass(Hero1);//Set Hero Class
	                
	        Text.text_intro(); //Introduction text
	        
	        // check if Helmet is null or not and if it's null send empty
	     	for(int i = 0;i < EqiHelmet.length; i += 1) {if (Objects.isNull(EqiHelmet[i])) {EqiHelmet[i] = new Helmet("vide", "vide", 0, 0, 0); }}
	     			
	     	// check if Boot is null or not and if it's null send empty
			for(int i = 0;i < EqiBoot.length; i += 1) {if (Objects.isNull(EqiBoot[i])) {EqiBoot[i] = new boot("vide", "vide", 0, 0, 0); }}
			
			// check if ChestPlate is null or not and if it's null send empty
			for(int i = 0;i < EqiChestPlate.length; i += 1) {if (Objects.isNull(EqiChestPlate[i])) {EqiChestPlate[i] = new ChestPlate("vide", "vide", 0, 0, 0); }}
			
			// check if Legging is null or not and if it's null send empty
			for(int i = 0;i < EqiLegging.length; i += 1) {if (Objects.isNull(EqiLegging[i])) {EqiLegging[i] = new Legging("vide", "vide", 0, 0, 0); }}
	    	
			// check if EqiArme is null or not and if it's null send empty
			for(int i = 0;i < EqiArme.length; i += 1) {if (Objects.isNull(EqiArme[i])) {EqiArme[i] = new Arme("vide", "vide", 0, 0); }}
	    	
			// check if Arme is null or not and if it's null send empty
			for(int i = 0;i < InvArme.length; i += 1) {if (Objects.isNull(InvArme[i])) {InvArme[i] = new Arme("vide", "vide", 0, 0); }}
			
			// check if Artefact is null or not and if it's null send empty
			for(int i = 0;i < InvArtefact.length; i += 1) {if (Objects.isNull(InvArtefact[i])) {InvArtefact[i] = new Artefact("vide", "vide", "vide", 0); }}
			
			// check if Potion is null or not and if it's null send empty
			for(int i = 0;i < InvPotion.length; i += 1) {if (Objects.isNull(InvPotion[i])) {InvPotion[i] = new Potion("vide", "vide", 0); }}
			
//*****************************************************************************
//******************************     WHILE     ********************************
//*****************************************************************************
		 while (true){	
			 Runtime.getRuntime().exec("cls");
	        System.out.print("\033[H\033[2J");
	        System.out.flush();
			//*****************************************************************************
			//******************************     CHEST     ********************************
			//*****************************************************************************
			 
			 if(map[Hero1.getPosY()][Hero1.getPosX()-1] == 'C') {
				 if(!(Map.CheckAround(Hero1, mapmonster))) {
					 System.out.println("Vous ouvrez le coffre et gagnez 5xp");
					 xpfight = 5;
					 map[Hero1.getPosY()][Hero1.getPosX()-1] = '.';
				 }
				 else {
					 System.out.println("Vous ne pouvez pas ouvrir le coffre il y a un enemie autour");
				 }
			 }
			 else if(map[Hero1.getPosY()][Hero1.getPosX()-1] == 'G') {
				 if(!(Map.CheckAround(Hero1, mapmonster))) {
					 System.out.println("Vous ouvrez le Giga coffre et gagnez 8xp");
					 xpfight = 8;
					 map[Hero1.getPosY()][Hero1.getPosX()-1] = '.';
				 }
				 else {
					 System.out.println("Vous ne pouvez pas ouvrir le Giga coffre il y a un enemie autour");
				 }
			 }
				 
	//*****************************************************************************
	//******************************     FIGHT     ********************************
	//*****************************************************************************
			 
			 if (MonsterInForest < 11 && map[Hero1.getPosY()][Hero1.getPosX()-1] == 'F') {
				 double rand = Math.random()*100;
				 if(rand >= 80) {
					 xpfight = -50;
					 xpfight = Fight.fight(Hero1, TabMonster[MonsterInForest], xpfight, mapmonster, InvArme, EqiArme, EqiBoot, EqiHelmet, EqiChestPlate, EqiLegging, InvArtefact, InvPotion);
					 MonsterInForest += 1;
				 }
			 }
			 for(int i = 0;i < TabMonster.length; i += 1) {
				 if(TabMonster[i].getPosX() == Hero1.getPosX() && TabMonster[i].getPosY() == Hero1.getPosY()) {
					 xpfight = Fight.fight(Hero1, TabMonster[i], xpfight, mapmonster, InvArme, EqiArme, EqiBoot, EqiHelmet, EqiChestPlate, EqiLegging, InvArtefact, InvPotion);
					 if(xpfight == 0) {
						 mapentity[Hero1.getPosY()][Hero1.getPosX() - 1] = ' ';
						 Hero1.setPosX(Hero1.getReturnX());
						 Hero1.setPosY(Hero1.getReturnY());
						 mapentity[Hero1.getPosY()][Hero1.getPosX() - 1] = 'P';
						 break;
					 }
				 }
			 }
			 
			 if(xpfight == -69) {
				 break;
			 }
			 else if(xpfight > 0) {
				Objet dropp = Objet.drop(CommunLoot);
				if(xpfight == 5) {
			        System.out.print("\n");
			        System.out.print(AsciiArt.ANSI_YELLOW + "You found an object into the chest : "+  dropp.getName() + AsciiArt.ANSI_RESET);
			        System.out.print("\n");
				}
				else if(xpfight == 8) {
					dropp = Objet.drop(RareLoot);
			        System.out.print("\n");
			        System.out.print(AsciiArt.ANSI_YELLOW + "You found an object into the rare chest : "+  dropp.getName() + AsciiArt.ANSI_RESET);
			        System.out.print("\n");
				}
				else {
			        System.out.print("\n");
			        System.out.print(AsciiArt.ANSI_YELLOW + "il s'emblerait que le monstre est drop un objet : "+  dropp.getName() + AsciiArt.ANSI_RESET);
			        System.out.print("\n");
				}
		        Thread.sleep(3000);
				int breaker = 0;
		        while(true) {
					@SuppressWarnings("resource")
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
				        	InvArme = (Arme[]) inventaire.AddIntoInv(InvArme,dropp);
				        	break;
			        	}
			        	else if(dropp.getType().equals("Potion")) {
			        		InvPotion = (Potion[]) inventaire.AddIntoInv(InvPotion,dropp);
			        		break;
			        	}
			        	else if(dropp.getType().equals("Artefact")) {
				        	InvArtefact = (Artefact[]) inventaire.AddIntoInv(InvArtefact,dropp);
				        	break;
			        	}
			        	else {
					        System.out.println("You can't put this object into your inventory");
			        	}
			        }
			        else if(strdrop.equals("Equip")) {
			        	while(true) {
				        	if(dropp.getType().equals("Arme")) {
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
				        	else if(dropp.getType().equals("Boot")) {
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
				        	else if(dropp.getType().equals("ChestPlate")) {
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
				        	else if(dropp.getType().equals("Helmet")) {
				        		if ((EqiHelmet[0].getName() == "vide")){
				        			System.out.println("You equip " + dropp.getName());
				        			EqiHelmet[0] = (Helmet) dropp;
				        			break;
				        		}
				        		else {
					        			EqiHelmet = (Helmet[]) inventaire.EquipObjet(EqiArme,dropp,0);
					        			break;
				        		}
				        	}
				        	else if(dropp.getType().equals("Legging")) {
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
	        	System.out.println("end of game");
	        	break;
	        }
	        
	        
	    	//*****************************************************************************
	    	//**************************     INVENTORY     ********************************
	    	//*****************************************************************************	

	        else if (action.equals("inventory")){
	        		inventaire.OpenInventory(Hero1, InvArme,EqiArme, EqiBoot, EqiHelmet, EqiChestPlate, EqiLegging, InvArtefact, InvPotion);
	        }
	        
	        
	        
	    	//*****************************************************************************
	    	//*******************************     MAP     *********************************
	    	//*****************************************************************************	

	        else if (action.equals("map info")){
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