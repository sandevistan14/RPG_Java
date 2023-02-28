package jdr;

import java.util.Scanner;

import Armor.ChestPlate;
import Armor.Helmet;
import Armor.Legging;
import Armor.boot;
import entity.Hero;
import entity.Monster;
import entity.inventaire;
import objet.Arme;
import objet.Artefact;
import objet.Objet;
import objet.Potion;

public class Fight{
	
	public static int fight(Hero Hero1,Monster monster,int xp,char[][] mapmonster,Arme[] InvArme, Arme[] EqiArme,boot[] EqiBoot,Helmet[] EqiHelmet,ChestPlate[] EqiChestPlate,Legging[] EqiLegging,Artefact[] InvArtefact,Potion[] InvPotion) throws InterruptedException {
		
		
		boolean Flee = true; // for FLee
		 if(xp == -50) {Flee = false;} //to know that the player can't Flee
		 
		 //text
		 char premierCaractere = Text.StartFightMessage(monster);
		 
		 //speed
		 boolean speed = false;
		 if(monster.getSpeed() > Hero1.getSpeed()){speed = true;}
		 
		 //for the speed
		 if(speed == true) {
			 
			 int DefHero1 = Hero1.getDefense() + EqiBoot[0].getBonusDefense()+EqiChestPlate[0].getBonusDefense() + EqiHelmet[0].getBonusDefense() + EqiLegging[0].getBonusDefense();
			 int MonsterDommage = monster.getDommage()- (DefHero1/10);
			 
			 speed = false;
			 System.out.print("\n");
			 System.out.println("The Monster Have more speed than you so he attack in first !");
			 System.out.print("\n");
			 System.out.println("The "+ monster.getName() +" attack you and inflict you "+ MonsterDommage +" dommages");
			 System.out.print("\n");
			 Hero1.setLife(Hero1.getLife() - MonsterDommage);
			 Thread.sleep(2000);}
		 else {
			 System.out.println("\n");
			 System.out.print("You have more speed than the Monster so you attack in first !");
			 System.out.println("\n");}
		 
		 // While fight
		 while(true) {

			 // boolean to know if you have attacked
			 boolean act = false;
			 
			 // if you kill the monster 
			 if (monster.getLife() < 1) {
				 System.out.print("\n");
				 System.out.print("Congrats you kill the monster !");
				 System.out.print("\n");
				 System.out.print("You earn "+ monster.getXp()+" xp !");
				 System.out.print("\n");
				 System.out.print("\n");
				 monster.setPosX(0); monster.setPosY(0); //bug correction for not fight a dead Monster
				 Thread.sleep(4000);//sleep
				 xp = monster.getXp();//get Xp from monster
				 mapmonster[Hero1.getPosY()][Hero1.getPosX()-1] = ' ';// erase the monster on the map
				 break;
			 }
			 if(premierCaractere == 'M') {AsciiArt.PrintMotherOfDeath(monster);}
			 if(premierCaractere == 'D') {AsciiArt.PrintRedEyesDragon(monster);}
			 if(premierCaractere == 'W') {AsciiArt.PrintWolf(monster);}
			 if(premierCaractere == 'S') {double num = Math.random()*100;
				 if(num > 90) {AsciiArt.PrintMiddleFinger(monster);}
				 if(num <= 90) {AsciiArt.PrintSlime(monster);}}
			 
			 
			 AsciiArt.PrintAction(Hero1,Flee);//show possible actions
			 
			 //if you get kill : Game Over
			 if (Hero1.getLife() < 1) {
				 AsciiArt.PrintDead();
				 xp = -69;// to know that you have been killed in the return
		         break;}
			 
			 //print the sprite 

			 @SuppressWarnings("resource")
			 Scanner sc4 = new Scanner(System.in);
			 String str4 = sc4.nextLine();
			 

			 
			 if(str4.equals("Inv")){
				 inventaire.OpenInventory(Hero1, InvArme,EqiArme, EqiBoot, EqiHelmet, EqiChestPlate, EqiLegging, InvArtefact, InvPotion);
			 }
			 
			 else if(str4.equals("Attack")) {//if Attack
				 int HeroDommage = (Hero1.getDommage() + EqiArme[0].getBonusDommage()) - (monster.getDefense()/10);
				 
				 Hero1.setLife(EqiArme[0].getDrainOfLife()+Hero1.getLife());
				 if(Hero1.getLife()>Hero1.getMaxHP()) {
					 Hero1.setLife(Hero1.getMaxHP());
				 }			 
				 
				 monster.setLife(monster.getLife()- (HeroDommage));
				 System.out.print("\n");
				 System.out.print("You attack "+ monster.getName() +" and inflict "+ HeroDommage +" dommages");
				 System.out.print("\n");
				 act = true;
			 }
			 
			 else if(str4.equals("Flee") && Flee == true) {xp = 0;break;}//if Flee if possible
			 
			 
			 //monster Attack
			 int DefHero = Hero1.getDefense() + EqiBoot[0].getBonusDefense()+EqiChestPlate[0].getBonusDefense() + EqiHelmet[0].getBonusDefense() + EqiLegging[0].getBonusDefense();
			 int MonsterDommage = monster.getDommage()- (DefHero/10);
			 if ((!(monster.getLife() < 1)) && act == true) {
			 System.out.print("\n");
			 System.out.print("The "+ monster.getName() +" attack you and inflict you "+ MonsterDommage +" dommages");
			 System.out.print("\n");
			 Hero1.setLife(Hero1.getLife() - MonsterDommage);
			 Thread.sleep(2000);
			 }
			 
		 }// end of while for fight 
		 return xp;
	}
}