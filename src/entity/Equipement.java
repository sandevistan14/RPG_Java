package entity;

import java.util.Scanner;

import Armor.ChestPlate;
import Armor.Helmet;
import Armor.Legging;
import Armor.boot;
import objet.Arme;
import objet.Objet;

public class Equipement{

	private objet.Arme[] InvArme;
	private int nbarme;
	
	private Armor.boot[] Invboot;
	private int nbboot;
	private Armor.Legging[] InvLegging;
	private int nblegging;
	private Armor.ChestPlate[] invChestPlate;
	private int nbChestPlate;
	private Armor.Helmet[] invHelmet;
	private int nbHelmet;
	
	
	public Equipement(Arme[] invArme, int nbarme,boot[] invboot, int nbboot, Legging[] invLegging, int nblegging, ChestPlate[] invChestPlate,
			int nbChestPlate, Helmet[] invHelmet, int nbHelmet) {
		
		this.InvArme = invArme = new objet.Arme[2];
		this.nbarme = nbarme = 0;
		
		this.Invboot = invboot = new Armor.boot[1];
		this.nbboot = nbboot = 0;
		this.InvLegging = invLegging = new Armor.Legging[1];
		this.nblegging = nblegging = 0;
		this.invChestPlate = invChestPlate = new Armor.ChestPlate[1];
		this.nbChestPlate = nbChestPlate = 0;
		this.invHelmet = invHelmet = new Armor.Helmet[1];
		this.nbHelmet = nbHelmet = 0;
	}	
	
	
}