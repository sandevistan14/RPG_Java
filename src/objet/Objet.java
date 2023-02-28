package objet;

import Armor.ChestPlate;
import Armor.Helmet;
import Armor.Legging;
import Armor.boot;
import jdr.AsciiArt;

public class Objet{
	String Name;
	String Type;
	String rarity;
	public Objet(String name, String type, String Rarity) {
		super();
		Name = name;
		Type = type;
		rarity = Rarity;
	}
	public String getRarity() {
		return rarity;
	}

	public void setRarity(String Rarity) {
		rarity = Rarity;
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	
	public static Objet drop(Objet[] inv) {
		int num = (int) (Math.random()*100);
		Objet obj = inv[num%inv.length];
		return obj;
	}
	@Override
	public String toString() {
		return "Objet [Name=" + Name + ", Type=" + Type + "]";
	}
	public static Objet[] CommunItem() {
		 Objet[] CommunLoot = new Objet[12];
		 CommunLoot[0] = new Arme("Sword","Arme",AsciiArt.ANSI_WHITE,15,0);
		 CommunLoot[1] = new Arme("Club","Arme",AsciiArt.ANSI_WHITE,20,0);
		 CommunLoot[2] = new Arme("Fly Swatter","Arme",AsciiArt.ANSI_WHITE,1,0);
		 CommunLoot[3] = new Arme("Dagger","Arme",AsciiArt.ANSI_WHITE,9,5);
		 CommunLoot[4] = new Artefact("Magma Rock","Artefact",AsciiArt.ANSI_WHITE,"Dommage",5);
		 CommunLoot[5] = new Potion("Small potion of healing","Potion",AsciiArt.ANSI_WHITE,20);
		 CommunLoot[6] = new Potion("Medium potion of healing","Potion",AsciiArt.ANSI_WHITE,40);
		 CommunLoot[7] = new Potion("Big potion of healing","Potion",AsciiArt.ANSI_WHITE,60);
		 CommunLoot[8] = new boot("StandarBoot","Boot",AsciiArt.ANSI_WHITE,0, 10, 0);
		 CommunLoot[9] = new Helmet("StandarHelmet", "Helmet",AsciiArt.ANSI_WHITE, 0, 10, 0);
		 CommunLoot[10] = new ChestPlate("StandarChestPlate","ChestPlate",AsciiArt.ANSI_WHITE, 0, 20, 0);
		 CommunLoot[11] = new Legging("StandarLegging", "Legging",AsciiArt.ANSI_WHITE, 0, 10, 0);
		return CommunLoot;
	}
 	
	public static Objet[] RareItem() {
		//rare objet
		 Objet[] RareLoot = new Objet[10];
		 RareLoot[0] = new Arme("Void Sword","Arme",AsciiArt.ANSI_BLUE,25,5);
		 RareLoot[1] = new Potion("Small potion of healing","Potion",AsciiArt.ANSI_BLUE,25);
		 RareLoot[2] = new Potion("Medium potion of healing","Potion",AsciiArt.ANSI_BLUE,45);
		 RareLoot[3] = new Potion("Big potion of healing","Potion",AsciiArt.ANSI_BLUE,65);
		 RareLoot[4] = new Arme("Heavy hammer","Arme",AsciiArt.ANSI_BLUE,30,0);
		 RareLoot[5] = new boot("Iron Boot","Boot",AsciiArt.ANSI_BLUE,0, 15, 0);
		 RareLoot[6] = new Helmet("Iron Helmet", "Helmet",AsciiArt.ANSI_BLUE, 0, 15, 0);
		 RareLoot[7] = new ChestPlate("Iron ChestPlate","ChestPlate",AsciiArt.ANSI_BLUE, 0, 25, 0);
		 RareLoot[8] = new Legging("Iron Legging", "Legging",AsciiArt.ANSI_BLUE, 0, 15, 0);
		 RareLoot[9] = new Artefact("Dragon Claw","Artefact",AsciiArt.ANSI_BLUE,"Dommage",10);
		return RareLoot;
	}
	public static Objet[] EpicItem() {
		 //epic objet
		 Objet[] EpicLoot = new Objet[10];
		 EpicLoot[0] = new Arme("Demon Sword","Arme",AsciiArt.ANSI_PURPLE,30,15);
		 EpicLoot[1] = new Potion("Small potion of healing","Potion",AsciiArt.ANSI_PURPLE,30);
		 EpicLoot[2] = new Potion("Medium potion of healing","Potion",AsciiArt.ANSI_PURPLE,50);
		 EpicLoot[3] = new Potion("Big potion of healing","Potion",AsciiArt.ANSI_PURPLE,70);
		 EpicLoot[4] = new Arme("Giant Sword","Arme",AsciiArt.ANSI_PURPLE,40,0);
		 EpicLoot[5] = new boot("Iriduum Boot","Boot",AsciiArt.ANSI_PURPLE,0, 20, 0);
		 EpicLoot[6] = new Helmet("Iridum Helmet", "Helmet",AsciiArt.ANSI_PURPLE, 0, 20, 0);
		 EpicLoot[7] = new ChestPlate("Iridium ChestPlate","ChestPlate",AsciiArt.ANSI_PURPLE, 0, 30, 0);
		 EpicLoot[8] = new Legging("Iridium Legging", "Legging",AsciiArt.ANSI_PURPLE, 0, 20, 0);
		 EpicLoot[9] = new Artefact("Dragon Eyes","Artefact",AsciiArt.ANSI_BLUE,"Dommage",15);
		return EpicLoot;
	}
	public static Objet[] LegendaryItem() {
		 //legendary objet
		 Objet[] LegendaryLoot = new Objet[3];
		 LegendaryLoot[0] = new Arme("Excalibur","Arme",AsciiArt.ANSI_YELLOW,50,20);
		 LegendaryLoot[1] = new Potion("An old potion of healing","Potion",AsciiArt.ANSI_YELLOW,999);
		 LegendaryLoot[2] = new Arme("Wood stick","Arme",AsciiArt.ANSI_YELLOW,70,0);
		return LegendaryLoot;
	}
	
}

