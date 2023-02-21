package entity;
import Armor.ChestPlate;
import Armor.Helmet;
import Armor.Legging;
import Armor.boot;
import objet.Arme;
import objet.Artefact;
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
	
	public void OpenInventory(Arme[] InvArme, Artefact[] InvArtefact, Potion[] InvPotion) {
		while(true) {
		System.out.println("Inventory :");
		System.out.print("\n");
		System.out.println("|------------------------|------------------------|------------------------|");
		System.out.println("|          Arme :        |          Artefact :    |          Potion :      |");
		System.out.println("|------------------------|------------------------|------------------------|");
		System.out.println("|      Emplacement 1 :   |      Emplacement 1 :   |      Emplacement 1 :   |");
		System.out.println("|\t   "+ InvArme[0].getName()+" \t |\t"+ InvArtefact[0].getName()+ "\t|\t  "+ InvPotion[0].getName()+   "|");
		System.out.println("|                        |\t                      |                        |");
		System.out.println("|      Emplacement 2 :   |      Emplacement 2 :   |      Emplacement 2 :   |");
		System.out.println("|\t   "+ InvArme[1].getName()+"   \t |\t   "+ InvArtefact[1].getName()+"|\t"+ InvPotion[1].getName()+ "  |");
		System.out.println("|                        |                        |                        |");
		System.out.println("|                        |      Emplacement 3 :   |      Emplacement 3 :   |");
		System.out.println("|                        |\t   "+ InvArtefact[2].getName()+"|\t   "+ InvPotion[2].getName()+  "|");
		System.out.println("|                        |                        |                        |");
		System.out.println("|                        |                        |      Emplacement 4 :   |");
		System.out.println("|                        |                        |\t   "+ InvPotion[3].getName()+  "|");
		System.out.println("|                        |                        |                        |");
		System.out.println("|                        |                        |      Emplacement 5 :   |");
		System.out.println("|                        |                        |\t   "+ InvPotion[4].getName()+  "|");
		System.out.println("|                        |                        |                        |");	
		System.out.println("|------------------------|------------------------|------------------------|");
		break;
		}
	}
	
	
	
}