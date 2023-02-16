package jdr;

import java.util.Scanner;

import entity.Hero;
import entity.Monster;

public class Fight{
	
	public static int fight(Hero Hero1,Monster monster,int xp,char[][] mapmonster) throws InterruptedException {
		 String nom = monster.getName();  
		 char premierCaractere = nom.charAt(0);
		 if(premierCaractere == 'S') {
			 System.out.print("Oh no ! a slime bloc your way !");
		 }
		 if(premierCaractere == 'D') {
			 System.out.print("Oh no ! a Dragon bloc your way !");
		 }
		 if(premierCaractere == 'M') {
			 System.out.print("You found the secret boss the mother of death");
		 }
		 if(premierCaractere == 'W') {
			 System.out.print("Oh no ! An angry wolf block you way !");
		 }
		 while(true) {
			 boolean act = false;
			 if (monster.getLife() < 1) {
				 System.out.print("\n");
				 System.out.print("Congrats you kill the monster !");
				 System.out.print("\n");
				 System.out.print("You earn 20xp !");
				 System.out.print("\n");
				 System.out.print("\n");
				 Thread.sleep(4000);
				 xp += 20;
				 mapmonster[Hero1.getPosY()][Hero1.getPosX()-1] = ' ';
				 break;
			 }
			 //if you get kill : Game Over
			 if (Hero1.getLife() < 1) {
				 AsciiArt.PrintDead();
				 xp = -69;// to know that you have been killed in the return
		         break;}
			 
			 if(premierCaractere == 'M') {AsciiArt.PrintMotherOfDeath(monster);}
			 if(premierCaractere == 'D') {AsciiArt.PrintDragon(monster);}
			 if(premierCaractere == 'W') {AsciiArt.PrintWolf(monster);}
			 if(premierCaractere == 'S') {double num = Math.random()*100;
				 if(num > 90) {AsciiArt.PrintMiddleFinger(monster);}
				 if(num <= 90) {AsciiArt.PrintSlime(monster);}}
			 
			 AsciiArt.PrintAction(Hero1);//show possible actions
			 
			 
			 Scanner sc4 = new Scanner(System.in);
			 String str4 = sc4.nextLine();
			 
			 if(str4.equals("Attack")) {
				 monster.setLife(monster.getLife()- (Hero1.getDommage()));
				 System.out.print("\n");
				 System.out.print("You attack "+ monster.getName() +" and inflict "+ Hero1.getDommage()+" dommages");
				 System.out.print("\n");
				 act = true;
			 }
			 
			 if(str4.equals("Flee")) {
				 break;
			 }
			 
			 if ((!(monster.getLife() < 1)) && act == true) {
			 System.out.print("\n");
			 System.out.print("The "+ monster.getName() +" attack you and inflict you "+ monster.getDommage()+" dommages");
			 System.out.print("\n");
			 Hero1.setLife(Hero1.getLife() - monster.getDommage());
			 Thread.sleep(4000);
			 }
			 
		 }// end of while for fight 
		 return xp;
	}
}