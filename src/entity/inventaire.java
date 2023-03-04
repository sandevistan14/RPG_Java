package entity;
import java.util.Objects;
import java.util.Scanner;
import Armor.ChestPlate;
import Armor.Helmet;
import Armor.Legging;
import Armor.boot;
import jdr.AsciiArt;
import objet.Arme;
import objet.Artefact;
import objet.Objet;
import objet.Potion;


public class inventaire{
	private objet.Arme[] InvArme;
	private int nbarme;
	
	private objet.Artefact[] InvArtefact;
	private int nbArtefact;
	
	private objet.Potion[] InvPotion;
	private int nbpotion;
	
	
	public inventaire(Arme[] invArme, int nbarme, Artefact[] invArtefact, int nbArtefact, Potion[] invPotion, int nbpotion) {
		this.InvArme = invArme = new objet.Arme[2];
		this.nbarme = nbarme = 0;

		this.InvArtefact = invArtefact = new objet.Artefact[3];
		this.nbArtefact = nbArtefact = 0;
		this.InvPotion = invPotion  = new objet.Potion[5];;
		this.nbpotion = nbpotion = 0;
	}
	
	public static Objet[] EquipObjet(Objet[] EqObjet, Objet Objet,int pos) {
		while(true) {
			System.out.print("\n");
			System.out.println("Are you sure to want to replace " + EqObjet[0].getRarity()+ EqObjet[0].getName()+ AsciiArt.ANSI_RESET + " by " + Objet.getRarity()+ Objet.getName() + AsciiArt.ANSI_RESET);
			System.out.println("- Yes");
			System.out.println("- No");
			System.out.print("\n");
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();
			
			if(str.equalsIgnoreCase("Yes")) {
				EqObjet[pos] = Objet;
				return EqObjet;
			}
			else if (str.equalsIgnoreCase("No")){
				return EqObjet;
			}
		}
	}
	
	public static Objet[] AddIntoInv(Objet[] TabObj,Objet obj) {
		while(true) {
			System.out.print("\n");
			System.out.print("Where do you want to equip ?(position)");
			System.out.println("\n");
			System.out.print("\n");
			for(int k = 1;k < TabObj.length+1; k += 1) {
				System.out.println("Place n°" + k + " -> Nom de l'objet : "+ TabObj[k-1].getRarity()+ TabObj[k-1].getName()+ AsciiArt.ANSI_RESET );
			}
			Scanner scan5 = new Scanner(System.in);
			String str5 = scan5.nextLine();
			try {
			for(int m = 0;m < TabObj.length; m += 1) {
				if(m+1 == Integer.parseInt(str5)) {
					TabObj[m] = obj;
					return TabObj;
				}
			  }
			 } catch (NumberFormatException e) {
				return TabObj;
			}
		}
	}
	
	
	
	@SuppressWarnings("unlikely-arg-type")
	public static void OpenInventory(Hero hero) {
		while(true) {

			System.out.print("\n");
			System.out.print("Hero HP : " + hero.getLife() + "/" + hero.getMaxHP());
			System.out.print("\n");
			System.out.println("Inventory :");
			System.out.print("\n");
			System.out.println("|------------------------|------------------------|------------------------|");
			System.out.println("|          Weapon :      |          Artefact :    |          Potion :      |");
			System.out.println("|------------------------|------------------------|------------------------|");
			System.out.println("|      Emplacement 1 :   |      Emplacement 1 :   |      Emplacement 1 :   |");
			System.out.println("|\t   "+hero.getInvArme()[0].getRarity()+ hero.getInvArme()[0].getName()+ AsciiArt.ANSI_RESET+" \t |\t"+ hero.getInvArtefact()[0].getRarity() + hero.getInvArtefact()[0].getName()+ AsciiArt.ANSI_RESET + "\t\t|\t  "+ hero.getInvPotion()[0].getRarity()+ hero.getInvPotion()[0].getName()+ AsciiArt.ANSI_RESET+   "\t\t|");
			System.out.println("|                        |                        |                        |");
			System.out.println("|      Emplacement 2 :   |      Emplacement 2 :   |      Emplacement 2 :   |");
			System.out.println("|\t   "+hero.getInvArme()[1].getRarity()+ hero.getInvArme()[1].getName()+ AsciiArt.ANSI_RESET+"   \t |\t   "+  hero.getInvArtefact()[2].getRarity() + hero.getInvArtefact()[2].getName()+ AsciiArt.ANSI_RESET+"\t\t|\t"+ hero.getInvPotion()[1].getRarity()+ hero.getInvPotion()[1].getName()+ AsciiArt.ANSI_RESET+ "\t\t|");
			System.out.println("|                        |                        |                        |");
			System.out.println("|                        |      Emplacement 3 :   |      Emplacement 3 :   |");
			System.out.println("|                        |\t   "+  hero.getInvArtefact()[2].getRarity() + hero.getInvArtefact()[2].getName()+ AsciiArt.ANSI_RESET+"\t\t|\t   "+ hero.getInvPotion()[2].getRarity()+ hero.getInvPotion()[2].getName()+ AsciiArt.ANSI_RESET+  "\t\t|");
			System.out.println("|                        |                        |                        |");
			System.out.println("|                        |                        |      Emplacement 4 :   |");
			System.out.println("|                        |                        |\t   "+ hero.getInvPotion()[3].getRarity()+ hero.getInvPotion()[3].getName()+ AsciiArt.ANSI_RESET+  "\t\t|");
			System.out.println("|                        |                        |                        |");
			System.out.println("|                        |                        |      Emplacement 5 :   |");
			System.out.println("|                        |                        |\t   "+ hero.getInvPotion()[4].getRarity()+ hero.getInvPotion()[4].getName()+ AsciiArt.ANSI_RESET+  "\t\t|");
			System.out.println("|                        |                        |                        |");	
			System.out.println("|------------------------|------------------------|------------------------|");
			System.out.print("\n");
			System.out.println("Equip Stuff : ");
			System.out.print("\n");
			System.out.println("Hemet : "+hero.getEqiHelmet()[0].getRarity() + hero.getEqiHelmet()[0].getName()+ AsciiArt.ANSI_RESET);
			System.out.println("ChestPlate : "+hero.getEqiChestPlate()[0].getRarity()+hero.getEqiChestPlate()[0].getName()+ AsciiArt.ANSI_RESET);
			System.out.println("Legging : " +hero.getEqiLegging()[0].getRarity()+ hero.getEqiLegging()[0].getName()+ AsciiArt.ANSI_RESET);
			System.out.println("Boot : "+hero.getEqiBoot()[0].getRarity()+ hero.getEqiBoot()[0].getName()+ AsciiArt.ANSI_RESET);
			System.out.println("");
			System.out.println("Weapon : "+hero.getEqiArme()[0].getRarity()+ hero.getEqiArme()[0].getName()+ AsciiArt.ANSI_RESET);
			System.out.println("");
			System.out.println("What do you want to do ?");
			System.out.println("- Leave");
			System.out.println("- Equip");
			System.out.println("- Use potion");
			System.out.print("\n");
			System.out.print("\n");
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();
			if(str.equalsIgnoreCase("Use potion")) {
				while(true) {
					System.out.println("Whitch potion do you want to use ?");
					System.out.print(" - Leave");
					System.out.print("\n");
					Scanner scan4 = new Scanner(System.in);
					String str4 = scan4.nextLine();
					if(str4.equalsIgnoreCase("Leave")) {
						break;
					}
					for(int i = 0;i < hero.getInvPotion().length;i+=1) {
						if(i+1 == Integer.parseInt(str4)) {
							if(hero.getInvPotion()[i].getName() == "vide") {
								System.out.println("There is not a potion in this emplacement");
							}
							else {
								hero.setLife(hero.getLife()+hero.getInvPotion()[i].getHeal());
								System.out.println("you use a Potion of Healing and earn "+hero.getInvPotion()[i].getHeal());
								if(hero.getLife()>hero.getMaxHP()) {
									hero.setLife(hero.getMaxHP());
								}
								hero.setInvPotion( new Potion("vide", "vide",AsciiArt.ANSI_WHITE, 0),1);
							}
						}//end if name = str4
					}//end for i in InvPotion
					break;
				}
			}
			
			if(str.equalsIgnoreCase("Leave")){break;}
			
			if(str.equalsIgnoreCase("Equip")) {
				System.out.print("\n");
				System.out.println("what do yo want to equip ?");
				System.out.println("- Weapon");
				Scanner scan2 = new Scanner(System.in);
				String str2 = scan2.nextLine();
				if(str2.equalsIgnoreCase("Weapon")) {
					boolean breaker = false;
					while(true) {
						System.out.println("Whitch weapon do you want to equip ?");
						System.out.print("\n");
						Scanner scan3 = new Scanner(System.in);
						String str3 = scan3.nextLine();
						for(int i = 0;i < hero.getInvArme().length;i+=1) {
							if(hero.getInvArme()[i].getName().equalsIgnoreCase(str3)) {
								hero.setEqiArmetab((Arme[]) EquipObjet(hero.getEqiArme(),hero.getInvArme()[i],i));
								breaker = true;
								break;
							}//end if name = str3
						}//end for i in InvArme
						if(breaker == true) {
							breaker = false;
							break;
						}
					}//end while true arme
				}//end if str2 == weapon
			}//end if str == equip
		}// end while inventory
	}//end open inventory
}//end public class inventaire