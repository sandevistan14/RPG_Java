package entity;
import java.util.Objects;
import java.util.Scanner;
import Armor.ChestPlate;
import Armor.Helmet;
import Armor.Legging;
import Armor.boot;
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
	
	public Objet[] EquipObjet(Objet[] EqObjet, Objet Objet,int pos) {
		while(true) {
			System.out.print("\n");
			System.out.println("voulez vous remplacez " + EqObjet[1] + " par " + Objet);
			System.out.print("\n");
			System.out.print("Si vous voulez plus d'info sur les Objet tapez 'info <nomarme>'");
			System.out.print("\n");
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();
			
			if(str.equals("yes")) {
				EqObjet[pos] = Objet;
				return EqObjet;
			}
		}
	}
	
	public Objet[] AddIntoInv(Objet[] TabObj,Objet obj) {
		System.out.print("\n");
		System.out.print("Voulez vous le mettre dans votre inventaire ?");
		System.out.print("\n");
		while(true) {
			Scanner scan4 = new Scanner(System.in);
			String str4 = scan4.nextLine();
			if(str4.equals("Yes")) {
				for(int i = 0;i < TabObj.length; i += 1) {
					if(Objects.isNull(TabObj[i])) {
						TabObj[i] = obj;
					}
					else if(TabObj[i].getName() == "vide") {
						TabObj[i] = obj;
					}
				}
				while(true) {
					System.out.print("\n");
					System.out.print("Votre inventaire est plein a quel place voulez vous l'equipe ");
					System.out.println("(Si vous remplacez un objet il sera définitivement supprimer)");
					System.out.print("\n");
					for(int i = 0;i < TabObj.length; i += 1) {
						System.out.print("Place n°" + i+1 + "Nom de l'arme :"+ TabObj[i].getName());
					}
					Scanner scan5 = new Scanner(System.in);
					String str5 = scan5.nextLine();
					for(int i = 0;i < TabObj.length; i += 1) {
						if(i+1 == Integer.parseInt(str5)) {
							TabObj[i] = obj;
							return TabObj;
						}
						
					}
					
				}
			}
			if(str4.equals("No")) {
				return TabObj;
			}
		}
	}
	
	
	
	public void OpenInventory(Objet[] InvArme, Objet[] EquipWeapon, Objet[] InvArtefact, Objet[] InvPotion) {
		Objet[] TempInvArme = new Arme[2];
		Objet[] TempInvArtefact = new Artefact[3];
		Objet[] TempInvPotion = new Potion[5];
		
		while(true) {
				// check if Arme is null or not and if it's null send empty
				for(int i = 0;i < InvArme.length; i += 1) {if (Objects.isNull(InvArme[i])) {TempInvArme[i] = new Arme("vide", "vide", 0, 0); }else {TempInvArme[i] = InvArme[i];}}
				
				// check if Artefact is null or not and if it's null send empty
				for(int i = 0;i < InvArtefact.length; i += 1) {if (Objects.isNull(InvArtefact[i])) {TempInvArtefact[i] = new Artefact("vide", "vide", "vide", 0); }else {TempInvArtefact[i] = InvArtefact[i];}}
				
				// check if Potion is null or not and if it's null send empty
				for(int i = 0;i < InvPotion.length; i += 1) {if (Objects.isNull(InvPotion[i])) {TempInvPotion[i] = new Potion("vide", "vide", 0); }else {TempInvPotion[i] = InvPotion[i];}}
				
			System.out.println("Inventory :");
			System.out.print("\n");
			System.out.println("|------------------------|------------------------|------------------------|");
			System.out.println("|          Weapon :      |          Artefact :    |          Potion :      |");
			System.out.println("|------------------------|------------------------|------------------------|");
			System.out.println("|      Emplacement 1 :   |      Emplacement 1 :   |      Emplacement 1 :   |");
			System.out.println("|\t   "+ TempInvArme[0].getName()+" \t |\t"+ TempInvArtefact[0].getName()+ "\t|\t  "+ TempInvPotion[0].getName()+   "|");
			System.out.println("|                        |                        |                        |");
			System.out.println("|      Emplacement 2 :   |      Emplacement 2 :   |      Emplacement 2 :   |");
			System.out.println("|\t   "+ TempInvArme[1].getName()+"   \t |\t   "+ TempInvArtefact[1].getName()+"|\t"+ TempInvPotion[1].getName()+ "  |");
			System.out.println("|                        |                        |                        |");
			System.out.println("|                        |      Emplacement 3 :   |      Emplacement 3 :   |");
			System.out.println("|                        |\t   "+ TempInvArtefact[2].getName()+"|\t   "+ TempInvPotion[2].getName()+  "|");
			System.out.println("|                        |                        |                        |");
			System.out.println("|                        |                        |      Emplacement 4 :   |");
			System.out.println("|                        |                        |\t   "+ TempInvPotion[3].getName()+  "|");
			System.out.println("|                        |                        |                        |");
			System.out.println("|                        |                        |      Emplacement 5 :   |");
			System.out.println("|                        |                        |\t   "+ TempInvPotion[4].getName()+  "|");
			System.out.println("|                        |                        |                        |");	
			System.out.println("|------------------------|------------------------|------------------------|");
			System.out.print("\n");
			System.out.println("What do you want to do ?");
			System.out.println("- Leave");
			System.out.println("- Equip");
			System.out.print("\n");
			System.out.print("\n");
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();
			
			if(str.equals("Leave")){break;}
			if(str.equals("Equip")) {
				System.out.print("\n");
				Scanner scan2 = new Scanner(System.in);
				String str2 = scan2.nextLine();
				System.out.println("what do yo want to equip ?");
				System.out.println("- Weapon");
				if(str2.equals("Weapon")) {
					while(true) {
						System.out.println("Whitch weapon do you want to equip ?");
						System.out.print("\n");
						Scanner scan3 = new Scanner(System.in);
						String str3 = scan2.nextLine();
						for(int i = 0;i < TempInvArme.length;i+=1) {
							if(TempInvArme[i].getName().equals(str3)) {
								EquipWeapon = (Arme[]) EquipObjet(EquipWeapon,TempInvArme[i],i);
							}//end if name = str3
						}//end for i in InvArme
					}//end while true arme
				}//end if str2 == weapon
			}//end if str == equip
		}// end while inventory
	}//end open inventory
}//end public class inventaire