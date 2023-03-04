package entity;

import java.util.Scanner;

import Armor.ChestPlate;
import Armor.Helmet;
import Armor.Legging;
import Armor.boot;
import jdr.AsciiArt;
import objet.Arme;
import objet.Artefact;
import objet.Potion;

public class Hero extends Entity{
	
	Arme[] InvArme = new Arme[2];
	Arme[] EqiArme = new Arme[1];
	boot[] EqiBoot = new boot[1];
	Helmet[] EqiHelmet = new Helmet[1];
	ChestPlate[] EqiChestPlate = new ChestPlate[1];
	Legging[] EqiLegging = new Legging[1];
	Artefact[] InvArtefact = new Artefact[3];
	Potion[] InvPotion = new Potion[5];
	int ReturnX;
	int ReturnY;
	int MaxHP;
	int xp = 0;
	int xpreq = 40;
	int level = 1;
	
	public Hero(char lettre, String name, 
			
			int posY, int posX, int dommage, int life,
			
			int defense, int speed,
			
			int ReturnX,int ReturnY, int MaxHp) {
		
		super(lettre, name, posY, posX, dommage, life, defense,speed);
	}

	
	public void setInvArme(Arme arme,int pos) {
		InvArme[pos] = arme;
	}


	public void setEqiArme(Arme Arme, int pos) {
		EqiArme[pos] = Arme;
	}


	public void setEqiBoot(boot Boot, int pos) {
		EqiBoot[pos] = Boot;
	}

	
	public void setEqiHelmet(Helmet Helmet, int pos) {
		EqiHelmet[0] = Helmet;
	}

	
	public void setEqiChestPlate(ChestPlate ChestPlate, int pos) {
		EqiChestPlate[pos] = ChestPlate;
	}


	public void setEqiLegging(Legging Legging, int pos) {
		EqiLegging[pos] = Legging;
	}

	public void setInvArtefact(Artefact Artefact, int pos) {
		InvArtefact[pos] = Artefact;
	}


	public void setInvPotion(Potion potions,int pos) {
		InvPotion[pos] =  potions;
	}

	public Arme[] getInvArme() {
		return InvArme;
	}

	public void setInvArmetab(Arme[] invArme) {
		InvArme = invArme;
	}

	public Arme[] getEqiArme() {
		return EqiArme;
	}

	public void setEqiArmetab(Arme[] eqiArme) {
		EqiArme = eqiArme;
	}

	public boot[] getEqiBoot() {
		return EqiBoot;
	}

	public void setEqiBoottab(boot[] eqiBoot) {
		EqiBoot = eqiBoot;
	}

	public Helmet[] getEqiHelmet() {
		return EqiHelmet;
	}

	public void setEqiHelmettab(Helmet[] eqiHelmet) {
		EqiHelmet = eqiHelmet;
	}

	public ChestPlate[] getEqiChestPlate() {
		return EqiChestPlate;
	}

	public void setEqiChestPlatetab(ChestPlate[] eqiChestPlate) {
		EqiChestPlate = eqiChestPlate;
	}

	public Legging[] getEqiLegging() {
		return EqiLegging;
	}

	public void setEqiLeggingtab(Legging[] eqiLegging) {
		EqiLegging = eqiLegging;
	}

	public Artefact[] getInvArtefact() {
		return InvArtefact;
	}

	public void setInvArtefacttab(Artefact[] invArtefact) {
		InvArtefact = invArtefact;
	}

	public Potion[] getInvPotion() {
		return InvPotion;
	}

	public void setInvPotiontab(Potion[] invPotion) {
		InvPotion = invPotion;
	}

	public int getReturnX() {
		return ReturnX;
	}
	public void setReturnX(int returnX) {
		ReturnX = returnX;
	}
	public int getReturnY() {
		return ReturnY;
	}
	public void setReturnY(int returnY) {
		ReturnY = returnY;
	}
	
	public int getMaxHP() {
		return MaxHP;
	}
	public void setMaxHP(int maxHP) {
		MaxHP = maxHP;
	}
	public int getXp() {
		return xp;
	}
	public void setXp(int xp) {
		this.xp = xp;
	}
	public int getXpreq() {
		return xpreq;
	}
	public void setXpreq(int xpreq) {
		this.xpreq = xpreq;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public static boolean SetHeroClass(Hero Hero1) {
		//*****************************************************************************
		//*******************************     Hero     ********************************
		//*****************************************************************************	
		boolean IsClass = false;
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
	        
	        if (classs.equalsIgnoreCase("Paladins")){
	        	Hero1.setName("Paladins");
	        	Hero1.setDommage(20);
	        	Hero1.setLife(120);
	        	Hero1.setDefense(50);
	        	Hero1.setSpeed(5);
	        	Hero1.setMaxHP(120);
	        	IsClass = true;}
	        
	        if (classs.equalsIgnoreCase("Paladins info")){System.out.println("Dommage : 20, LifePoint : 120 defence : 50, good at sword and user of heal magic");}
	        
	        if (classs.equalsIgnoreCase("Archer")){
	        	Hero1.setName("Archer");
	        	Hero1.setDommage(40);
	        	Hero1.setLife(80);
	        	Hero1.setDefense(20);
	        	Hero1.setSpeed(0);
	        	Hero1.setMaxHP(80);
	        	IsClass = true;}
	        
	        if (classs.equalsIgnoreCase("Archer info")){System.out.println("Dommage : 20, LifePoint : 120 defence : 50, powerfull user of magic");}
	        
	        if (classs.equalsIgnoreCase("Chevalier")){
	        	Hero1.setName("Chevalier");
	        	Hero1.setDommage(30);
	        	Hero1.setLife(100);
	        	Hero1.setDefense(40);
	        	Hero1.setSpeed(5);
	        	Hero1.setMaxHP(100);
	        	IsClass = true;}
	        
	        if (classs.equalsIgnoreCase("Chevalier info")){System.out.println("0,0,30,100,40");}
	        
	        if (classs.equalsIgnoreCase("Mage")){
	        	Hero1.setName("Mage");
	        	Hero1.setDommage(40);
	        	Hero1.setLife(70);
	        	Hero1.setDefense(0);
	        	Hero1.setSpeed(0);
	        	Hero1.setMaxHP(70);
	        	IsClass = true;}
	        if (classs.equalsIgnoreCase("Mage info")){System.out.println("Dommage : 40, LifePoint : 70 defence : 0, powerfull user of magic");}
	        
	        if (classs.equalsIgnoreCase("Assassin")){
	        	Hero1.setName("Assassin");
	        	Hero1.setDommage(50);
	        	Hero1.setLife(80);
	        	Hero1.setDefense(0);
	        	Hero1.setSpeed(15);
	        	Hero1.setMaxHP(80);
	        	IsClass = true;}
	        if (classs.equalsIgnoreCase("Assassin info")){System.out.println("Dommage : 50, LifePoint : 80 defence : 0, powerfull slayer");}
        }
		return IsClass; 
	}
	public void LevelUp () throws InterruptedException {
		 while(this.getXp() >= this.getXpreq()) {

			 this.setXp(this.getXp() - this.getXpreq());
			 this.setXpreq(this.getXpreq() + 10);
			 this.setLevel(this.getLevel()+1);
			 this.setLife(this.getLife()+10);
			 this.setMaxHP(this.getMaxHP()+10);
			 this.setDommage(this.getDommage()+5);
			 this.setDefense(this.getDefense()+5);
			 System.out.print("\n");
			 System.out.print("\n");
			 System.out.print(AsciiArt.ANSI_YELLOW + "Congrats level UP ! Your now level :");
			 System.out.print(this.getLevel());
			 System.out.print("\n");
			 System.out.print("+10 HP, +10 MaxHp , +10 Dommage, +5 Defense");
			 System.out.print("\n" + AsciiArt.ANSI_RESET);
			 Thread.sleep(4000);//sleep
		 }
	}
}
	
		
