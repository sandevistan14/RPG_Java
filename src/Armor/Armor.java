package Armor;

import objet.Objet;

public class Armor extends Objet{
	
	int bonusLife;
	int bonusDefense;
	int ReturnDommage;

	public Armor(String name, String type, int bonusLife, int bonusDefense, int returnDommage) {
		super(name, type);
		this.bonusLife = bonusLife;
		this.bonusDefense = bonusDefense;
		ReturnDommage = returnDommage;
	}


	public int getBonusLife() {
		return bonusLife;
	}


	public void setBonusLife(int bonusLife) {
		this.bonusLife = bonusLife;
	}


	public int getBonusDefense() {
		return bonusDefense;
	}


	public void setBonusDefense(int bonusDefense) {
		this.bonusDefense = bonusDefense;
	}


	public int getReturnDommage() {
		return ReturnDommage;
	}


	public void setReturnDommage(int returnDommage) {
		ReturnDommage = returnDommage;
	}
	
	
	
}