package entity;
import Armor.ChestPlate;
import Armor.Helmet;
import Armor.Legging;
import Armor.boot;
import objet.Arme;
import objet.Potion;
import objet.artefact;

public class inventaire{
	private objet.Arme[] InvArme;
	private int nbarme;
	
	private objet.artefact[] InvArtefact;
	private int nbArtefact;
	
	private objet.Potion[] InvPotion;
	private int nbpotion;
	
	
	public inventaire(Arme[] invArme, int nbarme, artefact[] invArtefact, int nbArtefact, Potion[] invPotion, int nbpotion) {
		this.InvArme = invArme = new objet.Arme[2];
		this.nbarme = nbarme = 0;

		this.InvArtefact = invArtefact = new objet.artefact[3];
		this.nbArtefact = nbArtefact = 0;
		this.InvPotion = invPotion  = new objet.Potion[5];;
		this.nbpotion = nbpotion = 0;
	}
	
	public void OpenInventory() {
		while(true) {
		System.out.println("Inventory :");
		System.out.print("\n");
		System.out.println("|------------------------|------------------------|------------------------|");
		System.out.println("|          Arme :        |          Artefact :    |          Potion :      |");
		System.out.println("|------------------------|------------------------|------------------------|");
		System.out.println("|      Emplacement 1 :   |      Emplacement 1 :   |      Emplacement 1 :   |");
		System.out.println("|\t   "+ InvArme[0]+" \t |\t"+ InvArtefact[0]+ "\t|\t  "+ InvPotion[0]+   "|");
		System.out.println("|                        |\t                      |                        |");
		System.out.println("|      Emplacement 2 :   |      Emplacement 2 :   |      Emplacement 2 :   |");
		System.out.println("|\t   "+ InvArme[1]+"   \t |\t   "+ InvArtefact[1]+"\t|\t"+ InvPotion[1]+ "|");
		System.out.println("|                        |                        |                        |");
		System.out.println("|                        |      Emplacement 3 :   |      Emplacement 3 :   |");
		System.out.println("|                        |\t   "+ InvArtefact[2]+"|\t   "+ InvPotion[2]+  "|");
		System.out.println("|                        |                        |                       |");
		System.out.println("|                        |                        |      Emplacement 4 :   |");
		System.out.println("|                        |                        |\t   "+ InvPotion[3]+  "|");
		System.out.println("|                        |                        |                        |");
		System.out.println("|                        |                        |      Emplacement 5 :   |");
		System.out.println("|                        |                        |\t   "+ InvPotion[4]+  "|");
		System.out.println("|                        |                        |                        |");	
		System.out.println("|------------------------|------------------------|------------------------|");
		break;
		}
	}
	
	
	
}