package Armor;

public class Armor{
	
	int bonusLife;
	int bonusDefense;
	int ReturnDommage;
	
	
	public Armor(int bonusLife, int bonusDefense, int returnDommage) {
		super();
		this.bonusLife = bonusLife;
		this.bonusDefense = bonusDefense;
		this.ReturnDommage = returnDommage;
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