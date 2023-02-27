package jdr;

import java.util.Scanner;

import entity.Hero;
import entity.Monster;

public class Fight{
	
	public static int fight(Hero Hero1,Monster monster,int xp,char[][] mapmonster) throws InterruptedException {
		 boolean Flee = true;

		 if(xp == -50) {
			 Flee = false;
		 }
		 
		 //text
		 char premierCaractere = Text.StartFightMessage(monster);
		 
		 //speed
		 boolean speed = false;
		 if(monster.getSpeed() > Hero1.getSpeed()){
			 speed = true;
		 }
		 if(speed == true) {
			 speed = false;
			 System.out.print("\n");
			 System.out.println("The Monster Have more speed than you so he attack in first !");
			 System.out.print("\n");
			 System.out.println("The "+ monster.getName() +" attack you and inflict you "+ monster.getDommage()+" dommages");
			 System.out.print("\n");
			 Hero1.setLife(Hero1.getLife() - monster.getDommage());
			 Thread.sleep(2000);
		 }
		 else {
			 System.out.println("\n");
			 System.out.print("You have more speed than the Monster so you attack in first !");
			 System.out.println("\n");
		 }
		 while(true) {

			 boolean act = false;
			 if (monster.getLife() < 1) {
				 System.out.print("\n");
				 System.out.print("Congrats you kill the monster !");
				 System.out.print("\n");
				 System.out.print("You earn "+ monster.getXp()+" xp !");
				 System.out.print("\n");
				 System.out.print("\n");
				 monster.setPosX(0);
				 monster.setPosY(0);
				 Thread.sleep(4000);
				 xp = monster.getXp();
				 mapmonster[Hero1.getPosY()][Hero1.getPosX()-1] = ' ';
				 break;
			 }
			 //if you get kill : Game Over
			 if (Hero1.getLife() < 1) {
				 AsciiArt.PrintDead();
				 xp = -69;// to know that you have been killed in the return
		         break;}
			 
			 if(premierCaractere == 'M') {AsciiArt.PrintMotherOfDeath(monster);}
			 if(premierCaractere == 'D') {AsciiArt.PrintRedEyesDragon(monster);}
			 if(premierCaractere == 'W') {AsciiArt.PrintWolf(monster);}
			 if(premierCaractere == 'S') {double num = Math.random()*100;
				 if(num > 90) {AsciiArt.PrintMiddleFinger(monster);}
				 if(num <= 90) {AsciiArt.PrintSlime(monster);}}
			 AsciiArt.PrintAction(Hero1,Flee);//show possible actions
			 
			 
			 Scanner sc4 = new Scanner(System.in);
			 String str4 = sc4.nextLine();

			 
			 if(str4.equals("Attack")) {
				 monster.setLife(monster.getLife()- (Hero1.getDommage()));
				 System.out.print("\n");
				 System.out.print("You attack "+ monster.getName() +" and inflict "+ Hero1.getDommage()+" dommages");
				 System.out.print("\n");
				 act = true;
			 }
			 
			 if(str4.equals("Flee") && Flee == true) {
				 xp = 0;
				 break;
			 }
			 
			 if ((!(monster.getLife() < 1)) && act == true) {
			 System.out.print("\n");
			 System.out.print("The "+ monster.getName() +" attack you and inflict you "+ monster.getDommage()+" dommages");
			 System.out.print("\n");
			 Hero1.setLife(Hero1.getLife() - monster.getDommage());
			 Thread.sleep(2000);
			 }
			 
		 }// end of while for fight 
		 return xp;
	}
}