package entity;

import java.util.Scanner;

public class Hero extends Entity{
	int ReturnX;
	int ReturnY;
	int MaxHP;
	public Hero(char lettre, String name, int posY, int posX, int dommage, int life, int defense, int speed, int ReturnX,int ReturnY, int MaxHp) {
		super(lettre, name, posY, posX, dommage, life, defense,speed);
		// TODO Auto-generated constructor stub
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
}
	
		
