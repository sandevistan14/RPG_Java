package Armor;

import objet.Objet;

public class Armor extends Objet{
	
	int bonusLife;
	int bonusDefense;
	int ReturnDommage;

	public Armor(String name, String type,String Rarity, int bonusLife, int bonusDefense, int returnDommage) {
		super(name, type,Rarity);
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


	@Override
	public String toString() {
		return "Armor [bonusLife=" + bonusLife + ", bonusDefense=" + bonusDefense + ", ReturnDommage=" + ReturnDommage
				+ "]";
	}
	
	
	
}